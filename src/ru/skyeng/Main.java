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
        System.out.println("Всего работников в компании "
                + employeeInCompany + " человек!" );
        var employeeInCompany2 = employeeInCompany + 94;
        System.out.println("Если в компании работает на 94 чел больше "
                + employeeInCompany2 + " человек!");
        var totaltime2 = employeeInCompany2 * 8;
        System.out.println("Если в компании работает 174 человек то " + totaltime2 + " часов работы может быть поделено между сотрудниками ! ");

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");

        byte a1 = 1;
        short b1 = 1;
        int c1 = 1;
        int d = a1 + b1 + c1;
         System.out.println(d);

         float g1 = a1 + 1f;
         System.out.println(g1);

         int a2 = 1;
         byte b2 = 10;
         float  c2 = 4.57f;
         System.out.println(a2);
         System.out.println(b2);
         System.out.println(c2);

         float a3 = 27.12f;
         long b3 = 9876789554L;
         float c3 = 2.786f;
         int v2 = 569;
         short g2 = -159;
         short h3 = 27897;
         byte f2 = 67;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);
        System.out.println(v2);
        System.out.println(g2);
        System.out.println(h3);
        System.out.println(f2);

        byte LP = 23 * 3;
        System.out.println("У Людмилы Павловны " + LP+  " учеников" );
        byte AS = 27 * 3;
        System.out.println("У Анны Сергеевны " + AS +  " учеников" );
        byte  EA = 30 * 3;
        System.out.println("У Екатерины Андреевны " + EA +  " учеников"  );
        int totalStudents= LP + AS + EA;
        System.out.println("Всего учеников " + totalStudents );
        int totalSheetsOfPaper = 480;
        System.out.println("Всего листов бумаги " + totalSheetsOfPaper + " листов");
        float numberOfSheetsOfPaperForEachStudent = totalSheetsOfPaper / totalStudents ;
        System.out.println("Количество листов бумаги на каждого ученика по " + numberOfSheetsOfPaperForEachStudent +" Шт");

        byte machinePerformanceInOneMinutes = 16 / 2;
        System.out.println("Производительность машины за одну минуты " + machinePerformanceInOneMinutes + " шт.бутылок");
        int machinePerformanceInTwentyMinutes = machinePerformanceInOneMinutes * 20;
        System.out.println("Производительность машины за 20 минуты " + machinePerformanceInTwentyMinutes + " шт.бутылок" );
        int machinePerformanceForDay = machinePerformanceInOneMinutes * 1440;
        System.out.println("Производительность машины за сутки " + machinePerformanceForDay + " шт. бутылок");
        int machinePerformanceFor3Day = machinePerformanceForDay * 3;
        System.out.println("Производительность машины за 3 дня " + machinePerformanceFor3Day+ " шт. бутылок");
        int  machinePerformanceForMonth = machinePerformanceFor3Day * 10;
        System.out.println("Производительность машины за месяц " + machinePerformanceForMonth+ " шт. бутылок");

        int totalCans = 120;
        System.out.println("Всего банок " + totalCans + " нужно для школы");
        byte cansOfWhitePaintForOneClass = 2;
        System.out.println( "Для одного класса понадобиться " + cansOfWhitePaintForOneClass + " банки с белой краской");
        byte cansOfBrownPaintForOneClass = 4;
        System.out.println( "Для одного класса понадобиться " + cansOfBrownPaintForOneClass + " банки с коричневой краской");
        int totalCansOneClass = cansOfWhitePaintForOneClass + cansOfBrownPaintForOneClass;
        System.out.println("Для одного класса понадобиться " + totalCansOneClass  + " банок с краской");
        int totalClasses = totalCans / totalCansOneClass;
        System.out.println("Всего классов " + totalClasses);
        int totalBrownСans = totalClasses * cansOfBrownPaintForOneClass;
        System.out.println("В школе, где 20 классов нужном " + totalBrownСans + " банок с коричневой краской");
        int totalWhiteСans = totalClasses * cansOfWhitePaintForOneClass;
        System.out.println("В школе, где 20 классов нужном " + totalWhiteСans + " банок с белой краской");

        byte bananas1 = 80;
        System.out.println("Один банан весит " + bananas1 + " гр." );
        int bananasForBreakfast5 = bananas1 * 5;
        System.out.println("Вес бананов для завтрака " + bananasForBreakfast5 + " гр.");
        byte Milk100 = 105;
        System.out.println("100 мл. молока весит " + Milk100 +" гр.");
        int MilkForBreakfast = Milk100 * 2;
        System.out.println("Вес молока для завтрака " + MilkForBreakfast  + " гр.");
        byte iceСream = 100;
        System.out.println("Одна порция мороженого весит " + iceСream +" гр.");
        int iceСreamForBreakfast = iceСream * 2;
        System.out.println("Вес мороженого для завтрака " + iceСreamForBreakfast  + " гр.");
        byte egg = 70;
        System.out.println("Одно яйцо весит " + egg  + " гр.");
        int eggsForBreakfast = egg * 4;
        System.out.println("Вес яиц для завтрака " + eggsForBreakfast + " гр.");
        int Breakfast = bananasForBreakfast5 + MilkForBreakfast + iceСreamForBreakfast + eggsForBreakfast;
        System.out.println("Вес спортзавтрака " + Breakfast + " гр.");
        byte gram = 1;
        System.out.println("Один грамм " + gram + " гр.");
        double kilogram = gram * 1000;
        System.out.println("Один киллограмм " + kilogram + " гр." );
        double BreakfastKg = Breakfast / kilogram;
        System.out.println("Вес спортзавтрака " + BreakfastKg + " кг.");

        int salaryM = 67760;
        System.out.println("Зарплата Маши " + salaryM + " руб. в мес.");
        int salaryD= 83690;
        System.out.println("Зарплата Дениса " + salaryD + " руб. в мес.");
        int salaryK = 76230;
        System.out.println("Зарплата Кристины " + salaryK  + " руб. в мес.");
        int salaryEmployees = salaryM + salaryD + salaryK;
        System.out.println("Зарплата всех сотрудников " + salaryEmployees  + " руб. в мес." );
        int salaryEmployeesYear = salaryEmployees * 12;
        System.out.println("Зарплата всех сотрудников " + salaryEmployeesYear  + " руб. в год" );
        double increasePerYear = 1.1;
        int months = 12;
        double salaryMUp = salaryM * increasePerYear;
        double salaryDUp = salaryD * increasePerYear;
        double salaryKUp = salaryK * increasePerYear;
        double salaryResult = salaryMUp * months;
        System.out.println( "ЗП Маши за год составляет с надбавкой " + salaryResult + "руб. в год" );
        double salaryResult2 = salaryDUp * months;
        System.out.println( "ЗП Денисе за год составляет с надбавкой " + salaryResult2 + "руб. в год" );
        double salaryResult3 = salaryKUp * months;
        System.out.println( "ЗП Кристины за год составляет с надбавкой " + salaryResult3 + "руб. в год" );
        double salaryEmployeesYear2 = salaryResult + salaryResult2 + salaryResult3;
        System.out.println("Зарплата всех сотрудников с надбавкой " + salaryEmployeesYear  + " руб. в год" );
        double salaryDifference = salaryEmployeesYear2 - salaryEmployeesYear;
        System.out.println("годовой доход всех сотрудников вырос на " + salaryDifference  + " руб. в год" );

    }
}