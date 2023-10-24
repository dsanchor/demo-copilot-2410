package com.example.demo2410.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Received request for /hello");
        String response = "Hello, World!";
        System.out.println("Sending response: " + response);
        return response;
    }

    @GetMapping("/reverse")
    public String reverse(@RequestParam String text) {
        System.out.println("Received request for /reverse with text: " + text);
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        System.out.println("Sending response: " + reversed);
        return reversed;
    }

    // operation to revmove vowels from a string
    @GetMapping("/removeVowels")
    public String removeVowels(@RequestParam String text) {
        System.out.println("Received request for /removeVowels with text: " + text);
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (vowels.indexOf(sb.charAt(i)) != -1) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        String removed = sb.toString();
        System.out.println("Sending response: " + removed);
        return removed;
    }


}

