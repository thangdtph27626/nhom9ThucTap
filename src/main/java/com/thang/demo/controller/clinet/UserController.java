package com.thang.demo.controller.clinet;

import com.thang.demo.service.BillService;
import com.thang.demo.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author thangdt
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${user}")
    private String userId;

   @Autowired
    private BillService billService;


    @GetMapping("/detail")
    public String detailUser(Model model){
        model.addAttribute("user", userService.findById(userId));
        model.addAttribute("bills", billService.findAllByUser(userId));
        return "user/detail-user";
    }
}
