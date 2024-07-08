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
        System.out.println("Перегруз на" + overload + "кг !");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);


        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        var dog2 = dog-3.5;
        System.out.println(dog2);
        var cat2 = cat -1.6;
        System.out.println(cat2);
        var paper2 = paper - 7639;
        System.out.println(paper2);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общая масса бойцов " + boxerWeight + "кг!");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + weightDifference + "кг!");

        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println(  "Остаток от деления " + weightDifference2  );

        var totaltime = 640;
        var time = 8;
        var employeeInCompany = totaltime / time;
        System.out.println("Всего работников в компании " + employeeInCompany + " человек!" );
        var employeeInCompany2 = employeeInCompany + 94;
        System.out.println("Если в компании работает на 94 чел больше " + employeeInCompany2 + " человек!");
        var totaltime2 = employeeInCompany2 * 8;
        System.out.println("Если в компании работает 174 человек то " + totaltime2 + " часов работы может быть поделено между сотрудниками ! ");
    }
}