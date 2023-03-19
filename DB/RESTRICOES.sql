#Restrições
USE pdvPlanBTech;

ALTER TABLE telefones
ADD CONSTRAINT FK_Pessoa FOREIGN KEY (id_Pessoa) REFERENCES pessoa(id_Pessoa);

ALTER TABLE funcionario
ADD CONSTRAINT FK_PessoaFunc FOREIGN KEY (id_Pessoa) REFERENCES pessoa(id_Pessoa),
ADD CONSTRAINT FK_Cargo FOREIGN KEY (id_Cargo) REFERENCES cargos(id_Cargo),
ADD CONSTRAINT FK_Subordinado FOREIGN KEY (Subordinado) REFERENCES pessoa(id_Pessoa);

ALTER TABLE sessao
ADD CONSTRAINT FK_Sessao FOREIGN KEY (id_Funcionario) REFERENCES funcionario(id_Funcionario);

ALTER TABLE ingredientes
ADD CONSTRAINT FK_Ingrediente FOREIGN KEY (id_Produto) REFERENCES estoque(id_Produto);

ALTER TABLE receita
ADD CONSTRAINT FK_Ingrediente_Receita FOREIGN KEY (id_Ingrediente) REFERENCES ingredientes(id_Ingrediente);

ALTER TABLE pedido
ADD CONSTRAINT FK_PessoaP FOREIGN KEY (id_Pessoa) REFERENCES pessoa(id_Pessoa),
ADD CONSTRAINT FK_Receita FOREIGN kEY (id_Receita) REFERENCES receita(id_Receita),
ADD CHECK (Valor_Total > 0.00);

ALTER TABLE cidade
ADD CONSTRAINT FK_EstadoUF FOREIGN KEY (uf) REFERENCES estado(Id_Estado);

ALTER TABLE endereco
ADD CONSTRAINT FK_Pessoa_Endereco FOREIGN KEY (id_Pessoa) REFERENCES pessoa(id_Pessoa),
ADD CONSTRAINT FK_Estado_Endereco FOREIGN KEY (id_Estado) REFERENCES estado(Id_Estado),
ADD CONSTRAINT FK_Cidade_Endereco FOREIGN KEY (id_Cidade) REFERENCES cidade(id_Cidade);
