package com.lucifer.pigeon.demo.annotation;

import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import com.lucifer.pigeon.demo.EchoService;
import com.lucifer.pigeon.demo.User;
import com.lucifer.pigeon.demo.UserImpl;

@Service
public class EchoServiceAnnotationImpl implements EchoService {

    @Override
    public String echo(String input) {
        System.out.println("annotation received: " + input);
        return "annotation service echo:" + input;
    }

    @Override
    public User getUser(String username) {
        return new UserImpl(username);
    }
}
