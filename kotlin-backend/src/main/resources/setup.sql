
DROP TABLE IF EXISTS demo;
CREATE TABLE IF NOT EXISTS demo (
  id    INTEGER PRIMARY KEY NOT NULL ,
  name VARCHAR(255) NOT NULL
);


DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
  id    INTEGER PRIMARY KEY NOT NULL ,
  name VARCHAR(255) NOT NULL,
  password VARCHAR(100) NOT NULL,
  mail VARCHAR(256)
);