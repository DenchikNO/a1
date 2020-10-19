package com.denis.a1;

public class Main {

    public static void main(String[] args) {
        IpTransform ipTransform = new IpTransform();
        Factorial factorial = new Factorial();
        UnauthorizedDelivery unauthorizedDelivery = new UnauthorizedDelivery();

        System.out.println(ipTransform.transformToInt("128.32.10.0"));
        System.out.println(ipTransform.transformToString(2149583360L));

        System.out.println("");

        System.out.format("%f%n", factorial.countFormula(2));

        System.out.println("");

        unauthorizedDelivery.readFile();
    }
}
