package com.UserList.UserRgister.Controller;


import com.UserList.UserRgister.Model.UserRegister;
import com.UserList.UserRgister.Service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/homepage")
public class Homecontroller {
    @GetMapping("/welcomepage")
    public String welcome(){
        return "hi this hithub page";
    }
 @Autowired
 userservice userservices;
    @PostMapping("/register")
    public UserRegister Addvalues(@RequestBody UserRegister registers) {

        return this.userservices.addData(registers);
    }
@GetMapping("/getrecords")
    public List<UserRegister> getData(){
        return this.userservices.getAllRecords();
}
@GetMapping("/getparticularrecord/{id}")
    public Optional<UserRegister>getrecord(@PathVariable (value = "id")Integer id){

        return this.userservices.getRecord(id);
}
    @PutMapping("/upadatingproducts/{id}")
    public UserRegister updateuser(@PathVariable(value="id")Integer identity, @RequestBody UserRegister registers)

    {
        return this.userservices.update(identity,registers) ;
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteuser(@PathVariable(value="id")Integer uid)
    {
        return this.userservices.deleteuser(uid);
    }


}
