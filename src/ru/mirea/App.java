package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.MyList;


public class App {
  private static final Scanner IN = new Scanner(System.in);

  /**
   * Запускает приложение
   * @param args                аргументы командной строки
   */
  public static void main(String[] args) {
    System.out.print("Введите количество элементов: ");
    int size = IN.nextInt();

    MyList<Integer> list = new MyList<>();
    System.out.println();

    for (int i = 0; i < size; ++i) {
      System.out.print("Введите элемент под индексом " + (i + 1) + ": ");
      list.add(IN.nextInt());
    }

    System.out.println();
    System.out.print("Список: [");

    for (int el : list)
      System.out.print(" " + el);

    System.out.println(" ]");
  }
}
