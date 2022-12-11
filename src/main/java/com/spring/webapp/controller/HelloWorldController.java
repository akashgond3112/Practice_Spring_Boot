package com.spring.webapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {


    //need a controller method to show the initial HTML form 
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the initial HTML form
    @RequestMapping("/processForm")
    public String showPage() {
        return "helloworld";
    }

    // new controller that to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request parameter from the html form
        String theName = request.getParameter("studentName");
        // convert all the data to upper case
        theName = theName.toUpperCase();
        // creat the message
        String  result = "Yo! " + theName;
        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        // convert all the data to upper case
        theName = theName.toUpperCase();
        // creat the message
        String  result = "hey my friend! " + theName;
        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
