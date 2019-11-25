package Product;

import Product.repository.ProductRepository;
import Product.repository.ProductRepositoryImpl;
import Product.service.ProductService;
import Product.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }
    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }
}
