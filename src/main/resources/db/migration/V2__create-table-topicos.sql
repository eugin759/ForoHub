create table topicos(
         id bigint not null auto_increment,
         mensaje varchar(1000) not null,
         nombre_curso varchar(200) not null,
         titulo varchar(100) not null,
         fecha datetime not null,
         primary key(id)
);