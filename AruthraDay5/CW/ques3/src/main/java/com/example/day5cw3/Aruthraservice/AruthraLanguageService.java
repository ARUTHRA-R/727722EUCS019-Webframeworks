package com.example.day5cw3.Aruthraservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.Aruthramodel.AruthraLanguage;
import com.example.day5cw3.Aruthrarepository.AruthraLanguageRepo;

@Service
public class AruthraLanguageService {
    private AruthraLanguageRepo languageRepo;
    public AruthraLanguageService(AruthraLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(AruthraLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AruthraLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AruthraLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AruthraLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
