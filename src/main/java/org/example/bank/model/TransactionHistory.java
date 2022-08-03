package org.example.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "`TRANSACTIONS`")
@Setter
@Getter
@Entity

public class TransactionHistory {
    @Id
    @GeneratedValue
    private int id;

    private Double transactionAmount;
    private Double balance;

    @Enumerated(EnumType.STRING)
    private TransactionType transaction;

    @ManyToOne
    @JoinColumn(name = "source_account_id")
    private BankAccount sourceAccount;

    @ManyToOne
    @JoinColumn(name = "destination_account_id")
    private BankAccount destinationAccount;

    @Temporal(TemporalType.DATE)
    private Date transaction_date = new Date();

}
