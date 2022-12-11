package com.spring.webapp.controller;

import com.spring.webapp.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // creat student object
        Student student = new Student();

        //add  student object to the mode
        model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        System.out.println("student name : " + student.getFirstName() + " "+ student.getLastName());
        return "student-confirmation";
    }
}
