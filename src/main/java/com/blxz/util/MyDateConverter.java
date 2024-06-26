package com.blxz.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date=sdf.parse(source);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
}
