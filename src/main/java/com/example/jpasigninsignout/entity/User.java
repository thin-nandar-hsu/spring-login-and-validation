package com.example.jpasigninsignout.entity;

import com.example.jpasigninsignout.validation.NamedNotAdmin;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NamedNotAdmin(message = "Name can't be Admin! ")
    @Column(unique = true,name = "username")
    private String userName;
    private String password;
    @Transient
    private String repeatedPassword;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER )   // default type is Lazy
    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role){
        roles.add(role);
        role.getUser().add(this);
    }


}
