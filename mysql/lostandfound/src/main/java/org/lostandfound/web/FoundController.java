package org.lostandfound.web;


import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.service.FoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FoundController {

    @Autowired
    private FoundService foundService;

    @RequestMapping(value = "inputfound",method = RequestMethod.GET)
    public String  queryByFoundthings(String foundthings, Model model){
        if(foundthings!=null){
            List<Lost> losts = foundService.queryByFoundthings(foundthings);
            System.out.println(losts);
            if(losts!=null){
                model.addAttribute("losts",losts);
                return "user/lostlist";
            }else{
                return  "found";
            }
        }else{
            return "found";
        }
    }

    @RequestMapping(value = "insertfound",method = RequestMethod.POST)
    public String insertFound(Found found){
        if(found!=null){
            foundService.insertFound(found);
            return "user/found";
        }else{
            return "error";
        }
    }
}
