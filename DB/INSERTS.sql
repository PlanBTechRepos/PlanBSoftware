#INSERTS
USE pdvPlanBTech;
INSERT INTO cargos (nome) VALUES 
("Gerente"),
("Atendente");

insert into ingredientes (nome) values
('queijo');
insert into ingredientes (nome) values('calabresa');

call cadFunc('douglas', 'machado', 'gerente');
call cadFunc('test', 'test', 'atendente');
call cadFunc('Yago', 'Henrique', 'Atendente');

call cadUsuario("douglas", "machado","doug","1234", 1);

call cadUsuario("Yago", "Henrique", "hfa", "root", false);



call insertEstoque(3, 'queijo', 4.50);
call insertEstoque(4, 'calabresa', 7);

delete from estoque where id_Produto = 2;

delete from estoque where id_Produto =  id ;