package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/travel/{id}")
	public class update {	
		@Autowired UserRepo ob;
		@PutMapping()
		    public String getAllNotes(@RequestBody Travel log,@PathVariable("id") String id)
		    {
			 //LogModel logs = ob.findbybookid(bookid);
			
			 
						String tid =log.getTid();
						String tname = log.getTname();
						String desr= log.getTdes();
						

				       
						
						ob.update(tid,tname,desr,id);
					 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		