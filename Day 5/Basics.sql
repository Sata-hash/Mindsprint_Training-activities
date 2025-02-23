create database testdb;
use testdb;

CREATE TABLE Student
(
  S_id INT NOT NULL,
  Address VARCHAR(255) NOT NULL,
  Name VARCHAR(255) NOT NULL,
  Phone VARCHAR(10) NOT NULL,
  Email VARCHAR(15) NOT NULL,
  PRIMARY KEY (S_id),
  UNIQUE (Email)
);

CREATE TABLE Course
(
  C_id INT NOT NULL,
  Price FLOAT NOT NULL,
  Name VARCHAR(10) NOT NULL,
  description VARCHAR(255) NOT NULL,
  PRIMARY KEY (C_id)
);

CREATE TABLE Enrollment
(
  Amount_Paid FLOAT NOT NULL,
  Date_ DATE NOT NULL,
  E_id INT NOT NULL,
  S_id INT NOT NULL,
  C_id INT NOT NULL,
  PRIMARY KEY (E_id),
  FOREIGN KEY (S_id) REFERENCES Student(S_id),
  FOREIGN KEY (C_id) REFERENCES Course(C_id)
);