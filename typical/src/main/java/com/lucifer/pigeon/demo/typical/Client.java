package com.lucifer.pigeon.demo.typical;

import com.dianping.pigeon.container.SpringContainer;
import com.dianping.pigeon.remoting.invoker.util.InvokerHelper;
import com.lucifer.pigeon.demo.EchoService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
            "classpath*:META-INF/spring/invoker.xml");

    private static ExecutorService pool = Executors.newFixedThreadPool(50);

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CLIENT_CONTAINER.start();

        final EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
        final EchoService echoServiceWithCallback = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithCallback");
        final EchoService echoServiceWithFuture = (EchoService) CLIENT_CONTAINER.getBean("echoServiceWithFuture");

        // pool.execute(new Runnable(){
        //
        // @Override
        // public void run() {
        // while (true) {
        // try {
        System.out.println(echoService.getUser("scott"));
        System.out.println(echoService.echo("scott"));
        echoServiceWithCallback.echo("scott callback");
        /**
         * pigeon的异步编程和future需要研究下，或者说响应式编程
         * **/
        echoServiceWithFuture.echo("scott future");
        Future<String> future = InvokerHelper.getFuture(String.class);
        echoServiceWithFuture.echo("hahahaha");
        Future<String> future2 = InvokerHelper.getFuture(String.class);
        System.out.println(future.get());
        System.out.println(future2.get());
        // } catch (Exception e) {
        // }
        // }
        // }

        // });

    }
}
