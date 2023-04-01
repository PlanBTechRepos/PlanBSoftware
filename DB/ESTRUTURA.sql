DROP DATABASE IF EXISTS pdvPlanBTech;
CREATE DATABASE pdvPlanBTech;
USE pdvPlanBTech;

CREATE TABLE IF NOT EXISTS cargos(
	id_Cargo INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS funcionario(
	id_Funcionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_Cargo INTEGER NOT NULL,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL
);

create table IF NOT EXISTS usuario(
id_usuario	INTEGER PRIMARY KEY AUTO_INCREMENT,
id_Funcionario	INTEGER NOT NULL,
usuario 			VARCHAR(50),
senha			VARCHAR(50),
permissao INTEGER NOT NULL DEFAULT 0
);

create table IF NOT EXISTS receita(
id_Receita 		INTEGER PRIMARY KEY AUTO_INCREMENT,
id_Ingrediente  INTEGER NOT NULL,
nome_receita VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ingredientes(
	id_Ingrediente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL unique
);


CREATE TABLE IF NOT EXISTS pedido(
	id_Pedido INTEGER PRIMARY KEY,
    id_Pessoa INTEGER NOT NULL,
    id_Receita INTEGER NOT NULL,
    cliente VARCHAR(50),
    Valor_Total decimal(8,2),
    status_pedido INTEGER NOT NULL DEFAULT 0
);
CREATE TABLE IF NOT EXISTS estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Quantidade int NOT NULL,
    Recebimento date default( sysdate()),
    Vencimento DATE ,
    tipo_Ingrediente INTEGER unique, #mussarela, refri
    Valor_de_Compra decimal(10,2)
);