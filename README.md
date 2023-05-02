# API-DESAFIO

Minha solução para o desáfio foi desenvolver uma api-rest com um banco de dados relacional, utilizando a linguagem java e o framework spring boot.
Crie uma base de dados localmente para amarzenar os dados de EMPRESA e COLABORADOR. Apos criar a base eu migrei para Azuere, ja que com a conta microsoft eu tive acesso ao portal da azuere.

segue o script da criação das tabelas 

CREATE TABLE EMPRESA(
	CODIGO_EMPRESA INT IDENTITY NOT NULL,
	CNPJ VARCHAR NOT NULL,
	EMAIL VARCHAR NOT NULL,
	TELEFONE VARCHAR NOT NULL,
	ENDERECO VARCHAR  NOT NULL,
	PRIMARY KEY (CODIGO_EMPRESA)
)
CREATE TABLE COLABORADOR(
	CODIGO_COLABORADOR INT IDENTITY NOT NULL,
	CPF VARCHAR NOT NULL,
	NOME VARCHAR NOT NULL,
	EMAIL VARCHAR NOT NULL,
	TELEFONE VARCHAR NOT NULL,
	ENDERECO VARCHAR NOT NULL,
	CODIGO_EMPRESA INT NOT NULL,
	FOREIGN KEY (CODIGO_EMPRESA) REFERENCES EMPRESA(CODIGO_EMPRESA)
)


para acessar o banco de dados, basta entrar no sql server management studio e colocar o nome do server desafio-server.database.windows.net e colocar a
opção de SQL Server authentication.  
o login e a senha do servido encontram se no arquivo application.properties da api.

para inicializar a api, basta clonar para a maquina e abrir com um pojeto maven dentro do eclipse, sts ou intelij. 



