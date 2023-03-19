CREATE DATABASE pdvPlanBTech;
USE pdvPlanBTech;

CREATE TABLE if not exists cargos(
	id_Cargo INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL UNIQUE,
	Permissoes INTEGER NOT NULL
);

CREATE TABLE if not exists funcionario(
	id_Funcionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_Cargo INTEGER NOT NULL
);

create table if not exists usuario(
id_usuario		int 		auto_increment primary key,
login 			varchar(50),
senha			varchar(50)
);

create table if not exists receita(
id 		int 	auto_increment primary key
);

CREATE TABLE if not exists ingredientes(
	id_Ingrediente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL,
    id_Produto INTEGER NOT NULL,
    Valor_Ingrediente FLOAT(8,2)
);


CREATE TABLE if not exists pedido(
	id_Pedido INTEGER PRIMARY KEY,
<<<<<<< HEAD
    id_Pessoa INTEGER NOT NULL
=======
    id_Pessoa INTEGER NOT NULL,
    id_Receita INTEGER NOT NULL,
    pedido_Estado INTEGER NOT NULL DEFAULT 0,
    Valor_Total FLOAT(8,2)
>>>>>>> 03f2b2453e44dd16349700220a886d1f54b37430
);

CREATE TABLE if not exists estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Quantidade FLOAT(8,4) NOT NULL,
    Vencimento DATETIME,
    Valor_de_Compra FLOAT(6,2)
);