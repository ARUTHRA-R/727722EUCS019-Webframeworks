package com.example.ques1.AruthraController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques1.AruthraModel.AruBook;
import com.example.ques1.AruthraService.AruBookService;



@RestController
public class AruBookController {
    @Autowired
    private AruBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<AruBook> getBookById(@PathVariable Long bookId) {
        AruBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

