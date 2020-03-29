package com.touchyou.message.service;

import com.touchyou.message.IMailService;
import com.touchyou.thrift.message.MessageService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by touchyou on 2019/03/28.
 */
@Service
public class MessageSerivceImpl implements MessageService.Iface {

    @Autowired
    IMailService mailService;

    @Override
    public boolean sendMobileMessage(String mobile, String message) throws TException {
        System.out.println("mobile" + mobile + "message" + message);
        return true;
    }

    @Override
    public boolean sendEmailMessage(String email, String message) throws TException {
        mailService.sendHtmlMail(email, "主题", message);
        return true;
    }
}
