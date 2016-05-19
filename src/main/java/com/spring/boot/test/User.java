package com.spring.boot.test;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
public class User {

    @Id
    private Long id;
    @NotNull
    @Column(unique = true)
    @Pattern(regexp = "[a-zA-Z_\\-\\.0-9]+")
    @Size(min = 1, max = 30)
    private String username;
    private String password;

    protected User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
