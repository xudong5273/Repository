package org.lostandfound.web;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LostController {

    @Autowired
    private LostService LostService;

    @RequestMapping(value = "inputlost",method = RequestMethod.GET)
    public String  queryByLostthings(String lostthings, Model model){
        if(lostthings!=null){
            List<Found> founds = LostService.queryByLostthings(lostthings);
            System.out.println(founds);
            if(founds!=null){
                model.addAttribute("founds",founds);
                return "user/foundlist";
            }else{
                return  "lost";
            }
        }else{
            return "lost";
        }
    }

    @RequestMapping(value = "insertlost",method = RequestMethod.POST)
    public String insertLost(Lost lost){
        if(lost!=null){
            LostService.insertLost(lost);
            return "user/lost";
        }else{
            return "error";
        }
    }
}
