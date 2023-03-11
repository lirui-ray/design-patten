package com.li.design.designPatten.singleton;

public class HungryPerson {

//    1、单例类只能有一个实例。
//    2、单例类必须自己创建自己的唯一实例。
//    3、单例类必须给所有其他对象提供这一实例。

    private static HungryPerson instance = new HungryPerson();

    private HungryPerson(){
    }

    public static HungryPerson getInstance() {
        return instance;
    }

}
