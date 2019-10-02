create database AplicativoDeTarefas;

use AplicativoDeTarefas;

create table Usuario(
	Id int primary key auto_increment,
    Nome varchar(50),
    Sobrenome varchar(50)
);

create table Prioridade(
	Id int primary key auto_increment,
    Nivel_pri int not null,
    Descricao_Pri varchar(20)
);

create table Tarefas(
	Id int primary key auto_increment,
    Nome_tarefa varchar(100) not null,
    FK_Pri int,
    FK_Resp int,
    constraint FK_Pri foreign key(FK_Pri) references Prioridade(Id),
    constraint FK_Resp foreign key(FK_Resp) references Usuario(Id),
    Tarefa_status bit
);

insert into Prioridade (Nivel_pri, Descricao_Pri)values(3, 'Alto');
insert into Prioridade (Nivel_pri, Descricao_Pri)values(2, 'Medio');
insert into Prioridade (Nivel_pri, Descricao_Pri)values(1, 'Baixo');