package com.li.design.designPatten.strategy.impl;

import com.li.design.designPatten.strategy.RoleStrategy;

public class VIPStrategy implements RoleStrategy {
    @Override
    public void play() {
        System.out.println("VIP用户正在以4K高清播放视频...");
    }
}
