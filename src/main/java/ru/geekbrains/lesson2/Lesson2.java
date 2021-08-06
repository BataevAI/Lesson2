package ru.geekbrains.lesson2;

public class Lesson2 {

    public static void main(String[] args) {

Sum_10_20(10, 1);
PosOrNeg(-4);
isNegOrPos(-900);
NumOfStrings("Плясала дудка", 7);
        isVisokos(804);
    }

    public static boolean Sum_10_20 (int x, int y) {

    int sum = x + y;
    boolean t = (sum >= 10) && (sum <= 20);
        System.out.println(t);
            return t;
    }

public static void PosOrNeg (int a) {

String num = a >= 0 ? "Число является положительным" : "Число является отрицательным" ;
    System.out.println(num);

}
    public static boolean isNegOrPos(int y) {

        boolean num2 = y < 0? true : false;
        System.out.println(num2);
        return num2;

    }

public static void NumOfStrings (String s, int i) {

        for (int j = 0; j < i; j++) {

            System.out.println(s);

        }

}

public static boolean isVisokos (int year) {

    int yearVis1, yearVis2, yearVis3;

    yearVis1 = year % 400;

    yearVis2 = year % 100;

    yearVis3 = year % 4;
    boolean v;


    if (yearVis1 == 0)   {

        System.out.println("Это есть високосный год");
    v = true;}

    else if ((yearVis1 != 0) && (yearVis2 != 0) && (yearVis3 == 0)) {

     System.out.println("Это есть високосный год");
        v = true;

    }

    else { System.out.println("это совсем обычный год");
        v = false;
    }

return v;

}


}
