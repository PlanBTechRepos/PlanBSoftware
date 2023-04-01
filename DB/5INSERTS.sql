#INSERTS
USE pdvPlanBTech;

INSERT INTO cargos (nome) VALUES 
("Gerente"),
("Atendente");

INSERT INTO ingredientes (nome) VALUES
('queijo'),
('calabresa');

CALL cadFunc('douglas', 'machado', 'gerente');
CALL cadFunc('test', 'test', 'atendente');
CALL cadFunc('Yago', 'Henrique', 'Atendente');

CALL cadUsuario("douglas", "machado","doug","1234", 1);

CALL cadUsuario("Yago", "Henrique", "hfa", "root", 0);

CALL insertEstoque(3, 'queijo', 4.50);
CALL insertEstoque(4, 'calabresa', 7);

#call pdvplanbtech.buscaUsuario('doug');
