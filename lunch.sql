create database lunch_or_net;
use lunch_or_net;

create table cprodutos(
id int auto_increment primary key,
produto varchar (30),
descricao varchar (200),
preçocusto decimal(5,2),
preçovenda decimal(5,2),
categoria varchar(30),
tipo varchar(30)
);

CREATE TABLE cadastro (
id BIGINT(10) AUTO_INCREMENT,
usuario VARCHAR(255) not null,
email VARCHAR(255),
senha VARCHAR(255),
confirmar_senha VARCHAR(255),
PRIMARY KEY (id)
);

create table endereco(
id int auto_increment primary key,
usuario varchar(30),
nome varchar(30),
cep varchar(10),
endereco varchar(50),
numero varchar(4),
complemento varchar(50),
bairro varchar(30),
cidade varchar(30),
uf varchar(4)

);

create table cartao(
id int auto_increment primary key,
bandeira varchar (20),
usuario varchar (30),
nome varchar (30),
numero varchar (20),
validade varchar(20),
cvv varchar(4)
);