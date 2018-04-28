package com.fedfans.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * blog: https://www.520stone.com
 * 通过@EnableWebSecurity注解开启Spring Security的功能
 * 继承WebSecurityConfigurerAdapter，并重写它的方法来设置一些web安全的细节
 * Created by stone-jin on 2018/4/27.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig2 extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/hello")
                .permitAll()
                .and()
                .logout()
            .permitAll();
    }
}
