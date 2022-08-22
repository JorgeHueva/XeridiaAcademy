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
insert into coffe (Type_Coffe, Price, description,imagen )
values ('Te verde',1.90, 'El té verde recibe su nombre por el color que adquieren las hojas del té en el proceso diferenciador, en la fermentación y el secado. Es un tipo de té que procede la planta Camellia sinensis.', 'https://statics-cuidateplus.marca.com/cms/styles/ratio_16_9/azblob/te_verde.jpg.webp?itok=6K-94miw');
insert into coffe (Type_Coffe, Price, description,imagen )
values ('Te rojo',1.90, 'El té rojo es un tipo de té que se obtiene a partir de hojas del árbol Camellia sinensis, el mismo del que procede el té verde, solo que estas son sometidas a un tipo de procesamiento muy distinto que hace que también varíen las propiedades de esta planta', 'https://www.definicionabc.com/wp-content/uploads/general/te-rojo-2-410x339.jpg');
insert into coffe (Type_Coffe, Price, description,imagen )
values ('Te negro',1.90, 'El té negro es una variedad de té obtenido de la planta Camellia sinensis, la misma de la que se obtienen el té verde y el té rojo, este se logra al emplear hojas y tallos envejecidos, lo que cambia sus propiedades y sus efectos en el organismo', 'https://t2.uc.ltmcdn.com/es/posts/5/0/3/cuales_son_las_contraindicaciones_del_te_negro_41305_orig.jpg');
insert into coffe (Type_Coffe, Price, description,imagen )
values ('Pincho tortilla',2.00, 'Deliciosas patatas freidas a fuego lento con huevos batidos y una pizca de sal, dando como resultado una textura perfecta ', 'https://canalcocina.es/medias/_cache/zoom-ed33006354886cff3b7d7b01d3629fb7-920-518.jpg');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Bocadito de jamon', 2.20, 'Jamón ibérico con pan horneado del día con un chorrito de aceite de oliva virgen extra y un poco de tomate  ', 'https://minimarketformentera.com/wp-content/uploads/2021/06/Entrepa-Pernil-scaled.jpg');
insert into coffe (Type_Coffe, Price, description, imagen)
values ('Bollería del día', 1.50, 'Dependiendo del día de la semana una panadería nos trae diferentes variedades', 'https://www.consumer.es/app/uploads/fly-images/101195/img_aceite-palma-bolleria-industrial-hd-1200x550-cc.jpg');