CREATE TABLE product (
     id VARCHAR(255) PRIMARY KEY UNIQUE NOT NULL,
     name VARCHAR(150) NOT NULL,
     price DECIMAL(10,2) NOT NULL
);