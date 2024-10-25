-- Insert data into location
INSERT INTO location (location_name, address) VALUES
('Central Office', '123 Main St, Anytown, USA'),
('East Branch', '456 East Ave, Anytown, USA'),
('West Depot', '789 West Rd, Anytown, USA'),
('North Facility', '321 North Blvd, Anytown, USA'),
('South Hub', '654 South Ln, Anytown, USA');

-- Insert data into book
INSERT INTO book (title, subtitle, author, publication_date, publisher, isbn, edition, format, location_ID) VALUES
('The Great Adventure', 'Journey Begins', 'Alice Johnson', '2020-01-15', 'Adventure Press', 978, '1st', 'Hardcover', 1),
('Mystery of the Lost Artifact', NULL, 'Bob Smith', '2019-05-20', 'Mystery House', 9789, '1st', 'Paperback', 2),
('Learning SQL', 'A Comprehensive Guide', 'Carol White', '2021-03-10', 'Tech Publishers', 97812, '2nd', 'eBook', 3),
('Cooking 101', NULL, 'David Brown', '2018-07-30', 'Culinary Press', 97, '3rd', 'Hardcover', 4),
('The Art of War', NULL, 'Sun Tzu', '2022-11-11', 'Classic Books', 9, '5th', 'Paperback', 5);

-- Insert data into member
INSERT INTO member (first_name, last_name, phone_number, address, registration_date, DOB, current_borrow, total_borrows) VALUES
('John', 'Doe', '555-1234', '101 Elm St, Anytown, USA', '2020-02-01', '1990-04-10', NULL, 5),
('Jane', 'Smith', '555-5678', '202 Oak St, Anytown, USA', '2021-06-15', '1985-12-20', NULL, 3),
('Emily', 'Johnson', '555-8765', '303 Pine St, Anytown, USA', '2019-08-22', '1992-03-05', NULL, 7),
('Michael', 'Brown', '555-4321', '404 Maple St, Anytown, USA', '2022-09-30', '1988-07-15', NULL, 1),
('Sarah', 'Davis', '555-6789', '505 Birch St, Anytown, USA', '2023-01-10', '1995-11-30', NULL, 2);

-- Insert data into staff
INSERT INTO staff (first_name, last_name, job_title, salary, location_ID) VALUES
('Alice', 'Williams', 'Librarian', 40000.00, 1),
('Bob', 'Taylor', 'Assistant Librarian', 35000.00, 2),
('Charlie', 'Anderson', 'Library Technician', 30000.00, 3),
('Diana', 'Thomas', 'Page', 25000.00, 4),
('Eva', 'Moore', 'Clerk', 28000.00, 5);

-- Insert data into borrow
INSERT INTO borrow (member_ID, staff_ID, book_ID) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5),
(1, 1, 3),
(2, 2, 1);
