CREATE TABLE coffe(
    type_Coffe varchar (70) NOT NULL,
    price double NOT NULL
);
CREATE TABLE coffe_o(
    type_Coffe varchar (70),
    num_Coffe int,
    price double,
    PRIMARY KEY (Type_Coffe)
);
CREATE TABLE pedido(
    id  int,
    regist_date date,
    PRIMARY KEY (ID)
);
insert into coffe (Type_Coffe, Price)
values ('Cafe con leche',1.50);
insert into coffe (Type_Coffe, Price)
values ('Cafe solo',1.30);
insert into coffe (Type_Coffe, Price)
values ('Cafe cortado',1.20);
insert into coffe (Type_Coffe, Price)
values ('Cola Cao',1.80);
insert into coffe (Type_Coffe, Price)
values ('Capuchino',1.90);