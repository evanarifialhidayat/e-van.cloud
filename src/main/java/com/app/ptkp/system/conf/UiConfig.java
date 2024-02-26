package com.app.ptkp.system.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class UiConfig extends WebMvcConfigurerAdapter { 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
        "/ui/**",
        "/ui_profile/**"
                )
                .addResourceLocations(
                        "classpath:/static/ui/",
                        "classpath:/static/ui_profile/"
                );
    } 
}