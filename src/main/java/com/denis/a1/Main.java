package com.denis.a1;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        IpTransform ipTransform = new IpTransform();
        Factorial factorial = new Factorial();

        System.out.println(ipTransform.transformToInt("128.32.10.0"));
        System.out.println(ipTransform.transformToString(2149583360L));

        System.out.println("");

        System.out.format("%f%n", factorial.countFormula(2));

        //TODO delete
        System.out.println("");
        TableDate tableDate = new TableDate();
        System.out.println(tableDate.stringToDate("21.07.2020"));
    }
}
