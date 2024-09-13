package io.github.futurewl.sbs.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class UserAddress {

    @Id
    private int id;

    private String city;

    @JsonBackReference
    @ManyToOne
    @ToString.Exclude
    private User userByUserId;

}
