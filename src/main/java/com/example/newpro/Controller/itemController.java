package com.example.newpro.Controller;

import com.example.newpro.Service.ItemService;
import com.example.newpro.models.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class itemController {
    @Autowired
    public ItemService service;

    @GetMapping("/index")
    public ModelAndView index(@ModelAttribute("item") Items itema){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("list_item",this.service.getAllItem()) ;
        return modelAndView;

    }


    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") String ids) {
        ModelAndView modelAndView = new ModelAndView("index");
        int id = Integer.parseInt(ids);
        modelAndView.addObject("item",this.service.getItemById(id)) ;
        modelAndView.addObject("list_item",this.service.getAllItem()) ;
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute("item") Items item) {
        ModelAndView modelAndView = new ModelAndView("redirect:/item/index");
        item.setStatus(0);
        if(item.getId() == null){
            this.service.addItem(item);
        }else {
            this.service.updateItem(item);
        }
        return modelAndView;
    }

}
