package product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import product.repository.ProductRepository;
import product.repository.ProductRepositoryImpl;
import product.service.ProductService;
import product.service.ProductServiceImpl;

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
