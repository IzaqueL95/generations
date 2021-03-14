CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE  tb_categoria (id BIGINT(5) AUTO_INCREMENT, categoria VARCHAR (30) NOT NULL, 
remédios VARCHAR (10) NOT NULL, cosmético VARCHAR (10) NOT NULL,
PRIMARY KEY(id));

CREATE TABLE tb_produto (id BIGINT (5) AUTO_INCREMENT, nome VARCHAR (30) NOT NULL, preço DECIMAL (10,00) NOT NULL,
tarja VARCHAR(10) NOT NULL, receita_num BIGINT(10), ingerivel VARCHAR(10) NOT NULL, categoria_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) references tb_categoria(id));

INSERT INTO tb_categoria (categoria,remédios,cosmético) VALUES
("SOMENTE POR RECEITA","SIM","NÃO"), -- 1 
("SEM RECEITA","SIM","NÃO"), -- 2 
("SEM RECEITA","NÃO","SIM"), -- 3 
("SOMENTE POR RECEITA","NÃO","SIM"), -- 4 
("SEM RECEITA","NÃO","NÃO");  -- 5

INSERT INTO tb_produto (nome,preço,tarja,receita_num,ingerivel,categoria_id) VALUES
("DESODORANTE",12.99,"NENHUMA","0","NÃO",5), 
("LORATAMED",30.99,"NENHUMA","0","SIM",2),
("LORATADINA",29.99,"NENHUMA","0","SIM",2),
("CREME CARVAO FACIAL",65.00,"NENHUMA","1248","NÃO",4),
("CLONAZEPAM",100.00,"PRETA","122","SIM",1),
("DIAZEPAM",84.60,"PRETA","220","SIM",1),
("GEL DE CABELO",5.42,"NENHUMA","0","NÃO",3),
("BARRA CEREAL MORANGO",3.99,"NENHUMA","0","SIM",5);

SELECT * FROM tb_produto WHERE preço > 50.00;
SELECT * FROM tb_produto WHERE preço >= 03.00 and preço <= 60.00;
SELECT * FROM tb_produto WHERE nome LIKE 'B%';

SELECT * FROM tb_produto
INNER JOIN tb_categoria on tb_categoria.id = tb_produto.categoria_id;