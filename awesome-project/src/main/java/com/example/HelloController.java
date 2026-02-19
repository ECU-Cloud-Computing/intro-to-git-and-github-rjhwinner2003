/*
*By: Ryan Hall
*Feb 18, 26
*/

package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Everything was a success!\n\n\n\n ...or was it?\n";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name;
    }
}
