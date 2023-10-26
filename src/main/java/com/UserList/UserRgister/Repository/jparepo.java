package com.UserList.UserRgister.Repository;

import com.UserList.UserRgister.Model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jparepo extends JpaRepository <UserRegister,Integer> {

}
