DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS vehicles;

CREATE TABLE IF NOT EXISTS customers (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    customerId VARCHAR(50) UNIQUE,

    first_name VARCHAR(50),
    last_name VARCHAR(50),

    email VARCHAR(50),
    username VARCHAR(50),
    password VARCHAR(50),

    street_address VARCHAR(50),
    postal_code VARCHAR(50),
    city VARCHAR(50),
    province VARCHAR(50),

    phone_number VARCHAR(15),
    phone_type VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS vehicles (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    vehicleid VARCHAR(50),
    inventoryid VARCHAR(50),

    status VARCHAR(50),
    "usage" VARCHAR(50),
    "year" INTEGER,
    make VARCHAR(50),
    model VARCHAR(50),

    "value" DOUBLE,
    currency VARCHAR(50)
);