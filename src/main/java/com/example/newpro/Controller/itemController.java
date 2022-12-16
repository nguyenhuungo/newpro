package com.example.newpro.Controller;

import com.example.newpro.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class itemController {
    @Autowired
    public ItemService service;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("list_item",this.service.getAllItem()) ;
        return modelAndView;

    }


    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") String ids) {
        ModelAndView modelAndView = new ModelAndView("update");
        int id = Integer.parseInt(ids);
        modelAndView.addObject("item",this.service.getItemById(id)) ;
        System.out.println("123"+this.service.getItemById(id));
        return modelAndView;
    }
}
