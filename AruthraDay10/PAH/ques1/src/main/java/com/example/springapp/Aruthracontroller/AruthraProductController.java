package com.example.springapp.Aruthracontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Aruthramodel.AruthraProduct;
import com.example.springapp.Aruthraservice.AruthraProductService;

@RestController
@RequestMapping("/api")
public class AruthraProductController {

    @Autowired
    private AruthraProductService productService;

    @PostMapping("/product")
    public ResponseEntity<AruthraProduct> save(@RequestBody AruthraProduct product) {
        if(productService.saveProduct(product))
            return new ResponseEntity<AruthraProduct>(product, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/product/bycategory/{category}")
    public ResponseEntity<List<AruthraProduct>> findByCategory(@PathVariable String category) {
        
        List<AruthraProduct> products = productService.findByCategoryList(category);
        if(products.size() > 0)
            return new ResponseEntity<>(products, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/product/{productId}/{quantityInStock}")
    public ResponseEntity<AruthraProduct> update(@PathVariable int productId, @PathVariable int quantityInStock) {
        AruthraProduct product = productService.updateProduct(productId, quantityInStock);
        if(product != null && product.getQuantityInStock() == quantityInStock)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> delete(@PathVariable int productId) {
        AruthraProduct product = productService.deleteProduct(productId);
        if(product == null)
            return new ResponseEntity<>("Product deteled successfully", HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}