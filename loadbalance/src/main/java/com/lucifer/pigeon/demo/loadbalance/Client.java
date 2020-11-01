/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.lucifer.pigeon.demo.loadbalance;

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
		System.out.println(echoService.echo("hi"));
	}

}
