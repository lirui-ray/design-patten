package com.li.design.designPatten.strategy;

import com.li.design.designPatten.strategy.impl.NormalStrategy;
import com.li.design.designPatten.strategy.impl.VIPStrategy;

public class Context {

    private RoleStrategy roleStrategy;

    public Context(Integer role) {
        switch (role) {
            case 1:
                roleStrategy = new NormalStrategy();
                break;
            case 2:
                roleStrategy = new VIPStrategy();
                break;
            default:
        }
    }

    public void play() {
        roleStrategy.play();
    }
}
