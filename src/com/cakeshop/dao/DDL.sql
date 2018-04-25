CREATE TABLE cs_item 
  ( 
     id          VARCHAR PRIMARY KEY, 
     NAME        VARCHAR2(255), 
     description VARCHAR(2000), 
     price       DECIMAL, 
     quantity    NUMBER 
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
