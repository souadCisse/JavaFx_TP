create table PRODUCT(
    productId BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
    ref varchar (100),
    price decimal,
    categoryId BIGINT NOT NULL ,
    foreign key(categoryId) references CATEGORY(categoryID)
);
create table CATEGORY(
    categoryID BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT ,
    name VARCHAR(100)
);
