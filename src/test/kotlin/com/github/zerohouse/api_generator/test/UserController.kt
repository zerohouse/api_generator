package com.github.zerohouse.api_generator.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @GetMapping
    fun getUser(
        @RequestParam str: String,
        @RequestParam(defaultValue = "") str2: String,
        @RequestParam(required = false) str3: String?,
    ): Map<String, String> {
        return "" as Map<String, String>
    }


    @GetMapping
    fun string(
        @RequestParam str: String,
        @RequestParam(defaultValue = "") str2: String,
        @RequestParam(required = false) str3: String?,
    ): String {
        return ""
    }


    @GetMapping
    fun sdfzxc(
        @RequestParam str: String,
        @RequestParam(defaultValue = "") str2: String,
        @RequestParam(required = false) str3: String?,
    ): Page<List<Map<ABC, Page<ABC>>>> {
        return "" as Page<List<Map<ABC, Page<ABC>>>>
    }
}

data class ABC(val a: String = "")

interface Page<T> {
}
