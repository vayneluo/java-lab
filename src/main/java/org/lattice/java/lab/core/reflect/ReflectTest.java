package org.lattice.java.lab.core.reflect;

import lombok.extern.slf4j.Slf4j;
import org.lattice.java.lab.core.SubClazz;
import org.lattice.java.lab.core.base.BizException;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/26 08:58
 */
@Slf4j
public class ReflectTest {


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<SubClazz> aClass = SubClazz.class;
        log.info("类名获取，{}", aClass);
        log.info("实例获取，{}", new SubClazz().getClass());
        log.info("实例获取，{}", Class.forName("org.lattice.java.lab.core.SubClazz"));
        log.info(aClass.getName());
        log.info(aClass.getSimpleName());
        SubClazz subClazz = aClass.newInstance();
        //log.info("获取属性, {}",subClazz.getSum());
        log.info("父类, {}",aClass.getSuperclass());
        log.info("实现的接口, {}",aClass.getInterfaces());
        log.info("声明的字段, {}",aClass.getDeclaredFields());
        log.info("所有声明的字段，包含父类的, {}",aClass.getFields());
        log.info("获取声明的方法, {}",aClass.getDeclaredMethods());
        log.info("获取构造方法, {}",aClass.getDeclaredConstructors());
    }



    public void warpException() throws BizException {
        try{
            // doSomething
        }catch (NumberFormatException e){
            throw new BizException("message handle ", e);
        }

    }
}
