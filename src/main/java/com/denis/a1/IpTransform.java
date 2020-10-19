package com.denis.a1;

public class IpTransform {

    public long transformToInt(String ip) {
        String[] ipSplit = ip.split("\\.");
        long intIp = 0;
        for (int i = 0; i < ipSplit.length; i++) {
            intIp += Integer.parseInt(ipSplit[i]) * Math.pow(256, 3 - i);
        }
        return intIp;
    }

    public String transformToString(long ip) {
        return ((ip >> 24) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                (ip & 0xFF);
    }

}