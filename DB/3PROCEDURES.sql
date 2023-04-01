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

DROP PROCEDURE IF EXISTS UPDATEFunc;
Delimiter $
CREATE PROCEDURE UPDATEFunc(
newNome VARCHAR(50),
newSobrenome VARCHAR(50),
newCargo VARCHAR(50)
)
BEGIN
	SET @buscaFunc = (SELECT id_Funcionario FROM Funcionario WHERE nome LIKE newNome AND sobrenome LIKE newSobrenome);
	SET @BUSCARGO = (SELECT id_Cargo FROM cargos WHERE Nome = newCargo);
    
    UPDATE funcionario 
    SET nome = newNome, 
    sobrenome = newSobrenome, 
    cargo = @BUSCARGO
    WHERE	id_funcionario = @buscaFunc;
END$
DELIMITER ;

DELIMITER $
DROP PROCEDURE IF EXISTS UPDATEEstoque$
CREATE PROCEDURE UPDATEEstoque(
id INTEGER,
qtd VARCHAR(50),
nome VARCHAR(50),
valor DECIMAL (10,2)
)
BEGIN
	SET @buscatipo = (	SELECT tipo_ingrediente FROM  estoque 
						JOIN ingredientes ON ingredientes.id_Ingrediente = estoque.tipo_Ingrediente
                        WHERE nome = ingredientes.nome);
	UPDATE estoque 
    SET quantidade = qtd,
    tipo_ingrediente = @buscatipo,
    Valor_de_Compra = valor,
    vencimento = SYSDATE()
    WHERE id_Produto = id;
END$

DELIMITER ;

DROP PROCEDURE IF EXISTS insertEstoque;
DELIMITER $
CREATE PROCEDURE insertEstoque(
qtd VARCHAR(50),
nome VARCHAR(50),
valor DECIMAL (10,2)
)
BEGIN
	SET @buscatipo = (SELECT id_ingrediente FROM  ingredientes WHERE nome = ingredientes.nome);
	INSERT INTO estoque (tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (@buscatipo, qtd, valor, date_add(SYSDATE(), interval 1 month));
END$
DELIMITER ;
/*
DELIMITER $
DROP PROCEDURE IF EXISTS buscaUsuario;
CREATE PROCEDURE buscaUsuario(
usuarioProc VARCHAR(40)
)
BEGIN
	SELECT u.id_Funcionario , u.id_usuario, u.usuario, u.senha, u.permissao, f.id_Cargo, f.id_Funcionario, f.nome, f.sobrenome
		FROM usuario AS u
		JOIN funcionario AS f ON f.id_Funcionario = u.id_Funcionario 
			WHERE u.usuario LIKE usuarioProc;
END$
DELIMITER ;*/
#Por enquanto use esse select para fazer a busca ou reexecute a procedure logo acima.
SELECT u.id_Funcionario , u.id_usuario, u.usuario, u.senha, u.permissao, f.id_Cargo, f.id_Funcionario, f.nome, f.sobrenome
		FROM usuario AS u
		JOIN funcionario AS f ON f.id_Funcionario = u.id_Funcionario 
			WHERE u.usuario LIKE "test";