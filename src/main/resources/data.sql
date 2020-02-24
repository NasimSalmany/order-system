DROP TABLE IF EXISTS products;

CREATE TABLE products (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO products (name, description) VALUES
  ('Iphone XS', 'Apple Phone'),
  ('Samsung Galaxy', 'Phone'),
  ('Ipad', 'Tablet');