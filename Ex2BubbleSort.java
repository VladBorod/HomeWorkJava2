//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//Импорт функций.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Создание класса.
public class Ex2BubbleSort {
    //    Создание main.
    public static void main(String[] args) {
//       Ввод длтнны массива.
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter length: ");
        int listLength = sc.nextInt();
//       Ввод данных массива.
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listForBubbleSort = new ArrayList<Integer>();
        for (int i = 0; i < listLength; i++) {
            listForBubbleSort.add(Integer.valueOf(reader.nextLine()));
        }
        sc.close();
        reader.close();
//  Конвертация массива типа ArrayList в Integer[], с целью дальнейшей работы с функцией.
        Integer[] arr = listForBubbleSort.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    //   Создание функции пузырьковой сортировки.
    public static Integer[] bubbleSort(Integer[] array){
//  Логический компонент, считаем, что массив не отсортирован.
        boolean arrSorted = false;
        int temp;
//       Цикл, пока массив не отсортирован...
        while (!arrSorted) {
            arrSorted = true;
//          Бежим по индексам.
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    arrSorted = false;
//          Меняем через временную переменную.
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}

