package ru.greekbrains.changePositionsOfElementsInArray;

import java.util.Arrays;

public class ChangePositionsOfElementsInArray {

    public static void changePositionsOfElementsInArrays() {
        //объявляем
        Integer[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"1", "2", "3", "4", "5"};
        //прописываем
        System.out.println(Arrays.toString(arr1) + " Инта");
        System.out.println(Arrays.toString(arr2) + " Стринга");
        System.out.print("\n");
        //меняем меставми элементы в массиве
        swapTwoElementsInArray(arr1, 1, 2);
        swapTwoElementsInArray(arr2, 0, 4);
        //прописываем то что мы перевернули
        System.out.println(Arrays.toString(arr1) + " Инта");
        System.out.println(Arrays.toString(arr2) + " Стринга");
    }

    private static void swapTwoElementsInArray(Object[] arr, int pos1, int pos2) {
        Object t = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = t;
    }
}
