CREATE DATABASE db_escola;
USE db_escola;

CREATE TABLE tb_alunos ( id BIGINT (5) AUTO_INCREMENT, nome VARCHAR(20) NOT NULL, idade BIGINT(100) NOT NULL,
sala BIGINT (200) NOT NULL, sexo VARCHAR(20) NOT NULL, nota DECIMAL (2,0) NOT NULL, PRIMARY KEY (id));

SELECT * FROM  tb_alunos;

INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Vanessa",17,201,"Feminino",10.00);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Bruno",17,201,"Masculino",8.0);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Marina",18,202,"Feminino",6.0);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Joao",17,202,"Masculino",7.0);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Tauani",17,203,"Feminino",9.0);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Viviane",18,203,"Feminino",10.00);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Jamil",18,201,"Masculino",10.00);
INSERT INTO tb_alunos (nome,idade,sala,sexo,nota) VALUES ("Marshall",18,202,"Masculino",10.00);

SELECT * FROM tb_alunos WHERE nota > 7.00;
SELECT * FROM tb_alunos WHERE nota < 7.00;

SELECT * FROM  tb_alunos;