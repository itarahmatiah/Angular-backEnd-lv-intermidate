create table rekening(
	id varchar(36),
	nomor varchar(1000) not null,
	nama varchar(255) not null,
	primary key(id)
);

create table transfer(
	id varchar(36),
	id_rekening_sumber varchar (36) not null,
	id_rekening_tujuan varchar (36) not null,
	nilai number(18,2) not null,
	berita varchar(255),
	primary key(id),
	foreign key(id_rekening_sumber) references rekening(id),
	foreign key(id_rekening_tujuan) references rekening(id)
);