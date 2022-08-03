package org.example.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "BANK_ACCOUNT")
@Setter
@Getter
@Entity
public class BankAccount {
    @Id
    @Column(name="account_id")
    @GeneratedValue
    private int id;
    private Double Balance;
    @Temporal(TemporalType.DATE)
    private Date creation_date = new Date();

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", Balance=" + Balance +
                ", creation_date=" + creation_date +
                '}';
    }
}
