package com.company;

import java.util.Comparator;
import java.util.List;

/**
 * Класс с реализацией сортировки вставками для массивов и списков
 */
public class InsertionSort {

    /**
     * Сортировка простыми вставками
     *
     * @param <T> Произвольный (но ссылочный) тип элементов массива
     * @param data Сортируемый массив типа T
     * @param c Компаратор для сравнения элементов
     */
    public static <T> void sort(T[] data, Comparator<T> c) {
        int size = data.length;
        for (int i = 0; i < size; i++) {
            T value = data[i];
            // поиск места элемента в готовой последовательности
            int j;
            for (j = i - 1; j >= 0 && c.compare(data[j], value) > 0; j--) {
                data[j + 1] = data[j];     // сдвигаем элемент направо, пока не дошли
            }
            // место найдено, вставить элемент
            data[j + 1] = value;
        }
    }

    /**
     * Сортировка простыми вставками (без компаратора для сравнимых элементов)
     *
     * @param <T> Сравнимый тип элементов массива
     * @param data Сортируемый массив типа T
     */
    public static <T extends Comparable<T>> void sort(T[] data) {
        sort(data, Comparable::compareTo);
    }





    /**
     * Сортировка простыми вставками массива целых (int) чисел (в качестве
     * примера)
     *
     * @param data Сортируемый массив целых (примитивный тип int) чисел
     */
    public static void sort(int[] data) {
        int size = data.length;
        for (int i = 0; i < size; i++) {
            int value = data[i];
            // поиск места элемента в готовой последовательности
            int j;
            for (j = i - 1; j >= 0 && data[j] > value; j--) {
                data[j + 1] = data[j];     // сдвигаем элемент направо, пока не дошли
            }
            // место найдено, вставить элемент
            data[j + 1] = value;
        }
    }





    /**
     * Сортировка простыми вставками
     *
     * @param <T> Произвольный (но ссылочный) тип элементов списка
     * @param data Сортируемый список типа T
     * @param c Компаратор для сравнения элементов
     */
    public static <T> void sort(List<T> data, Comparator<T> c) {
        int size = data.size();
        for (int i = 0; i < size; i++) {
            T value = data.get(i);
            // поиск места элемента в готовой последовательности
            int j;
            T tmp;
            for (j = i - 1; j >= 0 && c.compare(tmp = data.get(j), value) > 0; j--) {
                data.set(j + 1, tmp);     // сдвигаем элемент направо, пока не дошли
            }
            // место найдено, вставить элемент
            data.set(j + 1, value);
        }
    }

    /**
     * Сортировка простыми вставками (без компаратора для сравнимых элементов)
     *
     * @param <T> Сравнимый тип элементов списка
     * @param data Сортируемый список типа T
     */
    public static <T extends Comparable<T>> void sort(List<T> data) {
        sort(data, (a, b) -> a.compareTo(b));
    }
}
