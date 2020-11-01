package com.lucifer.pigeon.demo.api;

import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.provider.config.ProviderConfig;
import com.lucifer.pigeon.demo.EchoService;
import com.lucifer.pigeon.demo.EchoServiceDefaultImpl;

public class Server {
    public static void main(String[] args) throws Exception {
        ProviderConfig<EchoService> providerConfig = new ProviderConfig<EchoService>(EchoService.class,
                new EchoServiceDefaultImpl());
        String url = "com.lucifer.pigeon.demo.EchoService";
        providerConfig.setUrl(url);
        ServiceFactory.addService(providerConfig);

        System.in.read();
    }
}
