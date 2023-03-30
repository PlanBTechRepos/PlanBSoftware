#PROCEDURES
DROP PROCEDURE IF EXISTS cadFunc;
DELIMITER $
CREATE PROCEDURE cadFunc(
	nomeP VARCHAR(50),
	sobrenomeP VARCHAR(50),
    cargoP VARCHAR(20)
)
BEGIN
	SET @BUSCARGO = (SELECT id_Cargo FROM cargos WHERE Nome = cargoP);
    INSERT INTO funcionario VALUES (NULL, @BUSCARGO, nomeP, sobrenomeP);
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS cadUsuario;
DELIMITER $
CREATE PROCEDURE cadUsuario(
	nomeF VARCHAR(50),
	sobrenomeF VARCHAR(50),
    usuarioF VARCHAR(20),
    senhaF VARCHAR(20),
    permissao INTEGER
)
BEGIN
	SET @buscaFunc = (SELECT id_Funcionario FROM Funcionario WHERE nome LIKE nomeF AND sobrenome LIKE sobrenomeF);
    INSERT INTO usuario VALUES (NULL, @buscaFunc, usuarioF, senhaF, permissao);
END$
DELIMITER ;

drop procedure if exists updateFunc;
Delimiter $
create procedure updateFunc(
newNome varchar(50),
newSobrenome varchar(50),
newCargo varchar(50)
)
begin
	set @buscaFunc = (SELECT id_Funcionario FROM Funcionario WHERE nome LIKE newNome AND sobrenome LIKE newSobrenome);
	set @BUSCARGO = (SELECT id_Cargo FROM cargos WHERE Nome = newCargo);
    
    update funcionario 
    set nome = newNome, 
    sobrenome = newSobrenome, 
    cargo = @BUSCARGO
    where	id_funcionario = @buscaFunc;
end$
delimiter ;

delimiter $
drop procedure if exists updateEstoque$
create procedure updateEstoque(
id int,
qtd varchar(50),
nome varchar(50),
valor decimal(10,2)
)
begin
	set @buscatipo = (	select tipo_ingrediente from estoque 
						join ingredientes on ingredientes.id_Ingrediente = estoque.tipo_Ingrediente
                        where nome = ingredientes.nome);
	update estoque 
    set quantidade = qtd,
    tipo_ingrediente = @buscatipo,
    Valor_de_Compra = valor,
    vencimento = sysdate()
    where id_Produto = id;
end$

delimiter ;

drop procedure if exists insertEstoque;
delimiter $
create procedure insertEstoque(
qtd varchar(50),
nome varchar(50),
valor decimal(10,2)
)
begin
	set @buscatipo = (select id_ingrediente from ingredientes where nome = ingredientes.nome);
	insert into estoque (tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) values(@buscatipo, qtd, valor, sysdate());
end$
delimiter ;



