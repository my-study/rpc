package com.jhlishero.rpc;

import com.jhlishero.rpc.framework.RpcFramework;
import com.jhlishero.rpc.service.HelloService;

/**
 * 引用服务
 */
public class RpcConsumer {
	public static void main(String[] args) throws InterruptedException {
		HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1235);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String hello = service.hello("World-" + i);
			System.out.println(hello);
			Thread.sleep(1000);
		}
	}
}