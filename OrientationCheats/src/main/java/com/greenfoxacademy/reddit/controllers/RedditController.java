package com.greenfoxacademy.reddit.controllers;


import com.greenfoxacademy.reddit.services.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Thym

@Controller
public class RedditController {

//    private final RedditService redditService;
//
//    @Autowired
//    public RedditController(RedditService redditService) {
//        this.redditService = redditService;
//    }
//
//
//    // List all from the Repo
//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("list", redditService.findAll());
//        return "submit";
//    }
//
//
//    // Take me to the submit page
//    @GetMapping("/submit")
//    public String submit(Model model) {
//        return "submit";
//    }
//
//
//    // Create new model and store it
//    @PostMapping("/submit")
//    public String submitNewPost(Model model, @RequestParam String counter, @RequestParam String title) {
//        redditService.createPost(Integer.parseInt(counter), title);
//        return "redirect:/";
//    }
//
////    @PostMapping("/plus")
////    public String plusOne(Model model) {
////        redditService.createPost(Integer.parseInt(counter), title);
////        return "redirect:/";
////    }
//
//
////    @PostMapping("/")
////    public String minusOne(Model model, @RequestParam Long Id) {
////        redditService.minusOne(1L);
////        return "redirect:/";
////    }
//
////    @PostMapping("/")
////    public String plusOne(Model model) {
////        redditService.minusOne(2L);
////        return "redirect:/";
////    }



}
