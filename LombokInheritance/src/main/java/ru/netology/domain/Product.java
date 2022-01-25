package ru.netology.domain;

import lombok.Data;
import org.mockito.Mock;
import ru.netology.repository.ProductRepository;

import java.util.Collection;
import java.util.Objects;
@Data
public class Product {
  @Mock
  private int id;
  private String name;
  private int price;


  public Product(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Product() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return id == product.id &&
            price == product.price &&
            Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price);
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
  }


  public Collection<Object> getTiTtle() {
    return null;
  }

  public class ProductManager {
    // добавьте необходимые поля, конструкторы и методы

    public Product[] searcyBy(String text) {
      Product[] result = new Product[0];
      ProductRepository repository = new ProductRepository();
      for (Product product : repository.findAll()) {
        if (product.matches(text)) {
          Product[] tmp = new Product[result.length + 1];
          // используйте System.arraycopy, чтобы скопировать всё из result в tmp
          tmp[tmp.length - 1] = product;
          result = tmp;
        }
      }
      return result;
    }
  }

  private boolean matches(String text) {
    return false;
  }


}
