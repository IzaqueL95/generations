CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categoria (id BIGINT (5) AUTO_INCREMENT, massa_tipo VARCHAR(10) NOT NULL, sabor_unico VARCHAR (10) NOT NULL,
 para_entrega VARCHAR(10) NOT NULL, PRIMARY KEY (id));

CREATE TABLE tb_pizza (id BIGINT(5) AUTO_INCREMENT, pedido_num BIGINT(10) NOT NULL, sabor VARCHAR (30) NOT NULL, 
preço DECIMAL (10,00) NOT NULL, especial VARCHAR(10) NOT NULL, refrigerante_acompanha VARCHAR(10) NOT NULL,
massa_tipo_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (massa_tipo_id) references tb_categoria(id));

INSERT INTO tb_categoria (massa_tipo,sabor_unico,para_entrega) VALUES
("FINA","SIM","SIM"), -- 1
("MEDIA","NAO","NAO"),
("FINA","NAO","SIM"),
("GROSSA","SIM","SIM"),
("FINA","NAO","NAO");


INSERT INTO tb_pizza (pedido_num,sabor,preço,especial,refrigerante_acompanha,massa_tipo_id) VALUES
("120","QUEIJO",30.90,"NAO","SIM",4),
("121","MOZARELA",49.90,"NAO","NAO",4),
("122","QUEIJO E CALABRESA",55.90,"SIM","SIM",3),
("123","CHOCOLATE",60.90,"SIM","NAO",1),
("124","LEITE MOÇA",60.90,"SIM","NAO",4),
("125","CALABRESA",49.90,"NAO","SIM",1),
("126","PORTUGUESA",55.90,"SIM","SIM",5),
("127","NAPOLITANA",55.90,"SIM","NAO",3);

SELECT * FROM tb_pizza WHERE preço > 45.00;
SELECT * FROM tb_pizza WHERE preço > 29.00 and preço < 60.00;
SELECT * FROM tb_pizza WHERE sabor LIKE "C%";

SELECT * FROM tb_pizza
INNER JOIN tb_categoria on tb_categoria.id = tb_pizza.massa_tipo_id;