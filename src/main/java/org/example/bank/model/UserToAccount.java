package org.example.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "`USER_TO_ACCOUNT`")
@Setter
@Getter
@Entity

public class UserToAccount {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private BankAccount bankAccount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private UserAccount userAccount;
}



