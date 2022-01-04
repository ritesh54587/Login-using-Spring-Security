package com.sangamone.secondboot.controller;




import org.springframework.data.repository.CrudRepository;




public interface UserRepo extends CrudRepository<User, Integer>{
	
	User findByUsername(String username);
	


}
