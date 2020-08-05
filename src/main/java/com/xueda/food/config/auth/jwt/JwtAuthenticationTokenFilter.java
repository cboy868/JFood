package com.xueda.food.config.auth.jwt;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.util.StringUtils;
import com.xueda.food.config.auth.AuthUserDetailsService;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Resource
    JwtTokenUtil jwtTokenUtil;

    @Resource
    AuthUserDetailsService authUserDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                String jwtToken = request.getHeader(jwtTokenUtil.getHeader());
                if (!StringUtils.isNullOrEmpty(jwtToken)) {
                    String username = jwtTokenUtil.getUsernameFromToken(jwtToken);

                    if (username != null && SecurityContextHolder.getContext().getAuthentication() ==null) {
                        UserDetails userDetails = authUserDetailsService.loadUserByUsername(username);
                        if (jwtTokenUtil.validateToken(username, userDetails)) {
                            UsernamePasswordAuthenticationToken authenticationToken
                            = new UsernamePasswordAuthenticationToken(userDetails, null);

                            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                        }
                    }

                }

                filterChain.doFilter(request, response);

    }
    
}