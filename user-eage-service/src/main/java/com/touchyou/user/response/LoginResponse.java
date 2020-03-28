package com.touchyou.user.response;

/**
 * Created by touchyou on 2019/03/28.
 */
public class LoginResponse extends Response {

    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
