package com.li.design.designPatten.strategy.impl;

import com.li.design.designPatten.strategy.RoleStrategy;

public class NormalStrategy implements RoleStrategy {
    @Override
    public void play() {
        System.out.println("普通用户正在以1080P高清播放视频...");
    }
}
