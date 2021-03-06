/* Database: Oracle. Generation date: 2019-06-29 04:27:54:555 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMBER(19,4) NOT NULL,
	valor_unitario NUMBER(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id RAW(16) NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente RAW(16) NOT NULL
);



/* Entity Tipo */
create table tipo (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id RAW(16) NOT NULL,
	data DATE NOT NULL,
	hora DATE NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	tipo RAW(16) NOT NULL
);



/* Entity Sala */
create table sala (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Setor */
create table setor (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	sala RAW(16) NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id RAW(16) NOT NULL,
	itens_id RAW(16) NOT NULL
);

/* master: Sala as sala, detail: Setor as setor */
create table sala_setores (
	sala_id RAW(16) NOT NULL,
	setores_id RAW(16) NOT NULL
);

/* master: Sala as sala, detail: Evento as evento */
create table sala_evento (
	sala_id RAW(16) NOT NULL,
	evento_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table tipo add constraint pk_tipo_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table sala_setores add constraint pk_sala_setores primary key(sala_id, setores_id);
alter table sala_evento add constraint pk_sala_evento primary key(sala_id, evento_id);
alter table sala add constraint pk_sala_id primary key(id);
alter table setor add constraint pk_setor_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkwq7i8sl63flrph2cwb3rufgiqdoh foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkh060w0x9gih6eyth05mjaeexinvm foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkbxoycauelmg3kxmrqprldniooh29 foreign key (itens_id) references item (id);
alter table evento add constraint fkrhbz9ikdahne6viirlnrclxxdllo foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fksfxaq0mefjohfxhzh0nbd4ktmtqh foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fk2hhc5qpk6fejzynnn8s7xhrygids foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkfczjakz2yohr3lqxtiihlu1c4epy foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkcphytsfn1tqeoqg5ncegd31df93b foreign key (evento_id) references evento (id);
alter table setor add constraint fkubdocueyqrgbg4hbugib8uqbibgg foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
