CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe ( id BIGINT (5) AUTO_INCREMENT, tipo VARCHAR(20) NOT NULL, origem VARCHAR(100) NOT NULL,
voador VARCHAR (200) NOT NULL, PRIMARY KEY (id));



CREATE TABLE tb_personagem (id BIGINT(5) AUTO_INCREMENT, nome VARCHAR(20) NOT NULL, arma VARCHAR(20) NOT NULL,
armadura VARCHAR(20), poder VARCHAR(20) NOT NULL, poder_ataque BIGINT(255) NOT NULL, poder_defesa BIGINT(255) NOT NULL,
tipo_id BIGINT, 
PRIMARY KEY (id),
 FOREIGN KEY (tipo_id) references tb_classe (id));

SELECT * FROM  tb_classe;
SELECT * FROM  tb_personagem;

INSERT INTO tb_classe (tipo,origem,voador) VALUES
("GUERREIRO","ESPARTA","SIM"), 
("GUERREIRO","ATENAS","SIM"),
("SEMI DEUS","OLIMPO","NAO"),
("DEUS","SUB MUNDO","NAO"),
("DEUS","OLIMPO","SIM"),
("NINJA","KONOHA","NAO");
INSERT INTO tb_personagem (nome,arma,armadura,poder,poder_ataque,poder_defesa,tipo_id) VALUES
("CRAWS","LAMINA","OURO","INFLUENCIA",1000,1200,1),
("KRATOS","LAMINA DO CAOS","ARES ARMOUR","FORÇA",5000,4400,2),
("HERCULES","NEMEAN","COURO","SUPER FORÇA",5000,5000,3),
("HADES","ESPADA DE HADES","FOGO","DRENAR ENERGIA",4800,5000,4),
("ZEUS","RAIO DE ZEUS","CELESTIAL","SUPER FORÇA",5000,5000,5),
("NARUTO","KUNAI","MANTO KYUUBI","CHAKRA",4000,1200,4),
("ATENAS","LANÇA","ARMADURA DE ATENAS","SABEDORIA",1400,2000,5),
("CAMIS","ESPADA DOURADA","OURO","FOGO",1900,2000,1);

SELECT * FROM tb_personagem WHERE poder_ataque > 2000;
SELECT * FROM tb_personagem WHERE poder_defesa >= 1000 and poder_defesa <=2000;
SELECT * FROM tb_personagem WHERE nome LIKE "%C%";
SELECT * FROM  tb_personagem
INNER JOIN tb_classe on tb_classe.id  = tb_personagem.tipo_id;
                                
