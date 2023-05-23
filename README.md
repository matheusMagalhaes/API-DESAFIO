# API-DESAFIO
REST API em Java com Spring Boot framework e gerencimanro de dependencias Maven. 
# 

Mapeamento ORM das seguintes tabelas em SQL, utilizando JPA (Java Persitence API):

CREATE TABLE ENDERECO(
ID INT IDENTITY NOT NULL,
CEP VARCHAR (255) NOT NULL,
COMPLEMENTO VARCHAR(255) NOT NULL,
RUA VARCHAR(255) NOT NULL,
BAIRRO VARCHAR(255) NOT NULL, 
CIDADE VARCHAR (255) NOT NULL,
UF VARCHAR(255) NOT NULL,
PRIMARY KEY CLUSTERED (ID)
)
----------------------------------- 

CREATE TABLE EMPRESA(
	ID INT IDENTITY NOT NULL,
	CNPJ VARCHAR(255)  NOT NULL,
	EMAIL VARCHAR(255)  NOT NULL,
	TELEFONE VARCHAR(255)  NOT NULL,
	ENDERECO_ID INT  NOT NULL,
	PRIMARY KEY CLUSTERED (ID),
	FOREIGN KEY (ENDERECO_ID) REFERENCES ENDERECO(ID)
)
----------------------------------- 

CREATE TABLE COLABORADOR(
	ID INT IDENTITY NOT NULL,
	CPF VARCHAR(255)  NOT NULL,
	NOME VARCHAR(255)  NOT NULL,
	EMAIL VARCHAR(255)  NOT NULL,
	TELEFONE VARCHAR(255)  NOT NULL,
	ENDERECO VARCHAR(255)  NOT NULL,
	ID_EMPRESA INT NOT NULL,
	CARGO VARCHAR(255) NOT NULL,
	PRIMARY KEY CLUSTERED (ID),
	FOREIGN KEY (ID_EMPRESA) REFERENCES EMPRESA(ID),
)
----------------------------------- 

o Script da tabela acim é para fins de teste, caso necessário verificar se de fato esta salvando no banco de dados. 
A API esta configurado para conectar no banco de dados do SQL Server via localhost, se for o caso de testar com a conexão do banco, crir o usuario  para a api com o seguinte scrpit, aplicação ja está configurada para receber este mesmo usuário.  

CREATE LOGIN api_desafio   
    WITH PASSWORD = '340$Uuxwp7Mcxo7Khy';  

CREATE USER api_desafio FOR LOGIN api_desafio;  
GO

#

Porém, é possível testar a aplicação fazendo as operações (CRUD) normalmente usando cache da propria JPA, portanto deixarei o arquivo de configuração Application.properties comentado.
