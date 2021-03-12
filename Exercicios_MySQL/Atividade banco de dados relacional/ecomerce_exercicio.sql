CREATE DATABASE db_ecomerce;
USE db_ecomerce;

CREATE TABLE tb_produtos ( id BIGINT (5) AUTO_INCREMENT, nome VARCHAR(20) NOT NULL, preço BIGINT(100) NOT NULL,
categoria VARCHAR (20) NOT NULL, cor VARCHAR(20) NOT NULL, eletronico VARCHAR (15) DEFAULT '?', PRIMARY KEY (id));

SELECT * FROM  tb_produtos;

INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("iPhone",8500,"telefones","preto","sim");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("Drone MaxUp",3400,"drones/outros","cinza","sim");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("Fone Samsung",250,"Audio","branco","sim");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("optimus prime",120,"brinquedos","azul e vermelha","não");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("poster uncharted",40,"adesivos","indefinida","não");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("caneta laser",30,"luzes","roxa","sim");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("xicara ben 10",20,"recipiente","branca e preta","não");
INSERT INTO tb_produtos (nome,preço,categoria,cor,eletronico) VALUES ("Camiseta thanos",90,"roupas","branca e roxa","não");

SELECT * FROM tb_produtos WHERE preço > 500;
SELECT * FROM tb_produtos WHERE preço < 500;

SELECT * FROM  tb_produtos;