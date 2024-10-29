
-- Show me each user and the books which they are borrowing
SELECT c.ID, c.first_name "First Name", c.last_name "Surname", b.title "Borrowing" FROM library.borrow a
JOIN library.book b ON a.book_ID = b.ID
JOIN library.member c ON a.member_ID = c.ID

-- Show me all of the books I can find at North Facility
-- SELECT * FROM library.book a 
-- JOIN library.location b ON a.location_ID = b.ID
-- WHERE b.location_name = "North Facility"
