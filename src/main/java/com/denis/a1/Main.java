package com.denis.a1;

import com.denis.a1.task1and2.Factorial;
import com.denis.a1.task1and2.IpTransform;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        IpTransform ipTransform = new IpTransform();
        Factorial factorial = new Factorial();

        System.out.println("");
        System.out.println(ipTransform.transformToInt("128.32.10.0"));
        System.out.println(ipTransform.transformToString(2149583360L));
        System.out.println("");

        System.out.format("%f%n", factorial.countFormula(2));
    }
}
