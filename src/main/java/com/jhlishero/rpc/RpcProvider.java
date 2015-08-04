package com.jhlishero.rpc;

import com.jhlishero.rpc.framework.RpcFramework;
import com.jhlishero.rpc.service.HelloService;
import com.jhlishero.rpc.service.HelloServiceImpl;

/**
 * 暴露服务
 */
public class RpcProvider {

	public static void main(String[] args) throws Exception {
		HelloService service = new HelloServiceImpl();
		RpcFramework.export(service, 1235);
	}
}