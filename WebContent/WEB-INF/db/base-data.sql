CREATE TABLE cs_item 
  ( 
     id          VARCHAR PRIMARY KEY, 
     NAME        VARCHAR2(255), 
     description VARCHAR(2000), 
     price       DECIMAL, 
     quantity    NUMBER,
     category	 varchar(55),
     sub_category varchar(255),
     image_path VARCHAR(2000)
  );
----
insert into cs_item values('ITM_1001', 'Delicious Cheesecake', 'Delicious Cheesecake in Huge Pan With Choco Slices', 100.50, 10, 'Cake', 'Brownies', 'images/items/freshCake1.jpg');
----
insert into cs_item values('ITM_1002', 'Good Cheesecake', 'Good Cheesecake in Huge Pan With Choco Slices', 200.50, 10, 'Cake', 'Brownies', 'images/items/freshCake2.jpg');
----
insert into cs_item values('ITM_1003', 'Ok Cheesecake', 'Ok Cheesecake in Huge Pan With Choco Slices', 300.50, 10, 'Cake', 'Brownies', 'images/items/freshCake3.jpg');
----
insert into cs_item values('ITM_1004', 'Very Good Cheesecake', 'Very Good Cheesecake in Huge Pan With Choco Slices', 400.50, 10, 'Cake', 'Brownies', 'images/items/freshCake4.jpg');
----
insert into cs_item values('ITM_1005', 'Ok Cheesecake', 'Ok Cheesecake in Huge Pan With Choco Slices', 500.50, 10, 'Cake', 'Milky', 'images/items/freshCake1.jpg');
----
insert into cs_item values('ITM_1006', 'Ok Cheesecake', 'Ok Cheesecake in Huge Pan With Choco Slices', 600.50, 10, 'Cake', 'Milky', 'images/items/freshCake2.jpg');
  CREATE TABLE CS_LOGIN
  (
  	email		varchar,
  	password	varchar,
  	status		varchar(50)
  );
----
INSERT INTO CS_LOGIN VALUES('admin@cakshop.com', 'password', 'Enabled');
----
  CREATE TABLE cs_address
(
	Id varchar(50) PRIMARY KEY,
	Fk varchar(50),
	FlatNo varchar(10),
	Area varchar(30),
	Landmark varchar(30),
	PinCode number(8),
	City varchar(30),
	State varchar(30),
	Country varchar(30)
);
----
stop