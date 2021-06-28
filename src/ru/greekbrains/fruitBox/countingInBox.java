package ru.greekbrains.fruitBox;

public class countingInBox {
    public static void counting() {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());

        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        // для проверки сравнения
//        orangeBox.addFruit(orange);
//        orangeBox.addFruit(orange);

        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());

        //сравниваем коробки
        System.out.println(orangeBox.compare(appleBox));
        //объявляем новый ящик
        Box<Fruit> appleBox2 = new Box<>();
        //вызываем метод пересыпки из ящика в другой ящик
        appleBox.shiftTheFruit(appleBox2);
        //проверка
        System.out.println("Вес ящика после перекладывания во второй ящик = " + appleBox.getWeight());
        System.out.println("Вес второго ящика после перекладывания из первого ящика = " + appleBox2.getWeight());
    }
}
