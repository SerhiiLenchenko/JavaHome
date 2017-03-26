package com.company;

/**
 * Created by fishes on 3/18/2017.
 */
public class Types {

        public static void main(String[] args) {
            byte b = 111; // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
            short s = 1123;
            int i = 64536;
            long l = 2147483648L; // Постфикс l или L обозначает литералы типа long
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);

    }
}
