package com.suunny.RestAPIProjectTC.SecurityPackage;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class CloudVendorSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeRequests(
                (req) -> req.anyRequest().authenticated()
        ).formLogin().permitAll();

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("user1")
                .password("user1")
                .roles("Admin")
                .build();


        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("user2")
                .password("user2")
                .roles("User")
                .build();

        return new InMemoryUserDetailsManager(user2 , user1);
    }
}
