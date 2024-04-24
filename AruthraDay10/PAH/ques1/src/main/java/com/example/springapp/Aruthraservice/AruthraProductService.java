package com.example.springapp.Aruthraservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Aruthramodel.AruthraProduct;
import com.example.springapp.Aruthrarepository.AruthraProductRepo;

@Service
public class AruthraProductService {
    @Autowired
    private AruthraProductRepo productRepo;

    public boolean saveProduct(AruthraProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<AruthraProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public AruthraProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public AruthraProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}