#INSERTS
USE pdvPlanBTech;

INSERT INTO cargos (nome) VALUES 
("Gerente"),
("Atendente");

INSERT INTO ingredientes (nome) VALUES
('mussarela'),
('tomate'),
('alho frito'),
('cebola'),
('frango'),
('catupiry'),
('milho'),
('presunto'),
('ovo'),
('bacon'),
('brócolis'),
('champignon'),
('palmito'),
('calabresa'),
('carne moida'),
('pimentão'),
('parmesão'),
('gorgonzola'),
('banana'),
('doce de leite'),
('canela'),
('nutela'),
('morango'),
('granulado'),
('kinder bueno'),
('creme branco');

CALL cadFunc('douglas', 'machado', 'gerente');
CALL cadFunc('test', 'test', 'atendente');
CALL cadFunc('Yago', 'Henrique', 'Atendente');

CALL cadUsuario("douglas", "machado","doug","1234", 1);

CALL cadUsuario("Yago", "Henrique", "hfa", "root", 0);

CALL insertEstoque(3, 'Mussarela Jussara 5KG', 'mussarela', 4.50);
CALL insertEstoque(4, 'Na brasa Calabresa 10 KG', 'calabresa', 7);

