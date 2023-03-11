package com.li.design.designPatten.observer.event;

import com.li.design.designPatten.observer.common.LotteryResult;

public interface EventListener {

    void doEvent(LotteryResult result);

}
