/* Database: SqlServer. Generation date: 2019-07-01 09:30:19:364 */
/* Entity Cliente */
create table cliente (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade FLOAT(32) NOT NULL,
	valor_unitario FLOAT(32) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UNIQUEIDENTIFIER NOT NULL
);



/* Entity Tipo */
create table tipo (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	hora TIME NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	tipo UNIQUEIDENTIFIER NOT NULL
);



/* Entity Sala */
create table sala (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Setor */
create table setor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	sala UNIQUEIDENTIFIER NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UNIQUEIDENTIFIER NOT NULL,
	itens_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Sala as sala, detail: Setor as setor */
create table sala_setores (
	sala_id UNIQUEIDENTIFIER NOT NULL,
	setores_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Sala as sala, detail: Evento as evento */
create table sala_evento (
	sala_id UNIQUEIDENTIFIER NOT NULL,
	evento_id UNIQUEIDENTIFIER NOT NULL
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
alter table pedido add constraint fkrrw6krxkfk00k9fgb6fmool8q6qc foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkzbcccmyvxmapnray5wkxaodyrsdc foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkjmac9r5p1qs1v0xgka9dtwtn4qub foreign key (itens_id) references item (id);
alter table evento add constraint fkfsn4vqekusvkh5kuzkrn8sac8iek foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkljzynpnfzpg3zjmi5w3a53h7o6bi foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fkrb6btgnw1ckeb32uxn00j0gz56ln foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkqqi1wv4su4w51qtupwueo8apcubz foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkoweorpxcnlgt4kfpxznw0ukq183f foreign key (evento_id) references evento (id);
alter table setor add constraint fkeb1seutgewudsa8vdmzmny0trzw3 foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
