 -- DROP TABLE grupo6 IF EXIST;
--  DROP TABLE grupo7 IF EXIST;

 -- CREATE DATABASE alumnado;

   USE alumnado;

   CREATE TABLE quimicaOrganica(
    
   idQO INT PRIMARY KEY,
    primerNombre VARCHAR(16) NOT NULL,
   nombrePosteriores VARCHAR(60),
    primerApellido VARCHAR(16) NOT NULL,
    segundoApellido VARCHAR(16),
    edad INT,
    nota FLOAT
  );

 -- CREATE TABLE fisicoquimica(

 --  idFQ INT PRIMARY KEY,
 --  primerNombre VARCHAR(16) NOT NULL,
 --  nombresPosteriores VARCHAR(60),
 --  primerApellido VARCHAR(16) NOT NULL,
 --  segundoApellido VARCHAR(16),
 --  edad INT,
 --  nota FLOAT

 -- );

 