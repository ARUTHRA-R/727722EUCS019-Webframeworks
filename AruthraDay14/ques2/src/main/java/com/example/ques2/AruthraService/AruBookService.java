package com.example.ques2.AruthraService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques2.AruthraModel.AruBook;
import com.example.ques2.AruthraRepository.AruBookRepo;


@Service
public class AruBookService {
   @Autowired
   AruBookRepo bookRepo;

   public AruBook addBook(AruBook book)
   {
        return bookRepo.save(book);
   }

   public List<AruBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<AruBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public AruBook updateBook(int id,AruBook book)
   {
        AruBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}

