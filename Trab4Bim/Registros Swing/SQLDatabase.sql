create database Registros;

use Registros;

create table Registro(
    id integer primary key auto_increment,
    nome varchar(100),
    sobrenome varchar(100),
    email varchar(100),
    cpf varchar(11),
    rg varchar(7),
    senha varchar(100),
    usuario varchar(100),
    dt_nascimento date
);