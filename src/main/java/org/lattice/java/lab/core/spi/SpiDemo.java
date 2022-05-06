package org.lattice.java.lab.core.spi;

import org.lattice.java.lab.core.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/5/4 10:41
 */
public class SpiDemo {


    public static void main(String[] args) {
        /*ServiceLoader<Search> loader = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.search("lattice");
        }*/


        List<Optional<User>> userList = new ArrayList<>();
        userList.add(Optional.of(new User(1L)));
        userList.add(Optional.of(new User(2L)));
        userList.add(Optional.of(new User(3L)));
        List<Long> list = userList.stream()
                .map(Optional::get)
                .map(User::getId)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
