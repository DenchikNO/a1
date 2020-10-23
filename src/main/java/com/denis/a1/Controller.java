package com.denis.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UnauthorizedDelivery unauthorizedDelivery;

    @GetMapping(value = "/save/logins")
    public void saveLogins() {
        unauthorizedDelivery.readLoginsFile();
    }

    @GetMapping(value = "/save/postings")
    public void savePostings() {
        unauthorizedDelivery.readPostingsFile();
    }

    @GetMapping(value = "/shipping/{fromDate}/{toDate}/{authorizedShipping}")
    public void takeShipping(@PathVariable(value = "fromDate") String fromDate,
                             @PathVariable(value = "toDate") String toDate,
                             @PathVariable(value = "authorizedShipping") boolean authorizedShipping) {

    }

}
