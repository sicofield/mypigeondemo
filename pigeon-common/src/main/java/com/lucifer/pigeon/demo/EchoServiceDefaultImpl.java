package com.lucifer.pigeon.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoServiceDefaultImpl implements EchoService {

    private static final Logger logger = LoggerFactory.getLogger(EchoServiceDefaultImpl.class);

    @Override
    public String echo(String input) {
        System.out.println("server receive:" + input);
        return "echo:" + input;
    }

    @Override
    public User getUser(String username) {
        return new UserImpl(username);
    }

}
