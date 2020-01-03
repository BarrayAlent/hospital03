package com.ujiuye.service;

import com.ujiuye.bean.Users;
import com.ujiuye.dao.UserDao;
import com.ujiuye.util.Responsebean;
import com.ujiuye.util.VerifyCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class UserServiceImpl  implements UserServeice {

    @Autowired
    UserDao dao;

    @Override
    public Responsebean createCode(){
        File dir = new File("D://upload");
        int w = 200, h = 80;
        String verifyCode = VerifyCodeUtils.generateVerifyCode(5);

        //String codeName=System.currentTimeMillis() + ".jpg";

        String codeName= UUID.randomUUID() + ".jpg";

        File file = new File(dir,codeName);
        try {
            VerifyCodeUtils.outputImage(w, h, file, verifyCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Responsebean response=new Responsebean();
        response.setData(codeName);
        response.setCode(verifyCode);

        return response;
    }

    @Override
    public Responsebean login(String username, String password, HttpSession session) {

        Users users=dao.getUserByUserNameAndPsw(username,password);

        Responsebean response=new Responsebean();
        if (users==null){
            response.setSuccess(false);
        }else{
            response.setSuccess(true);
            session.setAttribute("user",users);
        }

        return response;
    }
}
