package io.github.futurewl.sbs.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    private Long id;

    private String username;

    private String password;


    @ToString.Exclude
    @OneToMany(mappedBy = "userByUserId", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<UserAddress> userAddressesById;
}
