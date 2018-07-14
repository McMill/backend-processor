package com.melissa.backendprocessor.config;

import com.melissa.backendprocessor.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mill on 7/14/2018.
 */
@Configuration
public class BeansConfiguration {
    @Bean
    public TestBean getTestBean(){
        return new TestBean();
    }
}
