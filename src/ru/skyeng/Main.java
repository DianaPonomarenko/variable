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
        System.out.println("���� �����" + name + "� ���" + age + " ���");

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("��� ����� ��������" + capacityLeft + " �� �����");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println(" ����� ��� �������" + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("����� ��� ���������" + productsWeight + "��!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("����� ��������" + leftWeight + " ��!");

        productsWeight = productsWeight * 2;
        System.out.println("������ ��� ���������" + productsWeight);
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("������ ����� ��������" + leftWeight + "�� !");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("�������� ��" + overload + "�� !" );

        var productsInOneCar = productsWeight / 2;
        System.out.println("��������� � ����� ������ ������ " + productsInOneCar );






    }
        public static void main2(String[] args) {
            System.out.println("��������");
            System.out.println( "��� ���� ������� ");
            System.out.println( " english language is ok");


    }

}