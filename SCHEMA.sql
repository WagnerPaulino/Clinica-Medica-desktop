


CREATE TABLE CONSULTA(
    ID BIGINT NOT NULL,
    ALTURA DOUBLE,
    DESCRICAO VARCHAR(255),
    DIAGNOSTICO VARCHAR(255),
    DT_CONSULTA VARCHAR(255),
    DT_RETORNO VARCHAR(255),
    ESPECIALIDADE VARCHAR(255),
    EXAME VARCHAR(255),
    PESO DOUBLE,
    PRESSAO INTEGER,
    SINTOMAS DOUBLE,
    TRATAMENTO VARCHAR(255),
    VALOR_CONSULTA DOUBLE,
    MEDICO_ID BIGINT,
    RECEPCIONISTAS_ID BIGINT
);
CREATE TABLE MEDICO(
    ID BIGINT NOT NULL,
    BAIRRO VARCHAR(255),
    CELULAR VARCHAR(255),
    CEP VARCHAR(255),
    CIDADE VARCHAR(255),
    CPF VARCHAR(255),
    DT_NASCIMENTO VARCHAR(255),
    EMAIL VARCHAR(255),
    NOME VARCHAR(255),
    NUM_CASA VARCHAR(255),
    RESIDENCIAL VARCHAR(255),
    RG INTEGER NOT NULL,
    RUA VARCHAR(255),
    SEXO VARCHAR(255),
    ESPECIALIDADE VARCHAR(255),
    ID_CRM INTEGER,
    PROPRIETARIO_ID BIGINT
);
CREATE TABLE PACIENTE(
    ID_PACIENTE BIGINT NOT NULL,
    BAIRRO VARCHAR(255),
    CELULAR VARCHAR(255),
    CEP VARCHAR(255),
    CIDADE VARCHAR(255),
    CPF VARCHAR(255),
    DT_NASCIMENTO VARCHAR(255),
    EMAIL VARCHAR(255),
    NOME VARCHAR(255),
    NUM_CASA VARCHAR(255),
    RESIDENCIAL VARCHAR(255),
    RG INTEGER NOT NULL,
    RUA VARCHAR(255),
    SEXO VARCHAR(255)
);

CREATE  TABLE PROPRIETARIO(
    ID BIGINT NOT NULL,
    BAIRRO VARCHAR(255),
    CELULAR VARCHAR(255),
    CEP VARCHAR(255),
    CIDADE VARCHAR(255),
    CPF VARCHAR(255),
    DT_NASCIMENTO VARCHAR(255),
    EMAIL VARCHAR(255),
    NOME VARCHAR(255),
    NUM_CASA VARCHAR(255),
    RESIDENCIAL VARCHAR(255),
    RG INTEGER NOT NULL,
    RUA VARCHAR(255),
    SEXO VARCHAR(255)
);
CREATE TABLE RECEPCIONISTA(
    ID BIGINT NOT NULL,
    BAIRRO VARCHAR(255),
    CELULAR VARCHAR(255),
    CEP VARCHAR(255),
    CIDADE VARCHAR(255),
    CPF VARCHAR(255),
    DT_NASCIMENTO VARCHAR(255),
    EMAIL VARCHAR(255),
    NOME VARCHAR(255),
    NUM_CASA VARCHAR(255),
    RESIDENCIAL VARCHAR(255),
    RG INTEGER NOT NULL,
    RUA VARCHAR(255),
    SEXO VARCHAR(255),
    ADM BOOLEAN,
    CFP_EXISTENTE VARCHAR(255),
    LOGIN VARCHAR(255),
    SENHA VARCHAR(255),
    PROPRIETARIO_ID BIGINT
);

CREATE TABLE RECEPCIONISTA_PACIENTES(
    RECEPCIONISTAS_ID BIGINT NOT NULL,
    PACIENTES_ID_PACIENTE BIGINT NOT NULL
);
