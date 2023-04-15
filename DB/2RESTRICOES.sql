#Restrições
USE pdvPlanBTech;

ALTER TABLE usuario
ADD CONSTRAINT FK_Usuario FOREIGN KEY (id_Funcionario) REFERENCES funcionario(id_Funcionario);

ALTER TABLE funcionario
ADD CONSTRAINT FK_Cargo FOREIGN KEY (id_Cargo) REFERENCES cargos(id_Cargo);

ALTER TABLE receita
ADD CONSTRAINT FK_Ingrediente_Receita FOREIGN KEY (id_Ingrediente) REFERENCES ingredientes(id_Ingrediente);

ALTER TABLE carrinho
ADD CONSTRAINT FK_Borda FOREIGN KEY (Borda) REFERENCES ingredientes(id_Ingrediente);

ALTER TABLE pedido
ADD CONSTRAINT FK_Carrinho FOREIGN KEY (id_Carrinho) REFERENCES carrinho(id_Carrinho),
ADD CONSTRAINT FK_Funcionario FOREIGN KEY (id_Funcionario) REFERENCES funcionario(id_Funcionario),
ADD CHECK (Valor_Total > 0.00);

ALTER TABLE estoque
ADD CONSTRAINT FK_Ingrediente FOREIGN KEY (tipo_Ingrediente) REFERENCES ingredientes(id_Ingrediente);