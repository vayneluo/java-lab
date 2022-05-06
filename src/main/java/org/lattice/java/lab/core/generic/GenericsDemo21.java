package org.lattice.java.lab.core.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class InfoService<T>{
    private T var ;        // 定义泛型变量
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
    public String toString(){    // 直接打印
        return this.var.toString() ;
    }
}
public class GenericsDemo21{
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        InfoService<String> i1 = new InfoService<>() ;        // 声明String的泛型对象
        InfoService<Object> i2 = new InfoService<>() ;        // 声明Object的泛型对象
        InfoService<Number> i3 = new InfoService<>() ;        // 声明Object的泛型对象
        i1.setVar("hello") ;
        i2.setVar(new Object()) ;
        fun(i1) ;
        fun(i2) ;
        // fun(i3) ;



        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(123);

        System.out.println(list1.getClass() == list2.getClass()); // true

        list2.getClass().getDeclaredMethod("add", Object.class).invoke(list2, "test");
        System.out.println(list2);
    }
    public static void fun(InfoService<? super String> temp){    // 只能接收String或Object类型的泛型，String类的父类只有Object类
        System.out.print(temp + ", ") ;
    }

    public <T extends Number> T foo(T value){

        return value;
    }
}