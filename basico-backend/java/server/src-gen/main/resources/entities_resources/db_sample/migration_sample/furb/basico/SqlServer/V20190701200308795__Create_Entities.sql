/* Database: SqlServer. Generation date: 2019-07-01 20:03:08:795 */
/* Entity Tipo */
create table tipo (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
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
alter table tipo add constraint pk_tipo_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table sala_setores add constraint pk_sala_setores primary key(sala_id, setores_id);
alter table sala_evento add constraint pk_sala_evento primary key(sala_id, evento_id);
alter table sala add constraint pk_sala_id primary key(id);
alter table setor add constraint pk_setor_id primary key(id);

/* Foreign Key Constraints */
alter table evento add constraint fkjdl2epsqpvzegy5b1shqwuwhrsze foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkkqsw86vzf0ykoe5fyogpn435fxub foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fkhglozgvjvn1rqyhc7cz258dc3by9 foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkgb1obn0ldodutclhkq2wmojvackd foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkcbx6jdkenxclogyeb6irajopv2mw foreign key (evento_id) references evento (id);
alter table setor add constraint fk3rrtvsrflgmgnxfrrmsuaxm3jbol foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
