#INSERTS
USE pdvPlanBTech;

INSERT INTO cargos (nome) VALUES 
("Gerente"),
("Atendente");

INSERT INTO ingredientes (nome, borda) VALUES
('Sem borda', TRUE),
('mussarela', TRUE),
('tomate', FALSE),
('alho frito', FALSE),
('cebola', FALSE),
('frango', FALSE),
('catupiry', TRUE),
('milho', FALSE),
('presunto', FALSE),
('ovo', FALSE),
('bacon', FALSE),
('brócolis', FALSE),
('champignon', FALSE),
('palmito', FALSE),
('calabresa', FALSE),
('carne moida', FALSE),
('pimentão', FALSE),
('parmesão', FALSE),
('gorgonzola', FALSE),
('banana', FALSE),
('doce de leite', TRUE),
('canela', FALSE),
('nutela', TRUE),
('morango', FALSE),
('granulado', FALSE),
('cheddar', TRUE),
('cream cheese', TRUE),
('molho de tomate', FALSE),
('azeitona', FALSE),
('kinder bueno', FALSE),
('creme branco', FALSE);

INSERT INTO receita VALUES
(1, 1, 'mussarela', 49.99),
(1, 2, 'mussarela', 49.99),
(1, 27, 'mussarela', 49.99),
(1, 28, 'mussarela', 49.99),
(2, 1, 'alho frito', 49.99),
(2, 3, 'alho frito', 49.99),
(2, 24, 'alho frito', 49.99),
(2, 27, 'alho frito', 49.99),
(2, 28, 'alho frito', 49.99),
(3, 5, 'frango c/ catupiry', 49.99),
(3, 6, 'frango c/ catupiry', 49.99),
(3, 7, 'frango c/ catupiry', 49.99),
(3, 4, 'frango c/ catupiry', 49.99),
(3, 27, 'frango c/ catupiry', 49.99),
(3, 28, 'frango c/ catupiry', 49.99),
(4, 1, 'portuguesa', 49.99),
(4, 8, 'portuguesa', 49.99),
(4, 9, 'portuguesa', 49.99),
(4, 4, 'portuguesa', 49.99),
(4, 27, 'portuguesa', 49.99),
(4, 28, 'portuguesa', 49.99),
(5, 10, 'brócolis', 49.99),
(5, 11, 'brócolis', 49.99),
(5, 1, 'brócolis', 49.99),
(5, 27, 'brócolis', 49.99),
(5, 28, 'brócolis', 49.99),
(6, 1, 'vegetariana', 49.99),
(6, 11, 'vegetariana', 49.99),
(6, 12, 'vegetariana', 49.99),
(6, 13, 'vegetariana', 49.99),
(6, 27, 'vegetariana', 49.99),
(6, 28, 'vegetariana', 49.99),
(7, 1, 'calabresa', 49.99),
(7, 4, 'calabresa', 49.99),
(7, 14, 'calabresa', 49.99),
(7, 27, 'calabresa', 49.99),
(7, 28, 'calabresa', 49.99),
(8, 1, 'bacon', 49.99),
(8, 4, 'bacon', 49.99),
(8, 10, 'bacon', 49.99),
(8, 27, 'bacon', 49.99),
(8, 28, 'bacon', 49.99),
(9, 1, 'moda da casa', 49.99),
(9, 5, 'moda da casa', 49.99),
(9, 10, 'moda da casa', 49.99),
(9, 14, 'moda da casa', 49.99),
(9, 27, 'moda da casa', 49.99),
(9, 28, 'moda da casa', 49.99),
(10, 1, 'bolonhesa', 49.99),
(10, 15, 'bolonhesa', 49.99),
(10, 16, 'bolonhesa', 49.99),
(10, 4, 'bolonhesa', 49.99),
(10, 27, 'bolonhesa', 49.99),
(10, 28, 'bolonhesa', 49.99),
(11, 1, '4 queijos', 49.99),
(11, 6, '4 queijos', 49.99),
(11, 17, '4 queijos', 49.99),
(11, 18, '4 queijos', 49.99),
(11, 27, '4 queijos', 49.99),
(11, 28, '4 queijos', 49.99),
(12, 19, 'banana', 49.99),
(12, 20, 'banana', 49.99),
(12, 21, 'banana', 49.99),
(13, 22, 'nutella com morango', 49.99),
(13, 23, 'nutella com morango', 49.99),
(13, 24, 'nutella com morango', 49.99),
(14, 29, 'kinder Bueno', 49.99),
(14, 30, 'kinder Bueno', 49.99);

CALL cadFunc('douglas', 'machado', 'gerente');
CALL cadFunc('test', 'test', 'atendente');
CALL cadFunc('Yago', 'Henrique', 'Atendente');

CALL cadUsuario("douglas", "machado","doug","1234", 1);

CALL cadUsuario("Yago", "Henrique", "hfa", "root", 0);

CALL insertEstoque(3, 'Mussarela Jussara 5KG', 'mussarela', 4.50);
CALL insertEstoque(4, 'Na brasa Calabresa 10 KG', 'calabresa', 7);

call pdvplanbtech.add_Carrinho(1, 1, 1, 1);
call pdvplanbtech.add_Carrinho(1, 2, 1, 2);
call pdvplanbtech.add_Carrinho(1, 3, 1, 1);
