package com.ujiuye.service;

import com.ujiuye.util.Responsebean;

import javax.servlet.http.HttpSession;

public interface UserServeice {

     Responsebean createCode();

    Responsebean login(String username, String password, HttpSession session);
}
