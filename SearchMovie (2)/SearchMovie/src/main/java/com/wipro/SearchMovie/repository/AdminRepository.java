package com.wipro.SearchMovie.repository;


import org.springframework.data.repository.CrudRepository;

import com.wipro.SearchMovie.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer> {
    Admin findByEmail(String email);
}
