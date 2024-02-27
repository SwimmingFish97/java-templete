package com.liyue;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Integer.MAX_VALUE - 1)
public class ApplicationInitializationRunner implements ApplicationRunner {

    /**
     * 需要实现ApplicationRunner接口，重写run方法。
     * 当服务启动完成后，就会调用我们的目标方法，完成相应功能
     * @param args
     * @throws Exception
     */

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
