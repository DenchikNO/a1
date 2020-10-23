package com.denis.a1.service;

import com.denis.a1.CheckAuthorizedShipping;
import com.denis.a1.domain.LoginsEntity;
import com.denis.a1.domain.PostingsEntity;
import com.denis.a1.repository.LoginsRepository;
import com.denis.a1.repository.PostingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UnauthorizedDelivery {

    @Autowired
    private LoginsRepository loginsRepository;

    @Autowired
    private PostingsRepository postingsRepository;

    BufferedReader readerLogins;
    BufferedReader readerPostings;

    public void readLoginsFile() {
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
            for (int n = 5; n < loginsList.size(); n++) {
                LoginsEntity loginsEntity = new LoginsEntity();
                loginsEntity.setApplication(loginsList.get(n));
                loginsEntity.setAppAccountName(loginsList.get(++n));
                loginsEntity.setIsActive(loginsList.get(++n));
                loginsEntity.setJobTitle(loginsList.get(++n));
                loginsEntity.setDepartment(loginsList.get(++n));
                loginsRepository.save(loginsEntity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPostingsFile() {
        List<String> postingsList = new ArrayList<>();
        CheckAuthorizedShipping checkAuthorizedShipping = new CheckAuthorizedShipping();
        LoginsEntity loginsEntity = new LoginsEntity();
        String line;
        try {
            readerPostings = new BufferedReader(new FileReader("../a1/src/main/resources/tables/postings.csv"));
            while ((line = readerPostings.readLine()) != null) {
                String[] words = line.split(";");
                for (String w : words) {
                    String clearWords = w.trim();
                    postingsList.add(clearWords);
                }
            }
            for (int n = 21; n < postingsList.size(); n++) {
                PostingsEntity postingsEntity = new PostingsEntity();
                postingsEntity.setMatDoc(Long.parseLong(postingsList.get(n)));
                postingsEntity.setItem(Integer.parseInt(postingsList.get(++n)));
                postingsEntity.setDocDate(postingsList.get(++n));
                postingsEntity.setPstngDate(postingsList.get(++n));
                postingsEntity.setMaterialDescription(postingsList.get(++n));
                postingsEntity.setQuantity(Integer.parseInt(postingsList.get(++n)));
                postingsEntity.setBun(postingsList.get(++n));
                postingsEntity.setAmountLc(Double.parseDouble(postingsList.get(++n).replaceAll(",", ".")));
                postingsEntity.setCrcy(postingsList.get(++n));
                postingsEntity.setUserName(postingsList.get(++n));
                postingsEntity.setAuthorizedShipping(checkAuthorizedShipping
                        .makeAuthorizedShipping(postingsEntity.getUserName(),
                                loginsEntity.getAppAccountName(),
                                loginsEntity.getIsActive()));
                postingsRepository.save(postingsEntity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
