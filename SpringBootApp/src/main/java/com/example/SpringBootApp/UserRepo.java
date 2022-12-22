package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface UserRepo extends JpaRepository<Travel,Integer> {

	
	    List<Travel> findAll();
	    @Query(value = "SELECT * FROM travel u where u.tid = ?1", nativeQuery = true)
	    List<Travel> findbytid(String id);
	    

@Transactional
@Modifying
@Query(value = "Update travel u set u.tid = ?1 , u.tname =?2 , u.tdes = ?3  where u.tid = ?4 ", nativeQuery = true)
void update(String tid,String tname,String tdesr,String id);

@Modifying
@Transactional 
@Query(value = "DELETE FROM travel t WHERE t.tid= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String tid);

}