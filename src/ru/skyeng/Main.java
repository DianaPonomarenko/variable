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
        System.out.println("a + b =" + result1);
        var result = (a / 2) * b;
        System.out.println("(a / 2) * b" + result);
        var result3 = a / b;
        System.out.println("a / b =" + result3);
        var result2 = a * b;
        System.out.println("a * b =" + result2);
        var name = "Diana";
        var age = 29;
        System.out.println("Меня зовут" + name + "и мне" + age + " лет");

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить" + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println(" Общий вес фруктов" + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов" + productsWeight + "кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось" + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов" + productsWeight);
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось" + leftWeight + "кг !");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на" + overload + "кг !" );

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar );






    }
        public static void main2(String[] args) {
            System.out.println("Проверка");
            System.out.println( "Еще одна попытка ");
            System.out.println( " english language is ok");


    }

}