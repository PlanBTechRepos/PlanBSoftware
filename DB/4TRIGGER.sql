#TRIGGER
/*
DROP TRIGGER IF EXISTS atualiza_estoque;
DELIMITER //
CREATE TRIGGER atualiza_estoque AFTER INSERT ON pedido
FOR EACH ROW
BEGIN
  -- obtém o id do ingrediente utilizado na receita do pedido
  DECLARE idIngrediente INT;
  SELECT id_Ingrediente INTO idIngrediente FROM receita WHERE id_Receita = NEW.id_Receita;
  
  -- atualiza a quantidade em estoque do ingrediente utilizado
  UPDATE estoque SET Quantidade = Quantidade - 1 WHERE id_Ingrediente = idIngrediente;
END //

DELIMITER ;*/