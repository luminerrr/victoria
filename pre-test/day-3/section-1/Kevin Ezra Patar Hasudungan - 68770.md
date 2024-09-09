1. B
2. B
3. C
4. True
5. B
6. B
7. False
8. C
9. C
10. D
11. 11
12. True
13. C
14. B
15. A
16. 
17. C
18. C
19. False
20. A
21. B
22. A
23. A
24. A
25. True
26. B
27. C
28. SELECT * FROM books;
29. B
30. B

Essays
1. 
```
  SELECT
    book.title AS book_title
    author.name AS author_name
    genre.name AS genre
  FROM
    books book
  JOIN
    authors author ON b.author_id = author.id
  JOIN
    genres genre ON b.genre_id = genre.id
  WHERE
    genre.name IN ("Mystery", Thriller)
```

2.
```
  SELECT
    borrower.name AS borrower_name
    COUNT(borrowed.id) AS count_books_borrowed
  FROM
    borrowers borrower
  JOIN
    borrowed_books borrowed ON borrower.id = borrowed.borrower_id
  GROUP BY
    borrower.name
  HAVING
    COUNT(borrowed.id) > 5
```

3.
```
  SELECT
    book.title
    COUNT(borrowed.id) AS count_book_borrowed
  FROM 
```