package ru.netology.container;

public class Box {
  private Object value;

  public Box(Object value) {
    this.value = value;
  }

  public boolean isEmpty() {
    return value == null;
  }

  public Object getValue() {
    return value;
  }
}
//public class Ticket implements Comparable<Ticket> {}
//public class TicketByPriceAscComparator implements Comparator<Ticket> {
//  public int compare(Ticket o1, Ticket o2) {
//    return o1.getPrice() - o2.getPrice();
//indAll(String from, String to, Comparator<Ticket> comparator)
//Arrays.sort(result), а Arrays.sort(result, comparator)
//  }

