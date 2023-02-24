package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 2:29 PM
 */
public class SimpleFactory {

    public static void main(String[] args) {
        // 1.创建工厂对象
        SimpleFactory simpleFactory = new SimpleFactory();
        // 2.通过工厂对象创建产品对象
        Product product = simpleFactory.createProduct("B");
        // 3.调用产品对象的方法
        product.show();
    }

    public Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("B".equals(type)) {
            return new ProductB();
        } else {
            return null;
        }
    }

    public interface Product {
        void show();
    }

    public static class ProductA implements Product {
        @Override
        public void show() {
            System.out.println("ProductA");
        }
    }

    public static class ProductB implements Product {
        @Override
        public void show() {
            System.out.println("ProductB");
        }
    }
}
