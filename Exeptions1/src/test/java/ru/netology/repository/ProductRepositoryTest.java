package ru.netology.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
  private ProductRepository repository = new ProductRepository();
  private Book coreJava = new Book();

  @Test
  public void shouldSaveOneItem() {
    repository.save(coreJava);

    Product[] expected = new Product[]{coreJava};
    Product[] actual = repository.findAll();
    assertArrayEquals(expected, actual);
  }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void removeById() {
    }
}
