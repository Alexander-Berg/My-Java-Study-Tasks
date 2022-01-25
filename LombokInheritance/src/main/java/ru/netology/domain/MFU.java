package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

class Printer {
  public void print() {
  }
}

class Scanner {
  public void scan() {
  }
}
@NoArgsConstructor
@AllArgsConstructor
@Data
class MFU {
  private Printer printer;
  private Scanner scanner;

  public void print() {
    printer.print();
  }

  public void scan() {
    scanner.scan();
  }
}

















