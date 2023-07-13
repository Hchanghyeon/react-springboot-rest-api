create table products(
    product_id VARCHAR(50) PRIMARY KEY,
    product_name VARCHAR(20) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price bigint NOT NULL,
    description VARCHAR(500) DEFAULT NULL,
    created_At datetime(6) NOT NULL,
    updated_At datetime(6) DEFAULT NULL
);
