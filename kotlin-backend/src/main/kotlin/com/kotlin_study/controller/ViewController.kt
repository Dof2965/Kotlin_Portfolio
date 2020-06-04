package com.kotlin_study.controller

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.util.*
import org.springframework.core.Ordered
import org.springframework.web.filter.CorsFilter
import javax.servlet.Filter

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

    @Bean
    fun simpleCorsFilter(): FilterRegistrationBean<*> {
        val source = UrlBasedCorsConfigurationSource()
        val config = CorsConfiguration()
        config.allowCredentials = true
        // *** 下記のURLはVueクライアントURLとポートに一致させる必要がある***
        config.allowedOrigins = Collections.singletonList("http://localhost:8080")
        config.allowedMethods = Collections.singletonList("*")
        config.allowedHeaders = Collections.singletonList("*")
        source.registerCorsConfiguration("/**", config)
        val bean = FilterRegistrationBean<Filter>(CorsFilter(source))
        bean.order = Ordered.HIGHEST_PRECEDENCE
        return bean
    }
}