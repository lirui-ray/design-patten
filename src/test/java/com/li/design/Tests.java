package com.li.design;

import com.li.design.designPatten.factory.Factory;
import com.li.design.designPatten.factory.Log;
import com.li.design.designPatten.observer.common.LotteryResult;
import com.li.design.designPatten.observer.LotteryService;
import com.li.design.designPatten.observer.LotteryServiceImpl;
import com.li.design.designPatten.strategy.Context;
import org.junit.Test;

public class Tests {

    @Test
    public void contextLoads() {

        // ... 业务逻辑

        // 日志记录
        int type = 1;
        if (type == 1) {
            // 记录到本地磁盘
            System.out.println("记录到本地磁盘");
        } else if (type == 2) {
            // 记录到系统事件
            System.out.println("记录到系统事件");
        } else if (type == 3) {
            // 记录到远程服务器
            System.out.println("记录到远程服务器");
        } else {
            throw new RuntimeException("非预期的日志类型");
        }

    }

    @Test
    public void testFactory() {

        // ... 业务逻辑

        Factory factory = new Factory();
        Log log = factory.getLog(1);
        log.info("登录", "成功");

        Factory factory1 = new Factory();
        Log log1 = factory1.getLog(2);
        log1.info("删除管理员", "成功");

        Factory factory2 = new Factory();
        Log log2 = factory2.getLog(3);
        log2.info("微信支付", "成功");

    }

    @Test
    public void testStrategy() {
        Context normalContext = new Context(1);
        normalContext.play();

        Context vipContext = new Context(2);
        vipContext.play();
    }


    @Test
    public void testObserver() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109877");
        System.out.println(result);
    }

}
