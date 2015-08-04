package com.jhlishero.rpc.service;

public class HelloServiceImpl implements HelloService {
	public String hello(String name) {
		return "rpc hello " + name;
	}
}