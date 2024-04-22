package com.example.day6cw3.Aruthraservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.Aruthramodel.AruthraProduct;
import com.example.day6cw3.Aruthrarepository.AruthraProductRepo;

@Service
public class AruthraProductService {
    public AruthraProductRepo productRepo;
    public AruthraProductService(AruthraProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AruthraProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AruthraProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AruthraProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AruthraProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
