CREATE DATABASE library;

USE library;
CREATE TABLE location (
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    location_name VARCHAR (100),
    address VARCHAR(200)
);
CREATE TABLE book(
	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    subtitle VARCHAR(150),
    author VARCHAR (200) NOT NULL,
    publication_date DATE NOT NULL,
    publisher VARCHAR(100),
    isbn INT NOT NULL,
    edition VARCHAR(50) NOT NULL,
    format VARCHAR (50),
    location_ID INT NOT NULL,
    FOREIGN KEY (location_ID) REFERENCES location(ID)
);

CREATE TABLE member (
	first_name VARCHAR (100),
    last_name VARCHAR (100),
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    phone_number VARCHAR(20),
    address VARCHAR(150),
    registration_date DATE,
    DOB DATE,
    current_borrow VARCHAR (500),
    total_borrows INT NOT NULL
);
CREATE TABLE staff (
	first_name VARCHAR (100),
    last_name VARCHAR (100),
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    job_title VARCHAR(20),
    salary DECIMAL,
    location_ID INT NOT NULL,
    FOREIGN KEY (location_ID) REFERENCES location(ID)
);
CREATE TABLE borrow (
	borrow_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	member_ID INT NOT NULL,
    staff_ID INT NOT NULL,
    book_ID INT NOT NULL,
    FOREIGN KEY (member_ID) REFERENCES member(ID),
    FOREIGN KEY (staff_ID) REFERENCES staff(ID),
    FOREIGN KEY (book_ID) REFERENCES book(ID)
);
