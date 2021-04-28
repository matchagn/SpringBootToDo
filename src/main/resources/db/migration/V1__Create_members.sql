CREATE TABLE todo
(
   id SERIAL PRIMARY KEY,
   done_flag BOOLEAN,
   task VARCHAR (100) NOT NULL,
   deadline DATE NOT NULL
);