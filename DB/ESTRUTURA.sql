drop database pdvPlanBTech;
CREATE DATABASE pdvPlanBTech;
USE pdvPlanBTech;


CREATE TABLE if not exists cargos(
	id_Cargo INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL UNIQUE
);


CREATE TABLE IF NOT EXISTS funcionario(
	id_Funcionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_Cargo INTEGER NOT NULL,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS usuario(
	id_funcionario	INTEGER		PRIMARY KEY,
	usuario 			VARCHAR(50),
	senha				VARCHAR(50),
	permissao 			boolean 	NOT NULL 	DEFAULT false
);

CREATE TABLE IF NOT EXISTS receita(
	id_Receita 		INTEGER		AUTO_INCREMENT PRIMARY KEY,
	id_Ingrediente  INTEGER NOT NULL,
	nome_receita VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ingredientes(
	id_Ingrediente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL
);



CREATE TABLE IF NOT EXISTS pedido(
	id_Pedido INTEGER PRIMARY KEY,
    id_Pessoa INTEGER NOT NULL,
    id_Receita INTEGER NOT NULL,
    Valor_Total decimal(8,2)
);

CREATE TABLE IF NOT EXISTS estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Quantidade decimal(8,4) NOT NULL,
    Vencimento DATETIME,
    tipo_Ingrediente INTEGER, #mussarela, refri
    Valor_de_Compra decimal(6,2)
);
