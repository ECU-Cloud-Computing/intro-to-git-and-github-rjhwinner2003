/*
*By: Ryan Hall
*Feb 18, 26
*/

package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @GetMapping("/add")
    public int add(@RequestParam int n, @RequestParam int m) {
        return n + m;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int n, @RequestParam int m) {
        return n - m;
    }

    @GetMapping("/times")
    public int times(@RequestParam int n, @RequestParam int m) {
        return n * m;
    }

    @GetMapping("/div")
    public int div(@RequestParam int n, @RequestParam int m) {
        return n / m;
    }

    @GetMapping("/neg")
    public int neg(@RequestParam int n) {
        return -n;
    }
}

