package com.company;

/**
 * Created by fishes on 3/18/2017.
 */
public class Characters {
    public static void main(String[] args) {
        char a = 'l', b = 110, c = 'c';
       // b = (char) ((a - c)); // Можно складывать, вычитать, делить и умножать
        // Но из-за особенностей арифметики Java результат приходится приводить к типу char явно
        System.out.println(a);
        System.out.println(b);// Выведет символ 'b'
        System.out.println(c);
    }
}
