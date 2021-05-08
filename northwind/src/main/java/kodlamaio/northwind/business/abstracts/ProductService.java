package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> getAll();
}
