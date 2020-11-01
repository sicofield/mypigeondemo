package com.lucifer.pigeon.demo.schema;

import com.dianping.pigeon.container.SpringContainer;
import com.lucifer.pigeon.demo.EchoService;

public class Client {
    private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
            "classpath*:META-INF/spring/invoker.xml");

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CLIENT_CONTAINER.start();

        EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
        EchoService echoServiceWithCallback = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithCallback");

        System.out.println(echoService.echo("echoService_input"));
        echoServiceWithCallback.echo("echoServiceWithCallback_input");

        System.out.println(echoService.getUser("scott"));
    }
}
