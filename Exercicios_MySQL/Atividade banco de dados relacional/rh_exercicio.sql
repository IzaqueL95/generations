CREATE DATABASE db_funcionario;
USE db_funcionario;

CREATE TABLE tb_funcionarios ( id BIGINT (5) AUTO_INCREMENT, nome VARCHAR(20) NOT NULL, idade BIGINT(100) NOT NULL,
salario BIGINT (20) NOT NULL, departamento VARCHAR(20) NOT NULL, funcionario_ativo VARCHAR(15) NOT NULL, PRIMARY KEY (id));
ALTER TABLE tb_funcionarios ADD funcionario_ativo VARCHAR(15);
SELECT * FROM  tb_funcionarios;
ALTER TABLE tb_funcionarios MODIFY departamento VARCHAR(30);
ALTER TABLE tb_funcionarios MODIFY status VARCHAR(30) DEFAULT "OK";
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Fernando", 20, 2000, "informatica", "sim");
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Felipe", 25, 1500, "administração", "sim");
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Mariana", 32, 8000, "projetos", "sim");
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Diego", 29, 5000, "integração", "sim");
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Manuel", 24, 2200, "integração", "sim");
INSERT INTO tb_funcionarios (nome, idade, salario, departamento, funcionario_ativo) VALUES ("Bruna", 17, 1200, "administração", "sim");

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;

SELECT * FROM  tb_funcionarios;
