package ru.javaops.bootjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractPersistable<Integer> {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private Set<Role> roles;
}