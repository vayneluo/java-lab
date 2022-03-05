package org.lattice.java.lab.java8.java8_in_action.chapter6;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @description: 菜肴
 * @author: Lattice
 * @see DishTypeEnum
 * @date 2022/2/17 09:12
 */
@Data
public class Dish {

    private String name;

    private Integer calorie;

    private DishTypeEnum dishType;

    public Dish(String name, Integer calorie, DishTypeEnum dishType) {
        this.name = name;
        this.calorie = calorie;
        this.dishType = dishType;
    }

    public static void main(String[] args) {
        List<Dish> dishes = CollUtil.newArrayList();
        dishes.add(new Dish("Green Vegetables", 100 , DishTypeEnum.VEGETABLES));
        dishes.add(new Dish("Beef", 800 , DishTypeEnum.MEAT));
        dishes.add(new Dish("Pork", 1200 , DishTypeEnum.MEAT));
        dishes.add(new Dish("Apple", 300 , DishTypeEnum.FRUIT));
        // 找出这些菜肴的名称？
        dishes.stream().map(Dish::getName).forEach(System.out::println);
        // 过滤出卡路里大于1000的？
        dishes.stream().filter(e -> e.getCalorie() > 1000).forEach(System.out::println);
        // 根据菜肴类型分组，找出每组菜肴热量最大的？
        Map<DishTypeEnum, Optional<Dish>> map = dishes
                .stream()
                .collect(Collectors.groupingBy(Dish::getDishType, Collectors.maxBy(Comparator.comparing(Dish::getCalorie))));

        System.out.println("");
    }

}
