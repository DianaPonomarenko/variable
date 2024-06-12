package ru.skyeng;

public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var a = 3;
        var b = 5;
        var result1 = a + b;
        System. out.println( "a + b ="+ result1);
        var result = ( a / 2 ) * b;
        System.out.println("(a / 2) * b"+ result);
        var result3 = a / b;
        System.out.println( "a / b =" + result3);
        var result2 = a * b;
        System.out.println("a * b =" + result2);
        var name = "Diana";
        var age = 29;
        System.out.println("Меня зовут" + name +"и мне" + age + " лет");

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить" + capacityLeft + " кг вещей");







    }

}