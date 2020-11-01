package com.lucifer.pigeon.demo.schema;

import com.dianping.pigeon.container.SpringContainer;

public class Server {
    private static SpringContainer SERVER_CONTAINER = new SpringContainer(
            "classpath*:META-INF/spring/provider.xml");

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SERVER_CONTAINER.start();

        System.in.read();
    }
}
