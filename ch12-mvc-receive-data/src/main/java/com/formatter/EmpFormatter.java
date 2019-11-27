package com.formatter;

import com.entity.Emp;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EmpFormatter implements Formatter<Emp> {
    @Override
    public Emp parse(String s, Locale locale) throws ParseException {
        String[] split = s.split(",");
        Emp emp = new Emp();
        emp.setFirstName(split[0]);
        emp.setLastName(split[1]);
        return emp;
    }

    @Override
    public String print(Emp emp, Locale locale) {
        return emp.toString();
    }
}
