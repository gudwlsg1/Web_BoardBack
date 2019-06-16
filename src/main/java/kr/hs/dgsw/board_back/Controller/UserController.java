package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/api/users/{id}")
    public User getUser(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @GetMapping(value = "/api/users")
    public List users(){
        return this.userService.findAll();
    }

    @PostMapping(value = "/api/users")
    public Long addUser(@RequestBody User user){
        return this.userService.add(user);
    }

    @PostMapping(value= "/api/users/login")
    public User login(@RequestBody User user){
        return this.userService.login(user);
    }

    @PutMapping(value = "/api/users")
    public int updateUser(@RequestBody User user){
        return this.userService.modify(user);
    }

    @DeleteMapping(value = "/api/users/{id}")
    public int deleteUser(@PathVariable Long id){
        return this.userService.deleteById(id);
    }
}

