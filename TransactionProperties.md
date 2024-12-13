# Transaction Properties ( also known as ACID Properties)

### Google definition of a Transaction
In a database management system (DBMS), a transaction is a logical unit of work that accesses or modifies a database's
contents. Transactions are made up of a series of read and write operations that are completed according to defined 
criteria. 

### 4 Keys properties of Transaction Management in DBMS
In the world of Databases, the Transactions are characterized by ACID properties that ensure reliable database transactions,
even when things go wrong:

1. Atomicity: Ensures that the transaction must be complete or have no effect. The transaction is indivisible like an atom.
   Example: Double Rollback is done while transferring money between accounts to ensure both debit 
   and credit must occur, or neither should.

2. Consistency: The transaction must conform to the database's existing constraints.
   Example: User account balances can't go negative, if a transaction tries to dithdraw more money than a user has, the DBMS should detect
   this consistency violation and cancel the complete transaction to keep DB consistent.

3. Isolation: Ensures that The transaction must not affect other transactions. Transactions must be concurrent.
   Example: Two users cannot overwrite each other's changes during simultaneous updates.
            Making transactions serializable, run one after another in a line.

4. Durability: Once a transaction is committed, the changes are permanent, even in the event of a system failure.
   Example: After committing a transfer, the changes should persist even if the database crashes.

### Satisfying Transaction Properties in General vs MongoDB

*In General*
1. Atomicity: Add a transaction manager to manage start, commit, and rollback operations and use transaction logs 	      to roll back incomplete operations.
2. Consistency: Define database constraints like primary key, foreign key and unique constraints and use them wisely.
3. Isolation: Implement isolation levels like Read Committed, Repeatable Read, Serializable.
	      Add locking mechanisms to prevent dirty reads, non-repeatable reads, or phantom reads.
4. Durability: Always commit transactions, do check storage level before marking a transaction.

*In MongoDB*
1. Atomicity: Single-document operations are atomic by default.
   Multi-document transactions in MongoDB ensure that all operations within the transaction are either successfully committed or fully rolled back..
2. Consistency: Use schema and define schema validation rules at the collection level, rule voilation rejects complete operation.
3. Isolation: MongoDB provides snapshot isolation for transactions for multi-document transactions. We can use locking mechanism and session based issolation aw well.
   Add locking 
4. Durability: Transaction operations are written to in-memory buffers.
   The in-memory buffers are flushed to a journal file before the transaction is committed.
   Once the journal write is successful, the transaction is considered durable, ensuring durability even in case of a crash

### Reference: MongoDB official documentation on transaction
"https://www.mongodb.com/docs/drivers/php/laravel-mongodb/v5.x/transactions/"

### Contact
Your suggestions are always welcome as "cvsnehankita@gmail.com".