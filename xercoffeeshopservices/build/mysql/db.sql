CREATE TABLE Coffe(
    Type_Coffe varchar (25) NOT NULL,
    Price double NOT NULL
);
CREATE TABLE Coffe_O(
    Type_Coffe varchar (25),
    num_Coffe int,
    Price double,
    PRIMARY KEY (Type_Coffe)
);
CREATE TABLE Pedido(
    ID  int,
    PRIMARY KEY (ID)
);
insert into Coffe (Type_Coffe, Price)
values ('Cafe con leche',1.50);
insert into Coffe (Type_Coffe, Price)
values ('Cafe solo',1.30);
insert into Coffe (Type_Coffe, Price)
values ('Cafe cortado',1.20);
insert into Coffe (Type_Coffe, Price)
values ('Cola Cao',1.80);
insert into Coffe (Type_Coffe, Price)
values ('Capuchino',1.90);