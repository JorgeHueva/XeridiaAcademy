CREATE TABLE coffe(
    type_Coffe varchar (70) NOT NULL,
    price double NOT NULL,
    description text,
    imagen varchar(100),
    PRIMARY KEY (type_coffe)
);
CREATE TABLE coffe_o(
    coffe_type_coffe varchar (70),
    num_coffe int,
    price double,
    pedido_order_id int,
    PRIMARY KEY (coffe_type_coffe, pedido_order_id)
);
CREATE TABLE pedido(
    order_id  int,
    regist_date date,
    PRIMARY KEY (order_id)
);
ALTER TABLE coffe_o ADD CONSTRAINT hola1 FOREIGN KEY (coffe_type_coffe) REFERENCES coffe (type_coffe);
ALTER TABLE coffe_o ADD CONSTRAINT hola2 FOREIGN KEY (pedido_order_id) REFERENCES pedido (order_id);

insert into coffe (Type_Coffe, Price, description, imagen )
values ('Cafe con leche',1.50, 'Consiste en una base de espresso a la cual se le añade la misma cantidad de leche','https://th.bing.com/th/id/OIP.oX86QzATpdXdYSRUNm8TcQHaE8?pid=ImgDet&rs=1');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Cafe solo',1.30, 'Café al que no se le añade nada a la taza de café, simplemente agua y el café infusionado en el agua que se a utilizado en la extracción', 'https://th.bing.com/th/id/OIP.qv_WSPVbm-zs-SvpkfGsgQHaEK?pid=ImgDet&rs=1');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Cafe cortado',1.20, 'Forma en que leche “corta” la intensidad del espresso, atenuando su acidez mientras mantiene el sabor del café', 'https://www.caffeblabla.it/wp-content/uploads/2021/01/cortado.jpeg');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Capuchino',1.70, 'Contiene expreso, vapor y espuma de leche a partes iguales', 'https://th.bing.com/th/id/OIP.DxFgGzajSsb-QM-Dk91BJwHaFi?pid=ImgDet&rs=1');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Bombon',2.50, 'Se vierten 120 ml de café extraído con un método de Phin o con filtro, y luego se agregan 2 cucharadas de leche condensada. Esto resulta una bebida cremosa y dulce, pero con un sabor más suave de café', 'https://th.bing.com/th/id/OIP.NoVRMFe21521CNy744rp8gHaHa?pid=ImgDet&rs=1');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Cafe irlandes', 3.80, 'Famoso cóctel que contiene whiskey, café, azúcar y crema', 'https://www.bi1.fr/wp-content/uploads/2019/11/Recette-whisky-03-300x230.png');
insert into coffe (Type_Coffe, Price, description,imagen )
values ('Cola Cao',1.80, 'Delicioso cacao en polvo con nuestra leche de la mejor calidad', 'https://image.freepik.com/foto-gratis/cola-cao-vaso-mesa_23-2147985566.jpg');

