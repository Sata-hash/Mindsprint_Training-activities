create database transaction_practice;

use transaction_practice;

CREATE TABLE Accounts (
account_id VARCHAR(10) PRIMARY KEY,
account_name VARCHAR(100),
balance DECIMAL(10, 2)
);
 
INSERT INTO Accounts (account_id, account_name, balance) 
VALUES
('A001', 'Alice', 1000.00),
('A002', 'Bob', 1500.00),
('A003', 'Charlie', 2000.00);

select * from Accounts;


begin;
update Accounts set balance = balance + 100 where account_id = 'A001';

update Accounts set balance = balance - 100 where account_id = 'A001';
commit;

begin;
update Accounts set balance = balance + 100 where account_id = 'A001';
update Accounts set balance = balance - 100 where account_id = 'A002';
rollback;
select * from Accounts;

-- Savepoint
begin;
update Accounts set balance = balance + 100 where account_id = 'A001';
savepoint sp1;
update Accounts set balance = balance - 100 where account_id = 'A002';

rollback to sp1;
commit;

-- Procedure is precompiled SQL statements which decreases the execution time

Delimiter // -- change the termination symbol 
create procedure getAllAccounts()
begin
	select * from Accounts;
end // -- last line of procedure

Delimiter ; -- again change the termination symbol from // to ;

call getAllAccounts();
show tables;
