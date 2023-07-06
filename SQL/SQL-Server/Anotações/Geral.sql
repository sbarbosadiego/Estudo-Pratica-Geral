/* SQL Server - Anotações */

/*
	MDF - Master Data Files - Usado geralmente para armazenar apenas dicionário de dados
	LDF - Log Data Files - Armazena as transações efetuadas no banco
	NDF - Non-Primary Data File - Arquivos secundários do banco de dados
*/

/*  Organizar um banco fisicamente e logicamente
	A configuração de um novo banco pode ser feito através de código ou usando a UI, para
	assim criar o filegroup, determinar o local de cada arquivo do banco e seu tamanho
*/


/* Delimitador SQL Server GO, quebra os comandos em pacotes */
CREATE DATABASE banco01
GO

USE banco01
GO

CREATE TABLE teste(
	nome VARCHAR(30)
)
GO

/* 	Autoincremento
	Para criar uma coluna com autoincremento, usa-se a cláusula IDENTITY
	Caso seja necessário customizar o incremento usar IDENTITY(1,1) nessa situação começa em 1 incrementa em +1
*/

/* 	Criando tabelas
 	O ideal é criar a tabela sem a presença de constraints e chaves, pois dessa forma ao necessitar desativar em alguma situação
	torna mais fácil localizar a constraint que cria as regras para a tabela
 */
CREATE TABLE ALUNO(
	IDALUNO INT IDENTITY,
	NOME VARCHAR(30) NOT NULL,
	SEXO CHAR(1) NOT NULL,
	NASCIMENTO DATE,
	EMAIL VARCHAR(30)
)
GO

/* Criando a tabela sem nomear as constraints */
CREATE TABLE ENDERECO(
	IDENDERECO INT PRIMARY KEY IDENTITY(100,10),
	BAIRRO VARCHAR(30),
	UF CHAR(2) NOT NULL,
	CHECK (UF IN('RJ','SP','MG')),
	ID_ALUNO INT UNIQUE
)
GO

/* Usando Constraints */

/* Alternativa ao ENUM */
ALTER TABLE ALUNO
ADD CONSTRAINT CK_SEXO CHECK (SEXO IN('M','F'))
GO

/* Criando uma PK e nomeando a constraint */
ALTER TABLE ALUNO
ADD CONSTRAINT PK_IDALUNO PRIMARY KEY (IDALUNO);
GO

/* Criando chave do tipo UNIQUE */
ALTER TABLE ALUNO
ADD CONSTRAINT UQ_EMAIL UNIQUE (EMAIL)
GO

/* Criando a foreigh key */
ALTER TABLE ENDERECO
ADD CONSTRAINT FK_ENDERECO_ALUNO
FOREIGN KEY (ID_ALUNO) REFERENCES ALUNO(IDALUNO)
GO

/* Visualização de tabelas - No SQL Server isso ocorre através de procedures */
SP_COLUMNS ALUNO
GO

SP_HELP ALUNO
GO

/* Inserindo dados - Não é preciso informar NULL, para os campos de autoincremento */
INSERT INTO ALUNO VALUES('ANDRE','M','1981/12/09','ANDRE@IG.COM')

/* Join */
SELECT A.NOME, T.TIPO, T.NUMERO, E.BAIRRO, E.UF
FROM ALUNO A
LEFT JOIN TELEFONE T
ON A.IDALUNO = T.ID_ALUNO
INNER JOIN ENDERECO E
ON A.IDALUNO = E.ID_ALUNO
GO

/* Valores nulos (null) */
SELECT	A.NOME,
		ISNULL(T.TIPO, 'SEM') AS "TIPO",
		ISNULL(T.NUMERO, 'NUMERO') AS TELEFONE,
		E.BAIRRO,
		E.UF
FROM ALUNO A
LEFT JOIN TELEFONE T
ON A.IDALUNO = T.ID_ALUNO
INNER JOIN ENDERECO E
ON A.IDALUNO = E.ID_ALUNO
GO




