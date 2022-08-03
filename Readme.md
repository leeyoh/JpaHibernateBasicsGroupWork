# Jpa and Hibernate Practice

There are 5 projects in here, each in a separate package.

Everyone should keep in mind the following
1. There is a **shared** package with some user input stuff and other stuff.
2. Use OOP.
3. Create a github repo, and make your group partners admins.
4. Group partner with name earlier in alphabet, codes first.
5. Create entities.
6. Agree on when to take lunch break and agree on when to come back.
7. Next person alphabetically will code
8. Work on implementing your repository.
9. Next student codes.
10. Put everything together:
    * Think of "use cases" and making each a method in a service class.
    * Fill in those methods, one at a time.
    * Test each use case manually
    * Simplify


## Bank Account
Tables 

User  
ID | Address | Name 
1  | 1address | Jay 

Account 
ID | Balance ( Any Double (neg or positive)) | account creation Date 
1  | 100                                     | 
2  | 200 
3  | 159
4  | 123

Transaction_history 
account_id | amount | balance | where (enum)   | source id | Time Stamp
1          | 50     | 50      | transfer       | 2         | 
2          | -50    | -50     | transfer 
1          | 1      | 101     | deposit        | 
2          |        |         | transfer       | 1 
3          |        |         | withdraw 

User_to_Account 
User_ID | Account_ID
1       | 1
1       | 2
1       | 3

-----
Main logic loop 

1. User is prompted for name, address. ( only shown once )
   1. Create the account
   2. Create initial balance 

Store new account, user, user to account, transaction ( create)

If there are accounts in the database,  
      Select Account ( only shown if there are accounts)
      Create account
      Deposit
      Widthdraw
      Transfer


**Phase 1 Features**:
* The user is prompted for name, address, initial deposit amount.
* // User Class 
* // - Name ( String)
* // - Address (String)
* // - Accounts ( Map < String, Account> ), < Name of the account, Account handle> 

* // Account Class 
* // -  Initial Deposit ( Numeric )

* The user's input is saved to a database.
* // Class mapped to entity 

* The user can deposit money.
* // Select then update
* // Lookup way to do both at the same time. Update ( field += value)

* The user can withdraw money.
* // Select then update 
* // Lookup way to do both, if the balance is negative do something. 

* The user can see how much money is in their account.
* // Query, select 

* The user can create another account.
* // - Create account -> initial balance -> link the account to the user, and the tables need to be updated. 

***Phase 1 Stretch***:
* The user can transfer money between accounts.
* // Select -> list all accounts and balances
* // Fetch the first user in the table *it should be replaced with fetch all users, and prompt user to select. 
* -- User has been selected 
* List all accounts that belong to the user. 
* SELECT * FROM user 
* JOIN user_to_account ON user.ID = user_to_account.user_ID
* JOIN account ON user_to_account.account_ID = account.ID 
// ^ will return all balances and id 

var account1, account2
* // Prompt first account 
* List all accounts, put selected account as account 1
* // Prompt second account 
* List all remaining accounts, put selected account on account 2
//DO MATH
* // prompt amount ( error handling for unsupported balances.)
UPDATE the accounts with the new balances. If the math works. 
* UPDATE balance FROM account_table WHERE id = account ID
* x2 

**Phase 2 Features**:
* The user can see a record of all deposits and withdrawals and transfers from their accounts.
* The user sees their balance in red if it is negative and green if it is positive.
* //Color code according to balance 
* One unit test
* Unit test to verify account deposit.

