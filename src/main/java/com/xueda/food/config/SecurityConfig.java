package com.xueda.food.config;

import javax.annotation.Resource;

import com.xueda.food.config.auth.MyAuthenticationFailureHandler;
import com.xueda.food.config.auth.MyAuthenticationSuccessHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Resource
    MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.httpBasic()
        http
//                .csrf()
//                .disable()
                .formLogin()
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
        // .loginPage("/login.html")
        // .loginPage("/login")
        .successHandler(myAuthenticationSuccessHandler)
        .failureHandler(myAuthenticationFailureHandler)
            .and()
        .authorizeRequests()
        .antMatchers("/login.html", "/login").permitAll()
            .antMatchers("/hello")
        .hasAnyAuthority("ROLE_user", "ROLE_admin")
            .antMatchers("/world")
        .hasAnyRole("admin")
        .anyRequest()
        .authenticated();
	}
	
	@Override
    public void configure (AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
        .withUser("user")
        .password(passwordEncoder().encode("123456"))
        .roles("user")
            .and()
        .withUser("admin")
        .password(passwordEncoder().encode("123456"))
        .roles("admin")
            .and()
        .passwordEncoder(passwordEncoder());
    }


    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/css/**","/fonts/**", "/img/**", "/js/**");
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}