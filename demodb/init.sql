create schema db;

CREATE table "db".userdb(
	id varchar(255) primary key,
	nome varchar(255),
	cognome varchar(255)
);

insert into "db".userdb values ('1', 'prova nome', 'prova cognome');
