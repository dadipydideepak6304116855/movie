package com.wipro.SearchMovie.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SearchMovie.Service.AdminService;
import com.wipro.SearchMovie.entity.Admin;
import com.wipro.SearchMovie.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepository adminRepository;
    @Override
    public String loginUser(Admin admin, String type) {
        Admin dbAdmin = adminRepository.findByEmail(admin.getEmail());
        if(dbAdmin == null){
            return "User not found";
        }
        if(!dbAdmin.getType().equals(type)){
            return "Login UnAuthorized";
        }
        if(!admin.getPassword().equals(dbAdmin.getPassword())){
            return "wrong credentials";
        }
        return "success";
    }
}
