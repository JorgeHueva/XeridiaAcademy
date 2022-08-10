CREATE TABLE coffe(
    type_Coffe varchar (70) NOT NULL,
    price double NOT NULL,
    description text
);
CREATE TABLE coffe_o(
    type_Coffe varchar (70),
    num_Coffe int,
    price double,
    order_id int,
    PRIMARY KEY (type_Coffe,order_id)
);
CREATE TABLE pedido(
    order_id  int,
    regist_date date,
    PRIMARY KEY (order_id)
);
insert into coffe (Type_Coffe, Price, description )
values ('Cafe con leche',1.50, 'consiste en una base de espresso a la cual se le añade la misma cantidad de leche');
insert into coffe (Type_Coffe, Price, description)
values ('Cafe solo',1.30, 'café al que no se le añade nada a la taza de café, simplemente agua y el café infusionado en el agua que se a utilizado en la extracción');
insert into coffe (Type_Coffe, Price, description)
values ('Cafe cortado',1.20, 'forma en que leche “corta” la intensidad del espresso, atenuando su acidez mientras mantiene el sabor del café');
insert into coffe (Type_Coffe, Price, description)
values ('Capuchino',1.70, 'contiene expreso, vapor y espuma de leche a partes iguales');
insert into coffe (Type_Coffe, Price, description)
values ('Bombon',2.50, 'se vierten 120 ml de café extraído con un método de Phin o con filtro, y luego se agregan 2 cucharadas de leche condensada. Esto resulta una bebida cremosa y dulce, pero con un sabor más suave de café');
insert into coffe (Type_Coffe, Price, description)
values ('Cafe irlandes', 3.80, 'famoso cóctel que contiene whiskey, café, azúcar y crema');
insert into coffe (Type_Coffe, Price, description)
values ('Cola Cao',1.80, 'delicioso cacao en polvo con nuestra leche de la mejor calidad');