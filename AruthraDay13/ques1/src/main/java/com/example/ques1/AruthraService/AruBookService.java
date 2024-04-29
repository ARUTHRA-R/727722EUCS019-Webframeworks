package com.example.ques1.AruthraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruAuthor;
import com.example.ques1.AruthraModel.AruBook;
import com.example.ques1.AruthraRepository.AruAuthorRepo;
import com.example.ques1.AruthraRepository.AruBookRepo;


@Service
public class AruBookService {
    @Autowired
    private AruBookRepo bookRepository;
@Autowired
private AruAuthorRepo authorRepository;
    public AruBook saveBook(Long authorId, AruBook book) {
        AruAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AruBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}


