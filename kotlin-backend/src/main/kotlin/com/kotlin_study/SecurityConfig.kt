package com.kotlin_study

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource


@Configuration
@EnableWebSecurity
@ConfigurationProperties(prefix = "security")
class SecurityConfig : WebSecurityConfigurerAdapter() {
    // 許可するドメイン
    lateinit var corsClientUrls: List<String>
    val logger: Logger = LoggerFactory.getLogger(WebSecurityConfigurerAdapter::class.java)

    override fun configure(http: HttpSecurity) {
        // Basic認証無効化
        http.authorizeRequests()
                .antMatchers("/","/register")
                    .permitAll()
            .and()
                .cors()
                    .configurationSource(corsConfigurationSource())
    }

    private fun corsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()
        corsConfiguration.addAllowedOrigin(CorsConfiguration.ALL);
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL)
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL)
        // corsConfiguration.allowCredentials = true;

        val corsConfigurationSource = UrlBasedCorsConfigurationSource()
        corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration)

        return corsConfigurationSource
    }
}