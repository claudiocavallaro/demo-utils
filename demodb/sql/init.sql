create schema db;

CREATE table "db".userdb(
	id serial primary key,
	nome varchar(255),
	cognome varchar(255)
);
CREATE INDEX USERDB_DB_ID
  ON "db".USERDB (ID);

Create sequence "db".user_id
start 1
increment 1
owned by "db".userdb.id;

insert into "db".userdb(
    nome,
    cognome)
values ('prova nome', 'prova cognome');
