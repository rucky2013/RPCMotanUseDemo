package com.trilever.test.RPCTest;

/**
 * 1、注意，这个接口是RPC框架中对于服务端和客户端共用的接口。服务端通过这个接口暴露出服务。
 * 客户端利用这个接口调用服务端的服务.
 * 2、这个Interface 和Server 中的是一模一样的Interface.
 * 3、注意，这个Interface 与Server端的这个Interface 应该是在相同的包路径之下，否则无法调用。
 * 
 * @author Trilever
 */
public interface FooService {
    public String hello(String name);
}
