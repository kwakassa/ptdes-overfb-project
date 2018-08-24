DROP USER IF EXISTS ptdes;
DROP SCHEMA IF EXISTS OFB;
DROP ROLE IF EXISTS OFB_ROLES;

/*==============================================================*/
/* Criacao de usuario, schema, role e atribuicao                */ 
/* da role para o usuario                                       */
/*==============================================================*/

CREATE USER ptdes IDENTIFIED BY "ptdes";
CREATE SCHEMA OFB;
CREATE ROLE OFB_ROLES;
GRANT ALL TO OFB_ROLES;
GRANT OFB_ROLES TO ptdes;

/*==============================================================*/
/* Create Sequences                                             */
/*==============================================================*/
CREATE SEQUENCE OFB.OFBSQ001_NU_GRUPO_ACESSO
increment by 1
start with 1
nocycle
 nocache;
 
CREATE SEQUENCE OFB.OFBSQ004_NU_NSU_CONTA
increment by 1
start with 1
nocycle
 nocache;

/*==============================================================*/
/* Table: OFBTB001_GRUPO_ACESSO                                 */
/*==============================================================*/
CREATE TABLE OFB.OFBTB001_GRUPO_ACESSO
(
	NU_GRUPO_ACESSO NUMBER(5) NOT NULL default OFB.OFBSQ001_NU_GRUPO_ACESSO.nextval PRIMARY KEY,
	NO_GRUPO_ACESSO VARCHAR2(50) NOT NULL,
	constraint PK_OFBTB001 PRIMARY KEY (NU_GRUPO_ACESSO)
);

/*==============================================================*/
/* Table: OFBTB002_USUARIO                                      */
/*==============================================================*/
CREATE TABLE OFB.OFBTB002_USUARIO
(
	NO_USUARIO VARCHAR2(7) NOT NULL,
	DE_SENHA VARCHAR2(200) NOT NULL,
	NU_GRUPO_ACESSO NUMBER(5) NOT NULL	
);

/*==============================================================*/
/* Table: OFBTB003_CLIENTE                                      */
/*==============================================================*/
CREATE TABLE OFB.OFBTB003_CLIENTE
(
	NU_CPF_CLIENTE NUMBER(11) NOT NULL,
	NO_CLIENTE VARCHAR2(200) NOT NULL,
	DT_NASCIMENTO DATE NOT NULL	
);

/*==============================================================*/
/* Table: OFBTB004_CONTA                                      */
/*==============================================================*/
CREATE TABLE OFB.OFBTB004_CONTA
(
	NU_NSU_CONTA NUMBER(15) NOT NULL,
	NU_AGENCIA NUMBER(4) NOT NULL,
	NU_OPERACAO_PRODUTO NUMBER(4) NOT NULL,
	NU_CONTA NUMBER(12) NOT NULL,
	DV_CONTA NUMBER(1) NOT NULL DEFAULT 0,
	IC_NSGD NUMBER(1) NOT NULL DEFAULT 0,
	VR_SALDO_CONTA DECIMAL(15,2) NOT NULL DEFAULT 0.0
);

/*==============================================================*/
/* Table: OFBTB005_CLIENTE_CONTA                                      */
/*==============================================================*/
CREATE TABLE OFB.OFBTB005_CLIENTE_CONTA
(
	NU_CPF_CLIENTE_003 NUMBER(11) NOT NULL,
	NU_NSU_CONTA_004 NUMBER(15) NOT NULL
);

ALTER TABLE OFB.OFBTB002_USUARIO ADD CONSTRAINT PK_OFBTB002 PRIMARY KEY (NO_USUARIO);
ALTER TABLE OFB.OFBTB002_USUARIO ADD CONSTRAINT FK_OFBTB002_OFBTB001 FOREIGN KEY (NU_GRUPO_ACESSO) REFERENCES OFB.OFBTB001_GRUPO_ACESSO (NU_GRUPO_ACESSO);

ALTER TABLE OFB.OFBTB003_CLIENTE ADD CONSTRAINT PK_OFBTB003 PRIMARY KEY (NU_CPF_CLIENTE);

ALTER TABLE OFB.OFBTB004_CONTA ADD CONSTRAINT PK_OFBTB004 PRIMARY KEY (NU_AGENCIA,NU_OPERACAO_PRODUTO,NU_CONTA);
ALTER TABLE OFB.OFBTB004_CONTA ALTER COLUMN NU_NSU_CONTA SET DEFAULT OFB.OFBSQ004_NU_NSU_CONTA.nextval;
ALTER TABLE OFB.OFBTB004_CONTA ADD CONSTRAINT CKC_IC_NSGD_OFBTB004 CHECK (IC_NSGD IN (0,1));

ALTER TABLE OFB.OFBTB005_CLIENTE_CONTA ADD CONSTRAINT PK_OFBTB005 PRIMARY KEY (NU_CPF_CLIENTE_003,NU_NSU_CONTA_004);
ALTER TABLE OFB.OFBTB005_CLIENTE_CONTA ADD CONSTRAINT FK_OFBTB005_OFBTB003 FOREIGN KEY (NU_CPF_CLIENTE_003) REFERENCES OFB.OFBTB003_CLIENTE (NU_CPF_CLIENTE);
ALTER TABLE OFB.OFBTB005_CLIENTE_CONTA ADD CONSTRAINT FK_OFBTB005_OFBTB004 FOREIGN KEY (NU_NSU_CONTA_004) REFERENCES OFB.OFBTB004_CONTA (NU_NSU_CONTA);

GRANT ALL ON OFB.OFBTB001_GRUPO_ACESSO TO OFB_ROLES;
GRANT ALL ON OFB.OFBTB002_USUARIO TO OFB_ROLES;
GRANT ALL ON OFB.OFBTB003_CLIENTE TO OFB_ROLES;
GRANT ALL ON OFB.OFBTB004_CONTA TO OFB_ROLES;
GRANT ALL ON OFB.OFBTB005_CLIENTE_CONTA TO OFB_ROLES;

ALTER SEQUENCE OFB.OFBSQ001_NU_GRUPO_ACESSO RESTART WITH 1;