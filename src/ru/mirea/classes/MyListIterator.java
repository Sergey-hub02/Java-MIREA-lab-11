package ru.mirea.classes;

import java.util.Iterator;


public class MyListIterator<E> implements Iterator<E> {
  private Node<E> current;

  /**
   * Создаёт итератор для указанного списка
   * @param list          список
   */
  public MyListIterator(MyList<E> list) {
    this.current = list.getHead();
  }

  /**
   * Возвращает true, если следующая итерация возможна
   */
  public boolean hasNext() {
    return (this.current != null);
  }

  /**
   * Возвращает данные текущего элемента и меняет ссылку на текущий элемент на следующий
   */
  public E next() {
    E data = this.current.getData();
    this.current = this.current.getNext();

    return data;
  }
}
