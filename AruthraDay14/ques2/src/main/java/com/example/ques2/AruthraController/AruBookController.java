package com.example.ques2.AruthraController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques2.AruthraModel.AruBook;
import com.example.ques2.AruthraService.AruBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class AruBookController {
    @Autowired
    AruBookService bookService;

    @PostMapping("/api/book")
    public AruBook addBook(@RequestBody AruBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public AruBook updateBook(@PathVariable int id,@RequestBody AruBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<AruBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<AruBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}

