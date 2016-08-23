package com.ehualu.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by bright on 16-8-18.
 */
public class MyInvocationHandler implements InvocationHandler{

    private Object target =null;

    public MyInvocationHandler(Object _obj){
        this.target = _obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
