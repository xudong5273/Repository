package org.lostandfound.web;

import org.lostandfound.service.FoundService;
import org.lostandfound.service.LostService;
import org.lostandfound.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SumController {

    @Autowired
    private LostService lostService;

    @Autowired
    private FoundService foundService;

    @Autowired
    private SumService sumService;

    @RequestMapping(value = "user/sum",method = RequestMethod.GET)
    public String queryByFoundthings(Model model){
        List<ResultDto> resultDtos = sumService.getResultDto();
        model.addAttribute("resultDtos",resultDtos);
        return "user/sum";
    }
}
