CREATE DATABASE pdvPlanBTech;
USE pdvPlanBTech;

<<<<<<< HEAD
CREATE TABLE if not exists cargos(
=======
CREATE TABLE IF NOT EXISTS cargos(
>>>>>>> db990de7a20c765b9755a96b8a0cc63f32e016c0
	id_Cargo INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL UNIQUE
);

<<<<<<< HEAD
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
=======
CREATE TABLE IF NOT EXISTS funcionario(
	id_Funcionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_Cargo INTEGER NOT NULL,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS usuario(
	id_Funcionario		INTEGER	PRIMARY KEY,
	usuario 			VARCHAR(50),
	senha			VARCHAR(50),
	permissao INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS receita(
	id_Receita 		INTEGER		AUTO_INCREMENT PRIMARY KEY,
	id_Ingrediente  INTEGER NOT NULL,
	nome_receita VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS ingredientes(
>>>>>>> db990de7a20c765b9755a96b8a0cc63f32e016c0
	id_Ingrediente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL
);


<<<<<<< HEAD
CREATE TABLE if not exists pedido(
=======
CREATE TABLE IF NOT EXISTS pedido(
>>>>>>> db990de7a20c765b9755a96b8a0cc63f32e016c0
	id_Pedido INTEGER PRIMARY KEY,
<<<<<<< HEAD
    id_Pessoa INTEGER NOT NULL
=======
    id_Pessoa INTEGER NOT NULL,
    id_Receita INTEGER NOT NULL,
<<<<<<< HEAD
    pedido_Estado INTEGER NOT NULL DEFAULT 0,
    Valor_Total FLOAT(8,2)
>>>>>>> 03f2b2453e44dd16349700220a886d1f54b37430
);

CREATE TABLE if not exists estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Quantidade FLOAT(8,4) NOT NULL,
    Vencimento DATETIME,
=======
    cliente VARCHAR(50),
    Valor_Total FLOAT(8,2),
    status_pedido INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS estoque(
	id_Produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Quantidade FLOAT(8,4) NOT NULL,
    Vencimento DATETIME,
    tipo_Ingrediente INTEGER, #mussarela, refri
>>>>>>> db990de7a20c765b9755a96b8a0cc63f32e016c0
    Valor_de_Compra FLOAT(6,2)
);
