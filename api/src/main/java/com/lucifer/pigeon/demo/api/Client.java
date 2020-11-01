package com.lucifer.pigeon.demo.api;

import com.dianping.pigeon.remoting.ServiceFactory;
import com.lucifer.pigeon.demo.EchoService;

public class Client {
    public static void main(String[] args) throws Exception {
        String url = "com.lucifer.pigeon.demo.EchoService";

        /**相关操作查看ServiceFactory的接口*/
        EchoService echoService = ServiceFactory.getService(url, EchoService.class, 500);

        //InvocationCallback callback = new EchoServiceCallback();
//		EchoService serviceWithCallback = ServiceFactory.getService(url, EchoService.class, callback);
        System.out.println("echoService result:" + echoService.echo("echoService_input"));
//		serviceWithCallback.echo("echoServiceWithCallback_input");
    }
}
