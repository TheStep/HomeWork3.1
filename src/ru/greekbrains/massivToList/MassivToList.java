package ru.greekbrains.massivToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MassivToList {
    public static void massivToLIst() {
        //объявляем массив
        String[] arr = {"Bob", "Jack", "Biba", "Boba", "Fifa"};
        List<String> list = arrToArrList(arr);
        //записываем массив в аррай
        arrToArrList(arr);
        //выводим результат
        System.out.println(list.getClass() + " : " + list);
    }

    private static <T> ArrayList arrToArrList(T[] arr) { //метод прописания в новый аррайлист списка имен
        return new ArrayList<>(Arrays.asList(arr));
    }
}
