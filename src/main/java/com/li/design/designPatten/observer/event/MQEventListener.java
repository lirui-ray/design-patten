package com.li.design.designPatten.observer.event;

import com.li.design.designPatten.observer.common.LotteryResult;

public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户摇号结果" + result.getUId() + " " + result.getMsg());
    }
}
