package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/addtravel")
public class save {

@Autowired UserRepo ob;

@PostMapping()
	public String savebook(@RequestBody Travel log)
	{
	Travel a= new Travel();
	String id=log.getTid();
	String name =log.getTname();
	
	String desr=log.getTdes();
	
	a.setTid(id);
	a.setTname(name);
	a.setTdes(desr);
	
 Travel first = new Travel(id,name,desr);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  