/* Database: Oracle. Generation date: 2019-07-01 18:39:31:383 */
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
alter table tipo add constraint pk_tipo_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table sala_setores add constraint pk_sala_setores primary key(sala_id, setores_id);
alter table sala_evento add constraint pk_sala_evento primary key(sala_id, evento_id);
alter table sala add constraint pk_sala_id primary key(id);
alter table setor add constraint pk_setor_id primary key(id);

/* Foreign Key Constraints */
alter table evento add constraint fk5fbghqhm3iudaokpzdfkjccrcpet foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkt5z9sapey6wf5pnc7kjy3zmt1srg foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fkuuyokjefmuk0gckxz8ubecd0gx3x foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkqa6tcddikku6lj2fsyefzduir6q0 foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkg4c6zakbrwcjavwaqjya130cux05 foreign key (evento_id) references evento (id);
alter table setor add constraint fkng1q8x7hrocikwqvctzvhkrogw5n foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
