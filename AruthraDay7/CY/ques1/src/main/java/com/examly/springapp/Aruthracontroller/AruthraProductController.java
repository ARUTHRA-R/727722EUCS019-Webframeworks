package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.AruthraProduct;
import com.examly.springapp.service.AruthraProductService;

@RestController
public class AruthraProductController {
    @Autowired
    AruthraProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<AruthraProduct> postMethod(@RequestBody AruthraProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<AruthraProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<AruthraProduct>> dndcjk() {
        List<AruthraProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<AruthraProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<AruthraProduct>> getbyid(@PathVariable String productCategory) {
        List<AruthraProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AruthraProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<AruthraProduct>> getbdyid(@PathVariable String priceCategory) {
        List<AruthraProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AruthraProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
