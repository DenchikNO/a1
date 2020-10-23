package com.denis.a1.service;

import com.denis.a1.domain.PostingsEntity;
import com.denis.a1.repository.PostingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataShipping {

    @Autowired
    private PostingsRepository postingsRepository;

    public void takeDataShipping(String date, boolean authorizedShipping) {
        List<PostingsEntity> postingsEntityList = postingsRepository.findAll();
        for (PostingsEntity postingsEntity : postingsEntityList) {
            String pstngDate = postingsEntity.getPstngDate();
            if (date.equals(pstngDate)) {
                if (authorizedShipping) {
                    List<PostingsEntity> newPostingsEntityList = postingsRepository.findAllByPstngDate(pstngDate);
                    for (PostingsEntity p : newPostingsEntityList){
                        System.out.println(p.getMaterialDescription());
                        System.out.println(p.isAuthorizedShipping());
                    }
                } else {
                    List<PostingsEntity> newPostingsEntityList = postingsRepository.findAllByPstngDate(pstngDate);
                    for (PostingsEntity p : newPostingsEntityList){
                        System.out.println(p.getMaterialDescription());
                    }
                }
            }
        }
    }

}
