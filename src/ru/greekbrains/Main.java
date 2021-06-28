package ru.greekbrains;

import static ru.greekbrains.changePositionsOfElementsInArray.ChangePositionsOfElementsInArray.changePositionsOfElementsInArrays;
import static ru.greekbrains.fruitBox.countingInBox.counting;
import static ru.greekbrains.massivToList.MassivToList.massivToLIst;

public class Main {

    public static void main(String[] args) {
        // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        changePositionsOfElementsInArrays();
        System.out.println();
        //2. Написать метод, который преобразует массив в ArrayList;
        massivToLIst();
        System.out.println();
        //3. Большая задача:
        //a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        //b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        //g. Не забываем про метод добавления фрукта в коробку.
        counting();
    }
}
