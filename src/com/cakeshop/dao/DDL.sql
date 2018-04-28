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
  
  insert into cs_item values('ITM_1001', 'Delicious Cheesecake', 'Delicious Cheesecake in Huge Pan With Choco Slices', 100.50, 10, 'cake', 'Brownies', 'images/items/freshCake1.jpg');
  
  CREATE TABLE CS_LOGIN
  (
  	email		varchar,
  	password	varchar
  );
  
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