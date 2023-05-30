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
nomeUE VARCHAR(50),
valor DECIMAL (10,2),
venci varchar(20)
)
BEGIN
	UPDATE estoque 
    SET quantidade = qtd,
    Nome = nomeUE,
    Valor_de_Compra = valor,
    vencimento = venci
    WHERE id_Produto = id;
END$

DELIMITER ;

DROP PROCEDURE IF EXISTS insertEstoque;
DELIMITER $
CREATE PROCEDURE insertEstoque(
qtd VARCHAR(50),
nomeProduto VARCHAR(50),
nomeIngrediente VARCHAR(50),
valor DECIMAL (10,2),
vencimento VARCHAR(10),
borda BOOLEAN #essa borda só existe porque sera criado um ingrediente caso o ingrediente ainda não exista
)
BEGIN
	SET @buscatipo = (SELECT id_ingrediente FROM  ingredientes WHERE nomeIngrediente = ingredientes.nome);
	IF @buscatipo <=> NULL THEN
		INSERT INTO ingredientes (nome, borda) VALUES (nomeIngrediente, borda);
        SET @buscatipo = (SELECT id_ingrediente FROM  ingredientes WHERE nomeIngrediente = ingredientes.nome);
        IF vencimento LIKE '' THEN        
			INSERT INTO estoque (nome, tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (nomeProduto, @buscatipo, qtd, valor, date_add(SYSDATE(), interval 1 month));
            ELSE
				INSERT INTO estoque (nome, tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (nomeProduto, @buscatipo, qtd, valor, vencimento);
                END IF;
    ELSE
		IF vencimento LIKE '' THEN        
			INSERT INTO estoque (nome, tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (nomeProduto, @buscatipo, qtd, valor, date_add(SYSDATE(), interval 1 month));
            ELSE
				INSERT INTO estoque (nome, tipo_ingrediente, quantidade, Valor_de_Compra, vencimento) VALUES (nomeProduto, @buscatipo, qtd, valor, vencimento);
                END IF;
	END IF;
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

DROP PROCEDURE IF EXISTS buscaReceita;
DELIMITER $
CREATE PROCEDURE buscaReceita(
	receitaN VARCHAR(50)
)
BEGIN
SELECT nome AS PIZZA FROM ingredientes
	JOIN receita on 
		receita.id_Ingrediente = ingredientes.id_Ingrediente 
			WHERE nome_receita LIKE receitaN;
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS add_Carrinho;
DELIMITER $
CREATE PROCEDURE add_Carrinho(
	ID INTEGER,
	produto INTEGER,
    bordaI INTEGER,
    QTDP INTEGER
)
BEGIN
		SET @valor = (SELECT valor FROM receita WHERE id_Receita = produto GROUP BY valor ORDER BY id_Ingrediente ASC);
		INSERT INTO carrinho VALUES(ID, produto, @valor*QTDP, bordaI, QTDP);
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS cad_Pedido;
DELIMITER $
CREATE PROCEDURE cad_Pedido(
	nomeFunc INTEGER,
    carrinho INTEGER,
    clienteC VARCHAR(50),
    obs VARCHAR(255),
    statusP INTEGER
)
BEGIN
	SET @valor = (SELECT SUM(valor) FROM carrinho WHERE id_Carrinho = carrinho );
	INSERT INTO pedido VALUES (NULL, nomeFunc, carrinho, clienteC, obs, @valor, statusP);
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS buscarProdutosPedido;
DELIMITER $
CREATE PROCEDURE buscarProdutosPedido(
	idCarrinho INTEGER
)
BEGIN
		SELECT receita.Nome_receita, carrinho.Qtd, carrinho.Valor, ROUND((carrinho.Valor/carrinho.Qtd), 2) AS "Valor unitário"
			FROM carrinho 
				JOIN receita ON receita.id_Receita = carrinho.id_Receita
					WHERE carrinho.id_Carrinho = idCarrinho
						GROUP BY Nome_receita
							ORDER BY Nome_receita ASC;
END$
DELIMITER ;

DROP PROCEDURE IF EXISTS cadUsuarioFunc;

DELIMITER $
CREATE PROCEDURE cadUsuarioFunc(
#FUNCIONÁRIO
nomeP VARCHAR(20),
sobrenomeP VARCHAR(20),
cargoP VARCHAR(20),
#USUÁRIO
usuarioP VARCHAR(20),
senhaP VARCHAR(20)
)
BEGIN
	SET @cargo = (SELECT id_Cargo FROM cargos WHERE cargoP LIKE Nome);
    SET @func = (SELECT id_Funcionario FROM funcionario WHERE id_Cargo = @cargo AND Nome LIKE nomeP AND Sobrenome LIKE sobrenomeP);
    set @us = (SELECT usuario.Usuario FROM usuario WHERE usuario.Usuario LIKE usuarioP);
    
    IF (@func IS NULL AND @us IS NULL) THEN
		INSERT INTO funcionario VALUES (null, @cargo, nomeP, sobrenomeP);
		SET @func = (SELECT id_Funcionario FROM funcionario WHERE id_Cargo = @cargo AND Nome LIKE nomeP AND Sobrenome LIKE sobrenomeP);
		INSERT INTO usuario VALUES(null, @func, usuarioP, senhaP, 0);
        ELSE 
			signal sqlstate '45000'
			set message_text = 'problema no cadastro de usuário ou funcionário',
			mysql_errno = 2023;
            END IF;
END$

DELIMITER ;
SELECT * FROM pdvplanbtech.funcionario;
SELECT * FROM pdvplanbtech.usuario;
SELECT usuario FROM usuario WHERE usuario LIKE 'jao';