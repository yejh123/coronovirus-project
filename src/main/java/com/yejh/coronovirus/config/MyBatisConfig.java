package com.yejh.coronovirus.config;/**
 * @author yejh
 * @create 2020-04_11 16:51
 */

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //使用驼峰命名法
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
