package product.service;

import org.springframework.beans.factory.annotation.Autowired;
import product.model.Product;
import product.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }
}
