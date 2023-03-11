package com.li.design.designPatten.factory.impl;

import com.li.design.designPatten.factory.Log;

public class RemoteLog implements Log {
    @Override
    public void info(String function, String result) {
        System.out.println(function + "功能完成， result: " + result + "，正在记录到远程服务器");
    }
}
