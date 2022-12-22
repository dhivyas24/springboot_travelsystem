package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/travel/{id}")
public class findbytid {
	@Autowired UserRepo ob;
	@GetMapping()
	    public List<Travel> getAllNotes(@PathVariable("id") String id)
	    {

	        return ob.findbytid(id);

	        
	    }
}