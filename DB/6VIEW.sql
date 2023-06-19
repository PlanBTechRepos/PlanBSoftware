#VIEW
USE pdvplanbtech;

DROP VIEW IF EXISTS listar_Estoque;

CREATE VIEW listar_Estoque AS
SELECT id_Produto, Nome, Quantidade FROM estoque;

DROP VIEW IF EXISTS listar_FuncUs;

CREATE VIEW listar_FuncUs AS
SELECT f.nome, f.sobrenome, c.nome AS cargo, u.usuario, u.senha, u.permissao 
	FROM funcionario AS f
		JOIN cargos AS c 
			ON f.id_Cargo = c.id_Cargo
		JOIN usuario AS u 
			ON f.id_Funcionario = u.id_Funcionario;

DROP VIEW IF EXISTS borda;
CREATE VIEW borda AS    
SELECT id_Ingrediente, nome FROM ingredientes WHERE borda = TRUE;

DROP VIEW IF EXISTS Pizzas;
CREATE VIEW pizzas AS
SELECT nome_receita AS PIZZA, nome AS INGREDIENTE FROM receita
	JOIN ingredientes ON ingredientes.id_Ingrediente = receita.id_Ingrediente
		ORDER BY PIZZA ASC;


DROP VIEW IF EXISTS cargosView;
CREATE VIEW cargosView AS 
	SELECT nome FROM cargos;
    
    
    