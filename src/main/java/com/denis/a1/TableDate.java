package com.denis.a1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TableDate {

    public Date stringToDate(String dateInString) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.parse(dateInString);
    }

}
