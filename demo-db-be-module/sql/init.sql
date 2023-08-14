create schema db;

CREATE table "db".userdb(
	id serial primary key,
	nome varchar(255),
	cognome varchar(255)
);