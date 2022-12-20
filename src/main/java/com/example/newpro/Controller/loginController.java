package com.example.newpro.Controller;

import com.example.newpro.Service.UserSevice;
import com.example.newpro.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {
    @Autowired
    private UserSevice userSevice;
    @GetMapping("/login")
    public ModelAndView index(@ModelAttribute("user") Users user){
        return new ModelAndView("login");

    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("user") Users user){
        ModelAndView modelAndView = new ModelAndView();
        String pass = user.getPassword();
        String username = user.getUsername();
        Users u = this.userSevice.getItemByUsernameAndPass(username,pass);
        if( u== null){
            modelAndView.addObject("error", "Tài khoản hoặc mật khẩu không trùng khớp");
            modelAndView.setViewName("login");
            modelAndView.addObject("user", user);
        }else {
            modelAndView.setViewName("redirect:/item/index");
        }
        return modelAndView;


    }
}
