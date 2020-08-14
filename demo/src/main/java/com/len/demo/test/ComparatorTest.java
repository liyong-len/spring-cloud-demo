package com.len.demo.test;

import com.len.demo.test.entity.Book;
import com.len.demo.test.entity.Person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 实现Comparator排序功能
 *
 * @ClassName ComparatorTest
 * @Description ComparatorTest
 * @Author liyong
 * @Date 2020/8/12 09:14
 * @Version 1.0
 */
public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();

        Comparator<Person> compareTo = (o1, o2) -> {
            int m = -Integer.valueOf(o1.getMoney()).compareTo(Integer.valueOf(o2.getMoney()));
            int a = Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
            int n = o1.getName().compareTo(o2.getName());
            int b = Integer.valueOf(o1.getBook().getPrice()).compareTo(Integer.valueOf(o2.getBook().getPrice()));
            return (m != 0 ? m : (a != 0 ? a : (n != 0 ? n : b)));
        };

        Book b1 = new Book("a", 12);
        Book b2 = new Book("b", 12);
        Book b3 = new Book("c", 12);
        Person p1 = new Person("a", 1, 1, b1);
        Person p2 = new Person("a", 2, 1, b2);
        Person p3 = new Person("a", 1, 1, b3);
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        System.out.println(ts);

    }
}
