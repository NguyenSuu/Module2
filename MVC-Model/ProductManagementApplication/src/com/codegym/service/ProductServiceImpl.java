package com.codegym.service;


import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"SamSung S9",700,"searh google","Japan"));
        products.put(2,new Product(2,"Iphone11",1200,"searh google","USA"));
        products.put(3,new Product(3,"IphoneX",800,"searh google","China"));
        products.put(4,new Product(4,"Nokia",510,"searh google","Germany"));
        products.put(5,new Product(5,"Oppo",300,"searh google","VietNam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list=new ArrayList<>();
        for (Product product : products.values()) {
            if (name.equals(product.getName())) {
                 list.add(product);
            }
        }
        return list;
    }
}
