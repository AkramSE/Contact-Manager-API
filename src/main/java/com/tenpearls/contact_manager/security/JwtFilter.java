package com.tenpearls.contact_manager.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    // SonarQube ki requirement ke mutabiq Logger initialize kiya gaya hai
    private static final Logger logger = LoggerFactory.getLogger(JwtFilter.class);

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Bypass JWT filter execution for public endpoints (login and register).
        String path = request.getRequestURI();
        if (path.contains("/users/register") || path.contains("/users/login")) {
            filterChain.doFilter(request, response);
            return;
        }

        // 1. Extract the Authorization header from the incoming request.
        final String authorizationHeader = request.getHeader("Authorization");
        // ... remaining filter logic remains unchanged ...

        String email = null;
        String jwtToken = null;

        // 2. Validate presence and Bearer prefix of the Authorization header.
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwtToken = authorizationHeader.substring(7);

            try {
                email = jwtUtil.extractEmail(jwtToken);
            } catch (Exception e) {
                // System.out.println ki jagah professional logger use kiya gaya hai
                logger.error("JWT token is invalid or expired: {}", e.getMessage());
            }
        }

        // 3. Authenticate user if email is resolved and SecurityContext is empty.
        if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            UserDetails userDetails = this.userDetailsService.loadUserByUsername(email);

            if (jwtUtil.validateToken(jwtToken, userDetails.getUsername())) {

                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // 4. Forward request down the filter chain.
        filterChain.doFilter(request, response);
    }
}