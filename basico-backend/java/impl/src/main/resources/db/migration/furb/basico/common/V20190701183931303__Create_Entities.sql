/* Database: PostgreSql. Generation date: 2019-07-01 18:39:31:303 */
/* Entity Tipo */
create table tipo (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id UUID NOT NULL,
	data DATE NOT NULL,
	hora TIME NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	tipo UUID NOT NULL
);



/* Entity Sala */
create table sala (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Setor */
create table setor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	sala UUID NOT NULL
);



/* Join Tables */
/* master: Sala as sala, detail: Setor as setor */
create table sala_setores (
	sala_id UUID NOT NULL,
	setores_id UUID NOT NULL
);

/* master: Sala as sala, detail: Evento as evento */
create table sala_evento (
	sala_id UUID NOT NULL,
	evento_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table tipo add constraint pk_tipo_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table sala_setores add constraint pk_sala_setores primary key(sala_id, setores_id);
alter table sala_evento add constraint pk_sala_evento primary key(sala_id, evento_id);
alter table sala add constraint pk_sala_id primary key(id);
alter table setor add constraint pk_setor_id primary key(id);

/* Foreign Key Constraints */
alter table evento add constraint fkp3adednli3uupxpffejrocxligqu foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkngjurk4l5yol8qvjzhnw7qepsa2g foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fk5aswvohqfq13kjtcarml0vapkqzd foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkk0s5rv0ynm5grfsa35nvan3gqnhr foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkdz40sqvikbqhb6wd2ojobf8j58m1 foreign key (evento_id) references evento (id);
alter table setor add constraint fktbrjpqbxfzecyrhnz8h07fw09hzz foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
