package ru.vsu.cs.course1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

// 4, -3, 5, 10, 100, -1<--, 3, 1
// -3, 1, 3, 4, 5,-1<--, 10, 100
// 0, 0, 0, 0, 0, 1<--, 0, 0
public class Task {

    public static <T extends Comparable<T>> void sort(T[] data, boolean[] fixed) {
        sort(data, Comparable::compareTo);
    }


    /*public static int[] sort(int[] data, int[] fixed) {
        for (int i = 0; i < data.length; i++) {
            if (fixed[i] == 1) continue;
            int value = data[i];
            // поиск места элемента в готовой последовательности
            int j;
            for (j = i - 1; j >= 0 && data[j] > value; j--) {
                data[j + 1] = data[j];
                    // сдвигаем элемент направо, пока не дошли
            }
            // место найдено, вставить элемент
            data[j + 1] = value;
        }
        return data;
    }*/

}




