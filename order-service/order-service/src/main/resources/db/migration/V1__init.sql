CREATE TABLE t_orders
(
id int AUTO_INCREMENT,
order_number varchar(255) DEFAULT NULL,
sku_code varchar(255),
price decimal(19,2),
quantity int(11),
PRIMARY KEY (id)
);