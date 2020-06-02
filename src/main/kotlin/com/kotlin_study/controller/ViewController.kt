package com.kotlin_study.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ViewController {
    @GetMapping("/")
    fun index(model: Model): String {
        return "index"
    }

    // 自己紹介周り
    @GetMapping("/profile")
    fun profile(model: Model): String {
        return "profile"
    }

    // サンプルサイト
    @GetMapping("/sampleCode")
    fun sampleCode(model: Model): String {
        return "sampleSystem/sampleCode"
    }

    // login
    @GetMapping("/login")
    fun login(model: Model): String {
        return "sampleSystem/register"
    }

    // 会員登録
    @GetMapping("/register")
    fun register(model: Model): String {
        return "sampleSystem/register"
    }
}