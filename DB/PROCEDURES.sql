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