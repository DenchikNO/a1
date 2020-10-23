package com.denis.a1;

public class CheckAuthorizedShipping {

    public boolean makeAuthorizedShipping(String userName, String appAccountName, String isActive) {
        return userName.equals(appAccountName) && isActive.equals("True");
    }

}
