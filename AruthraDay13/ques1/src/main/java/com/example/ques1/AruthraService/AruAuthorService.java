package com.example.ques1.AruthraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ques1.AruthraModel.AruAuthor;
import com.example.ques1.AruthraRepository.AruAuthorRepo;



@Service
public class AruAuthorService {
    @Autowired
    private AruAuthorRepo authorRepository;

    public AruAuthor saveAuthor(AruAuthor author) {
        return authorRepository.save(author);
    }

    public AruAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AruAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AruAuthor updateAuthor(Long id, AruAuthor author) {
        AruAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}

