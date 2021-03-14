CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE  tb_categoria (id BIGINT(5) AUTO_INCREMENT, marca VARCHAR (30) NOT NULL, 
produto_eletronico VARCHAR (30) NOT NULL, produto_decorativo VARCHAR (30) NOT NULL,
PRIMARY KEY(id));

CREATE TABLE tb_produto (id BIGINT (5) AUTO_INCREMENT, nome VARCHAR (30) NOT NULL, preço DECIMAL (10,00) NOT NULL,
cor VARCHAR(30) NOT NULL, cod_barras BIGINT(13), vendido_por VARCHAR(30) NOT NULL, marca_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (marca_id) references tb_categoria(id));

INSERT INTO tb_categoria (marca,produto_eletronico,produto_decorativo) VALUES
("PHILIPS","SIM","NÃO"), -- 1
("SIEMENS","SIM","NÃO"), -- 2
("LEDMAX","SIM","SIM"), -- 3
("PORCEBEALTY","NÃO","SIM"), -- 4
("PARAMAX","NÃO","NÃO"); -- 5

INSERT INTO tb_produto (nome,preço,cor,cod_barras,vendido_por,marca_id) VALUES
("FURADEIRA",120.00,"AZUL",5685472369854,"UNIDADE",1),
("DISJUNTOR",35.00,"BRANCO",36589874125869,"UNIDADE",2),
("LUMINARIA BC",42.00,"BRANCO",4582369854785,"UNIDADE",3),
("PISO PORCELANA",50.00,"BEGE",6358458745695,"POR 10 UNIDADES",4),
("DETECTOR TENSAO",34.00,"PRETO",6358547856953,"UNIDADE",1),
("ABAJUR",30.00,"VERMELHO",36987521397452,"UNIDADE",3),
("CERAMICA DE VIDRO",300.00,"TRANSPARENTE",6985632178915,"POR 5 UNIDADES",4),
("PARAFUSO VEX",3.00,"FERRO",5698785412398,"POR 20 UNIDADES",5);

SELECT * FROM tb_produto WHERE preço > 50.00;
SELECT * FROM tb_produto WHERE preço >= 03.00 and preço <= 60.00;
SELECT * FROM tb_produto WHERE nome LIKE 'C%';

SELECT * FROM tb_produto
INNER JOIN tb_categoria on tb_categoria.id = tb_produto.marca_id;