CREATE TABLE accounts (
  id INT NOT NULL AUTO_INCREMENT,
  bank VARCHAR(45) NULL,
  card_number VARCHAR(45) NULL,
  debt DOUBLE NULL,
  cut_day DATE NULL,
  pay_day DATE NULL,
  credit_limit DOUBLE NULL,
  customer_service_phone VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );
