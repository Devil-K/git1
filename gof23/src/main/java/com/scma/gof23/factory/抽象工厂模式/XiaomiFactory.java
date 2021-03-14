package com.scma.gof23.factory.抽象工厂模式;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
