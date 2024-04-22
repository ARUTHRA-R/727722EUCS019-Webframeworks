package com.example.day5cw1.Aruthraservice;

import org.springframework.stereotype.Service;

import com.example.day5cw1.Aruthramodel.AruthraProduct;
import com.example.day5cw1.Aruthrarepository.AruthraProductRepo;

@Service
public class AruthraProductService {
    public AruthraProductRepo productRepo;
    public AruthraProductService(AruthraProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AruthraProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AruthraProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AruthraProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
