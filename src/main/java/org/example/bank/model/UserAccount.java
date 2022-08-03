package org.example.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "`USER`")
@Setter
@Getter
@Entity
public class UserAccount {
    @Id
    @Column(name="user_id")
    @GeneratedValue
    private int id;
    private String name;
    private String address;
}
