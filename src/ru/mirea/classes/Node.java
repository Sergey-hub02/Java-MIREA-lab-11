package ru.mirea.classes;

/**
 * Представляет узел однонаправленного списка
 */
public class Node<T> {
  private T data;
  private Node next;

  /**
   * Создаёт лист
   * @param data            данные узла
   */
  public Node(T data) {
    this.data = data;
  }

  /**
   * Создаёт узел с данными и ссылкой на следующий элемент
   * @param data            данные узла
   */
  public Node(T data, Node next) {
    this.data = data;
    this.next = next;
  }

  /**
   * Геттер для поля data
   * @return                данные узла
   */
  public T getData() {
    return this.data;
  }

  /**
   * Сеттер для поля data
   * @param data            данные узла
   */
  public void setData(T data) {
    this.data = data;
  }

  /**
   * Геттер для поля next
   * @return                ссылка на следующий узел
   */
  public Node getNext() {
    return this.next;
  }

  /**
   * Сеттер для поля next
   * @param next            ссылка на следующий узел
   */
  public void setNext(Node next) {
    this.next = next;
  }
}
