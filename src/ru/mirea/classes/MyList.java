package ru.mirea.classes;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyList<T> implements Iterable<T> {
  private int size;
  private Node<T> head;
  private Node<T> tail;

  /**
   * Создаёт пустой список
   */
  public MyList() {
    this.size = 0;
    this.head = null;
    this.tail = null;
  }

  /**
   * Добавляет элемент с указанными данными в конец списка
   * @param element           данные добавляемого узла
   */
  public void add(T element) {
    Node<T> node = new Node(element, null);

    if (this.head == null) {        // пустой список
      this.head = node;
      this.tail = node;

      ++this.size;
      return;
    }

    this.tail.setNext(node);
    this.tail = node;               // смещаем хвост

    ++this.size;
  }

  /**
   * Геттер для поля head
   * @return                  начальный элемент списка
   */
  public Node<T> getHead() {
    return this.head;
  }

  /**
   * Геттер для поля tail
   * @return                  конечный элемент списка
   */
  public Node<T> getTail() {
    return this.tail;
  }

  /**
   * Возвращает размер списка
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Возвращает итератор для объекта
   */
  public Iterator<T> iterator() {
    return new MyListIterator<T>(this);
  }
}
