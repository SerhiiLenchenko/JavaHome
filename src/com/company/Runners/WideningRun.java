package com.company.Runners;
import com.company.WideningCasting;
/**
 * Created by fishes on 3/18/2017.
 */
public class WideningRun {
    public static void main (String[] args) {
       WideningCasting Asd = new WideningCasting();
       Asd.byte1 = 111;
       WideningCasting Qwe = new WideningCasting();
       System.out.println("Asd byte1 ="+ Asd.byte1);
        System.out.println("Qwe byte1 ="+ Qwe.byte1);
        System.out.println("Asd float1 ="+ Asd.float1);
        System.out.println("Qwe byte1 ="+ Qwe.float1);
        System.out.println("Asd name ="+ Asd.name);
        System.out.println("Qwe name ="+ Qwe.name);

       WideningCasting.widening();

       Asd.name = "55";
        Qwe.name = "66";
        Asd.byte1 = 33;

        System.out.println("newAsd byte1 ="+ Asd.byte1);
        System.out.println("newQwe byte1 ="+ Qwe.byte1);
        System.out.println("newAsd float1 ="+ Asd.float1);
        System.out.println("newQwe byte1 ="+ Qwe.float1);
        System.out.println("Asd name ="+ Asd.name);
        System.out.println("Qwe name ="+ Qwe.name);
    }

}
