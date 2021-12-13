DROP TABLE IF EXISTS crud_work;

CREATE TABLE crud_work
(
   id INT NOT NULL AUTO_INCREMENT,
   product_name VARCHAR(100) NOT NULL,
   quantity INT NOT NULL,
   PRIMARY KEY(id)
);