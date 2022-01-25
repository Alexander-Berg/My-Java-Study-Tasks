package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import ru.netology.repository.ProductRepository;
@NoArgsConstructor
@AllArgsConstructor
public class ProductManager {
    private ProductRepository repository;
    // добавьте необходимые поля, конструкторы и методы
    public Product[] searcyBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        if (product instanceof Book) { // если в параметре product лежит объект класса Book
            Book book = (Book) product; // положем его в переменную типа Book чтобы пользоваться методами класса Book
            if (((Book) product).getAuthor().contains(search)) { // проверим есть ли поисковое слово в данных об авторе
                return true;
            }
            if (product.getTiTtle().contains(search)) {
                return true;
            }
            return false;
        }

        return false;
    }
}
