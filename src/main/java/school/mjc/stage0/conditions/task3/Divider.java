package school.mjc.stage0.conditions.task3;

import java.sql.SQLOutput;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number == 0)
            System.out.println("cannot divide by zero");
        else if(number % 5 == 0 || number % 11 == 0)
            System.out.println("Dividable");
        else
            System.out.println("Non-dividable");
    }

    public static void main(String[] args) {
        Divider v = new Divider();
        v.isDividableBy5And11(0);
        v.isDividableBy5And11(5);
        v.isDividableBy5And11(11);
        v.isDividableBy5And11(55);
    }
}
