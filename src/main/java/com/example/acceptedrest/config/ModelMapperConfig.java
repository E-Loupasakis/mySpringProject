package com.example.acceptedrest.config;

import com.example.acceptedrest.enums.Sport;
import com.example.acceptedrest.util.Constants;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class ModelMapperConfig {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT);
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(Constants.HOUR_FORMAT);

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        Converter<String, Sport> stringToSportConverter = new AbstractConverter<>() {
            @Override
            protected Sport convert(String s) {
                if(s == null){
                    return null;
                }
                return Sport.valueOf(s.toUpperCase());
            }
        };
        modelMapper.addConverter(stringToSportConverter);

        Converter<String, LocalDate> stringToLocalDateConverter = new AbstractConverter<>() {
            @Override
            protected LocalDate convert(String s) {
                if(s == null){
                    return null;
                }
                return LocalDate.parse(s,dateFormatter);
            }
        };

        Converter<String, LocalTime> stringToLocalTimeConverter = new AbstractConverter<>() {
            @Override
            protected LocalTime convert(String s) {
                if(s == null){
                    return null;
                }
                return LocalTime.parse(s,timeFormatter);
            }
        };

        modelMapper.addConverter(stringToSportConverter);
        modelMapper.addConverter(stringToLocalDateConverter);
        modelMapper.addConverter(stringToLocalTimeConverter);
        return modelMapper;
    }
}
