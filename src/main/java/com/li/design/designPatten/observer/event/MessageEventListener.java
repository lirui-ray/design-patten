package com.li.design.designPatten.observer.event;

import com.li.design.designPatten.observer.common.LotteryResult;

public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("给用户发送短信通知" + result.getUId() + " " + result.getMsg());
    }
}
