package com.xueda.food.config;

import javax.annotation.Resource;

import com.xueda.food.config.auth.AuthUserDetailsService;
import com.xueda.food.config.auth.MyAuthenticationFailureHandler;
import com.xueda.food.config.auth.MyAuthenticationSuccessHandler;
import com.xueda.food.config.auth.jwt.JwtAuthenticationTokenFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;



@Configuration
class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;

    @Resource
    MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    @Resource
    AuthUserDetailsService authUserDetailsService;

    @Resource
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        .ignoringAntMatchers("/authentication")
        .and()
        .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .formLogin()
                // .loginProcessingUrl("/login")
                // .usernameParameter("username")
                // .passwordParameter("password")
                // .failureHandler(myAuthenticationFailureHandler)
                // .successHandler(myAuthenticationSuccessHandler)

            .and()
        .authorizeRequests()
        .antMatchers("/login.html", "/login", "/authentication").permitAll()
        .antMatchers("/hello").authenticated()
        //     .antMatchers("/hello")
        // .hasAnyAuthority("ROLE_user", "ROLE_admin")
        //     .antMatchers("/world")
        // .hasAnyRole("admin")
        .anyRequest()
        .authenticated();
	}
	
	@Override
    public void configure (AuthenticationManagerBuilder auth) throws Exception {
        // auth.inMemoryAuthentication()
        // .withUser("user")
        // .password(passwordEncoder().encode("123456"))
        // .roles("user")
        //     .and()
        // .withUser("admin")
        // .password(passwordEncoder().encode("123456"))
        // .roles("admin")
        //     .and()
        // .passwordEncoder(passwordEncoder());
        auth.userDetailsService(authUserDetailsService)
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

    @Bean(name=BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}