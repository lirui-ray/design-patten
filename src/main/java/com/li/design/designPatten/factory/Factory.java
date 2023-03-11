package com.li.design.designPatten.factory;

import com.li.design.designPatten.factory.impl.LocalDiskLog;
import com.li.design.designPatten.factory.impl.RemoteLog;
import com.li.design.designPatten.factory.impl.SystemEventLog;

public class Factory {

    public Log getLog(int type) {
        if (type == 1) {
            // 记录到本地磁盘
            return new LocalDiskLog();
        } else if (type == 2) {
            // 记录到系统事件
            return new SystemEventLog();
        } else if (type == 3) {
            // 记录到远程服务器
            return new RemoteLog();
        } else {
            throw new RuntimeException("非预期的日志类型");
        }
    }

}
