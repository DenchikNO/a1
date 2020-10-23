package com.denis.a1;

public class CheckAuthorizedShipping {

    public boolean makeAuthorizedShipping(String userName, String appAccountName, String isActive) {
        if (userName.equals(appAccountName) && isActive.equals("True")) {
            return true;
        }
        else {
            return false;
        }
    }

}
