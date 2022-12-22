package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Travel {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String tname,tid,tdes;

    Travel() {}

    Travel(String tname,String tid,String tdes)

    {
this.setTid(tid);
this.setTname(tname);
this.setTdes(tdes);
    


    }



	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTdes() {
		return tdes;
	}

	public void setTdes(String tdes) {
		this.tdes = tdes;
	}
}