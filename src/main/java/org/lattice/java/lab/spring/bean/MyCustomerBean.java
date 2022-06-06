package org.lattice.java.lab.spring.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/3/11 16:21
 */
@Component
public class MyCustomerBean implements BeanNameAware, InitializingBean {


    @Override
    public void setBeanName(String name) {
        System.out.println(" 进入 BeanNameAware " + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("进入 InitializingBean");
    }
}
