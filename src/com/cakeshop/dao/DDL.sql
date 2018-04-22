CREATE TABLE cs_item 
  ( 
     id          VARCHAR PRIMARY KEY, 
     NAME        VARCHAR2(255), 
     description VARCHAR(2000), 
     price       DECIMAL, 
     quantity    NUMBER 
  );