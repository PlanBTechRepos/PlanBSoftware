#INSERTS
USE pdvPlanBTech;
INSERT INTO cargos (nome) VALUES 
("Gerente"),
("Atendente");

call cadFunc('douglas', 'machado', 'gerente');
call cadFunc('test', 'test', 'atendente');

call cadUsuario("douglas", "machado","doug","1234", 1);
