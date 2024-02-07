  -- CREATE DATABASE comercio;

 --  USE comercio;

  CREATE TABLE clients (

   -- Id int(20) PRIMARY KEY NOT NULL,
    Name VARCHAR(20) NOT NULL,
    overNames VARCHAR(150),
    firstSurname VARCHAR(20) NOT NULL,
   secondSurname VARCHAR(20),
   mail VARCHAR(50)
   );

-- USE clients;

--    CREATE TABLE producto(

 --       idProducto int(20) FOREIGN KEY NOT NULL,
  --      titulo VARCHAR (100) NOT NULL,
  --      descripcion VARCHAR(500) NOT NULL

  --  );

 -- USE producto;

 --   CREATE TABLE ventas(

  --      idFactura int(20) FOREIGN KEY NOT NULL,
  --      titulo VARCHAR(100) NOT NULL,
  --      precio FLOAT(23) NOT NULL,
  --      cantidad int
  --  );
 -- USE ventas;
 