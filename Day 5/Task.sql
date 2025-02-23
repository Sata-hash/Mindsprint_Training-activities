create database activity;
use activity;

CREATE TABLE Member
(
  Member_id INT NOT NULL,
  Name VARCHAR(255) NOT NULL,
  Email VARCHAR(25) NOT NULL,
  PRIMARY KEY (Member_id)
);

CREATE TABLE Loan
(
  Loan_id INT NOT NULL,
  Loan_Date DATE NOT NULL,
  Return_date DATE NOT NULL,
  Member_id INT NOT NULL,
  PRIMARY KEY (Loan_id),
  FOREIGN KEY (Member_id) REFERENCES Member(Member_id)
);

CREATE TABLE Book
(
  Book_id INT NOT NULL,
  Title VARCHAR(25) NOT NULL,
  Author VARCHAR(25) NOT NULL,
  Loan_id INT NOT NULL,
  PRIMARY KEY (Book_id),
  FOREIGN KEY (Loan_id) REFERENCES Loan(Loan_id)
);