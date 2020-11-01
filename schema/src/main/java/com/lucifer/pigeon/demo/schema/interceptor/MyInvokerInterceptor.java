package com.lucifer.pigeon.demo.schema.interceptor;

import com.dianping.pigeon.remoting.invoker.domain.InvokerContext;
import com.dianping.pigeon.remoting.invoker.process.InvokerInterceptor;

public class MyInvokerInterceptor implements InvokerInterceptor {

    @Override
    public void preInvoke(InvokerContext invokerContext) {
        System.out.println("preInvoke:" + invokerContext.getRequest());
    }

    @Override
    public void postInvoke(InvokerContext invokerContext) {
        System.out.println("postInvoke:" + invokerContext.getRequest());
    }

    @Override
    public void afterThrowing(InvokerContext invokerContext, Throwable throwable) {
        System.out.println("afterThrowing:" + invokerContext.getRequest());
    }

}
