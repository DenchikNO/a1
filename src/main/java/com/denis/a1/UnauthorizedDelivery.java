package com.denis.a1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnauthorizedDelivery {

    BufferedReader readerLogins;
    FileReader readerPostings;

    public void readFile() {
        List<String> loginsList = new ArrayList<>();
        String line;
        try {
            readerLogins = new BufferedReader(new FileReader("../a1/src/main/resources/tables/logins.csv"));
            while ((line = readerLogins.readLine()) != null) {
                String[] words = line.split(",");
                for (String w : words) {
                    String clearWords = w.trim();
                    loginsList.add(clearWords);
                }
            }
            System.out.println(loginsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
