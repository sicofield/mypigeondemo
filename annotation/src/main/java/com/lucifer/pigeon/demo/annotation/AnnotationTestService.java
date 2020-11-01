package com.lucifer.pigeon.demo.annotation;

import com.dianping.pigeon.remoting.invoker.config.annotation.Reference;
import com.lucifer.pigeon.demo.EchoService;

public class AnnotationTestService {

    /**
     * @Documented
     * @Retention(RetentionPolicy.RUNTIME)
     * @Target({ ElementType.FIELD, ElementType.METHOD })
     * public @interface Reference {
     *
     * 	Class<?> interfaceClass() default void.class;
     *
     * 	String vip() default "";
     *
     * 	String url() default "";
     *
     * 	String protocol() default "default";
     *
     * 	String serialize() default "hessian";
     *
     * 	String callType() default "sync";
     *
     * 	int timeout() default 1000;
     *
     * 	String callback() default "";
     *
     * 	String loadbalance() default "weightedAutoaware";
     *
     * 	String cluster() default "failfast";
     *
     * 	int retries() default 1;
     *
     * 	boolean timeoutRetry() default false;
     *
     * 	String version() default "";
     *
     * 	String group() default "";
     *
     * 	String secret() default "";
     *
     * }
     *
     * 查看下@Reference的源码，还是在设置rpc调用的几个关键参数
     * serialize、 callType、 timeout、 callback、 loadbalance
     * */
    @Reference(timeout = 500)
    private EchoService echoService;

    public String testEcho(String input) {
        return echoService.echo(input);
    }
}
