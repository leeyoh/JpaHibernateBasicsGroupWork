package org.example.bank;

import org.example.bank.model.*;
import org.example.shared.io.UserInputService;
import org.example.shared.io.UserOutputService;
import org.example.shared.io.console.ConsoleUserInputServiceImpl;
import org.example.shared.io.console.ConsoleUserOutputServiceImpl;
import org.example.shared.io.validation.InputValidationRule;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class BankMain {


    public static void main(String[] args){
        // Generate Tables
        // Declare variables
        BankAccount bankAccount;
        UserAccount user;
        UserToAccount userToAccount;
        TransactionHistory transactionHistory;

        //Entity JPA Hibernate
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        //Console Stuff
        UserOutputService uos = new ConsoleUserOutputServiceImpl();
        UserInputService uis = new ConsoleUserInputServiceImpl(uos);

        /**
         * Valid in America
         */
        InputValidationRule addressRule = new InputValidationRule() {
            @Override
            public boolean isValid(String input) {
                return Pattern.matches("[A-Za-z0-9'\\.\\-\\s\\,]",input);
            }
        };
        InputValidationRule notBlank = new InputValidationRule() {
            @Override
            public boolean isValid(String input) {
                return  input.length() >= 1;
            }
        };

        InputValidationRule isNumber = new InputValidationRule() {
            @Override
            public boolean isValid(String input) {
                return Pattern.matches("\\d+",input);
            }
        };




//        BankAccount[] bankAccounts = {
//                new BankAccount(),
//                new BankAccount()
//        };
        //System.out.println(uis.getUserChoice("choose",bankAccounts));


//        //Generate User
//        String name = uis.getUserInput("Name: ",new InputValidationRule[]{notBlank});
//        String address = uis.getUserInput("Address: ",new InputValidationRule[]{ notBlank});
//        user = new UserAccount();
//        user.setName(name);
//        user.setAddress(address);
//
//        //Generate Initial account
//        double balance = Double.parseDouble(uis.getUserInput("Balance: ",new InputValidationRule[]{isNumber}));
//        bankAccount = new BankAccount();
//        bankAccount.setBalance(balance);
//
//        //Generate the User to Account
//        userToAccount = new UserToAccount();
//        userToAccount.setBankAccount(bankAccount);
//        userToAccount.setUserAccount(user);
//
//        //Generate Transaction
//        transactionHistory = new TransactionHistory();
//        transactionHistory.setTransaction(TransactionType.CREATE);
//        transactionHistory.setTransactionAmount(balance);
//        transactionHistory.setSourceAccount(bankAccount);
//        transactionHistory.setDestinationAccount(bankAccount);
//        transactionHistory.setBalance(balance);
//
//        entityManager.persist(user);
//        entityManager.persist(bankAccount);
//        entityManager.persist(userToAccount);
//        entityManager.persist(transactionHistory);
//        transaction.commit();





    }

}
