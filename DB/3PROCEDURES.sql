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
nomeProduto VARCHAR(50),
nomeIngrediente VARCHAR(50),
valor DECIMAL (10,2)
)
BEGIN
	SET @buscatipo = (SELECT id_ingrediente FROM  ingredientes WHERE nomeIngrediente = ingredientes.nome);
	INSERT INTO estoque (nome, tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (nomeProduto ,@buscatipo, qtd, valor, date_add(SYSDATE(), interval 1 month));
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS buscaUsuario;
DELIMITER $
CREATE PROCEDURE buscaUsuario(
	usuarioProc VARCHAR(40)
)
BEGIN
	SELECT u.id_Funcionario , u.id_usuario, u.usuario, u.senha, u.permissao, f.id_Cargo, f.id_Funcionario, f.nome, f.sobrenome
		FROM usuario AS u
		JOIN funcionario AS f ON f.id_Funcionario = u.id_Funcionario 
			WHERE u.usuario LIKE usuarioProc;
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS buscarDadosUsuario;
DELIMITER $
CREATE PROCEDURE buscarDadosUsuario(
	usuarioB VARCHAR(50),
	senhaB VARCHAR(50)
)
BEGIN
	SELECT f.nome, f.sobrenome, c.nome, u.usuario, u.senha, u.permissao 
		FROM funcionario AS f
			JOIN cargos AS c 
				ON f.id_Cargo = c.id_Cargo
			JOIN usuario AS u 
				ON f.id_Funcionario = u.id_Funcionario
					WHERE usuarioB LIKE u.usuario AND senhaB LIKE u.senha;
END$
DELIMITER ;