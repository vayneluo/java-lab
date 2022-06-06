package org.lattice.java.lab.core.proxy.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/3/3 10:11
 */
public class ProxyFactory {

    private ProxyFactory() {

    }

    private static final ProxyFactory proxyFactory = new ProxyFactory();

    /**
     * @description: 饿汉式单例
     * @author: Vayne.Luo
     * @date: 2022/3/3 10:12
     */
    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    public Object getJdkProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("携程代理购买，收取手续费2元");
                Object result = method.invoke(obj, args);
                System.out.println("发送通知，购买成功");
                return result;
            }
        });
    }
    
    public Object getCglibProxy(Class clazz) {
        return Enhancer.create(clazz, (MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("携程代理购买，收取手续费2元");
            //Object result = method.invoke(obj, objects);
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("发送通知，购买成功");
            return result;
        });
    }

    public static void main(String[] args) {
        /*BuyTicketService jdkProxy = (BuyTicketService) ProxyFactory.getInstance().getJdkProxy(new BuyerTicketServiceImpl());
        jdkProxy.buyTicket();*/
        BuyTicketService cglibProxy = (BuyTicketService) ProxyFactory.getInstance().getCglibProxy(BuyerTicketServiceImpl.class);
        cglibProxy.buyTicket();
    }
}
