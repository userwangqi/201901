package org.java.util;

import org.springframework.stereotype.Component;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;
import java.util.Set;

/**
 * 该类的作用是加载所有的服务
 */
public class MySo implements ServerApplicationConfig {
    //采用注解的方式加载所有服务
    //参数set是存放所有socket服务
    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> scanned) {
        System.out.println("服务器启动,加载了所有socket的服务...");
        return null;
    }
//该方法是采用编程的方式加载所有的服务
    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
        return null;
    }
}
