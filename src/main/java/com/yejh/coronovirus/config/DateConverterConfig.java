package com.yejh.coronovirus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yejh
 * @create 2020-04_17 14:59
 */

@Configuration
public class DateConverterConfig {
    @Bean
    public Converter<String, Date> dateConverter(){
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return new Converter<String, Date>() {
            @Override
            public Date convert(String s) {
                try {
                    return simpleDateFormat.parse(s);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }
}
