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

CREATE TABLE IF NOT EXISTS usuario(
id_Usuario	INTEGER PRIMARY KEY AUTO_INCREMENT,
id_Funcionario	INTEGER NOT NULL,
usuario 			VARCHAR(50),
senha			VARCHAR(50),
permissao INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS receita(
id_Receita 		INTEGER PRIMARY KEY AUTO_INCREMENT,
id_Ingrediente  INTEGER NOT NULL,
nome_receita VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ingredientes(
	id_Ingrediente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL UNIQUE
);


CREATE TABLE IF NOT EXISTS pedido(
	id_Pedido INTEGER PRIMARY KEY,
    id_Funcionario INTEGER NOT NULL,
    id_Receita INTEGER NOT NULL,
    cliente VARCHAR(50),
    Valor_Total DECIMAL(8,2),
    status_pedido INTEGER NOT NULL DEFAULT 0
);
CREATE TABLE IF NOT EXISTS estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(50) NOT NULL,
    Quantidade INTEGER NOT NULL,
    Recebimento DATETIME DEFAULT CURRENT_TIMESTAMP(),
    Vencimento DATETIME,
    tipo_Ingrediente INTEGER, #mussarela, refri
    Valor_de_Compra DECIMAL(10,2)
);