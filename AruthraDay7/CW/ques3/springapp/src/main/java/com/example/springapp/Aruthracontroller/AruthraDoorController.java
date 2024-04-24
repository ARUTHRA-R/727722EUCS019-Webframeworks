package com.example.springapp.Aruthracontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.springapp.Aruthramodel.AruthraDoor;
import com.example.springapp.Aruthraservice.AruthraDoorService;

@RestController
public class AruthraDoorController {
    @Autowired
    private AruthraDoorService ser;
    
    @PostMapping("/api/door")
    public ResponseEntity<AruthraDoor> post(@RequestBody AruthraDoor door)
    {
        if(ser.post(door))
        {
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/door")
    public ResponseEntity<List<AruthraDoor>> getAll()
    {
        List<AruthraDoor> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<AruthraDoor>> getbyId(@PathVariable int doorId)
    {
        List<AruthraDoor> li = ser.getbyDoorId(doorId);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/door/accessType/{accessType}")
    public ResponseEntity<List<AruthraDoor>> getbyType(@PathVariable String accessType)
    {
        List<AruthraDoor> li = ser.getbyType(accessType);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
