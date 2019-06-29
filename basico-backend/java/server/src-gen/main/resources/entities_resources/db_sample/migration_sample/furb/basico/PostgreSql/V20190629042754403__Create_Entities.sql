/* Database: PostgreSql. Generation date: 2019-06-29 04:27:54:403 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UUID NOT NULL
);



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
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

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
alter table pedido add constraint fkbhadetma1npgtx2xayoefzh7kkzy foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fktztu15rettpt7kyxs38x5ueixqkq foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkepsdrx9x4svyebp9exo04sjojmbh foreign key (itens_id) references item (id);
alter table evento add constraint fkml22j7cmow2ogqvdgub8wupid2nu foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fk28e1lniz2erzdkksn0jt1tlprxdd foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fke0dnqxf45dyniaeng1zx05jaf8nw foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fkme6qchwxb2afcuzj4vlughb01bav foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkxx4ehwuefcut9pdcrt2bbnvb9lzy foreign key (evento_id) references evento (id);
alter table setor add constraint fk92givkdpoyn4wifb9b3xq5skgfue foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
