package com.ponomarev.virtualthread.configuration;

import java.util.concurrent.Executors;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of custom thread pool of Tomcat to use virtual threads
 * @author Egor Ponomarev
 */
@Configuration
public class TomcatCustomThreadPoolConfiguration {
    @Bean
    public TomcatProtocolHandlerCustomizer<?> protocolHandlerVirtualThreadExecutorCustomizer() {
        return protocolHandler -> protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
    }
}
