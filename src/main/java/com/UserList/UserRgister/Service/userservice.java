package com.UserList.UserRgister.Service;

import com.UserList.UserRgister.Exception.ResourceNotFoundException;
import com.UserList.UserRgister.Model.UserRegister;
import com.UserList.UserRgister.Repository.jparepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userservice {

    @Autowired
    jparepo Jpa;

    public UserRegister addData(UserRegister registers) {
        return this.Jpa.save(registers);
    }

    public List<UserRegister> getAllRecords() {
        return this.Jpa.findAll();
    }

    public Optional<UserRegister> getRecord(Integer id) {
        return this.Jpa.findById(id);
    }

    public UserRegister update(Integer id, UserRegister registers) {

        UserRegister oldRecords = this.Jpa.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));

        oldRecords.setUserid(registers.getUserid());
        oldRecords.setFirstname(registers.getFirstname());
        oldRecords.setLastname(registers.getLastname());
        oldRecords.setCity(registers.getCity());
        return this.Jpa.save(oldRecords);

    }
    public String deleteuser(Integer uid)
    {
        this.Jpa.deleteById(uid);

        return "Successfully Deleted";

    }

}