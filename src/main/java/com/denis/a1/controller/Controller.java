package com.denis.a1.controller;

import com.denis.a1.service.DataShipping;
import com.denis.a1.service.UnauthorizedDelivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UnauthorizedDelivery unauthorizedDelivery;

    @Autowired
    private DataShipping dataShipping;

    @GetMapping(value = "/save/logins")
    public void saveLogins() {
        unauthorizedDelivery.readLoginsFile();
    }

    @GetMapping(value = "/save/postings")
    public void savePostings() {
        unauthorizedDelivery.readPostingsFile();
    }

    @GetMapping(value = "/shipping/{date}/{authorizedShipping}")
    public void takeShipping(@PathVariable(value = "date") String date,
                             @PathVariable(value = "authorizedShipping") boolean authorizedShipping) {
        dataShipping.takeDataShipping(date, authorizedShipping);
    }

}
