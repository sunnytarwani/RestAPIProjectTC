package com.suunny.RestAPIProjectTC.SecurityPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class CloudVendorSecurity {


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        //FOR THE GOOGLE CONSOLE OAUTH2 REGISTRATION TYPE
//       http.authorizeHttpRequests().anyRequest().authenticated()
//               .and().oauth2Login();
//       return http.build();

        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/cloudVendor/all")
                .hasRole("Admin")
                .requestMatchers("/cloudVendor/post")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();

        return http.build();

    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails user1 = User
                .withUsername("user1")
                .password(passwordEncoder().encode("password"))
                .roles("Admin")
                .build();


        UserDetails user2 = User
                .withUsername("user2")
                .password(passwordEncoder().encode("password"))
                .roles("User")
                .build();

        return new InMemoryUserDetailsManager(user2 , user1);
    }
}
