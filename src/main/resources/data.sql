insert into customer(id, name) values (1, 'Jane');
insert into customer(id, name) values (2, 'Doe');
insert into customer(id, name) values (3, 'Tom');

INSERT INTO TRANSACTION(ID, CUSTOMER_ID, TRANSACTION_DATE, TOTAL) VALUES
(1, '1', '2019-10-17 10:00:10', 100),
(2, '2', '2019-10-17 11:20:10', 321),
(3, '1', '2019-10-17 12:00:10', 2315),
(4, '3', '2019-10-17 10:20:10', 3236),
(5, '2', '2019-10-17 11:00:10', 26);
