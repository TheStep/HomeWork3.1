package ru.greekbrains.fruitBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    //объявляем лист
    private ArrayList<T> fruits;

    public Box(T... arr) {
        fruits = new ArrayList<>();
    }

    //добавляем фрукты
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    //метод получения веса
    public float getWeight() {
        if (fruits.size() == 0) return 0.0f;
        else return (fruits.size() * fruits.get(0).getWeight());
    }

    // метод сравнения
    public boolean compare(Box box) {
        return (Math.abs(this.getWeight() - box.getWeight()) < 0.0001);
    }

    //метод перекладки фруктов из ящика в ящик
    public void shiftTheFruit(Box<? super T> sameBox) {
        sameBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
