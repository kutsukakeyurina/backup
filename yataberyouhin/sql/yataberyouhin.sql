drop database if exists yataberyouhin;
create database yataberyouhin CHARACTER SET utf8;
use yataberyouhin;

CREATE TABLE m_category(
id int PRIMARY KEY NOT NULL,
category_id int UNIQUE KEY NOT NULL,
category_name varchar(20) UNIQUE KEY NOT NULL,
category_description varchar(100),
register_date datetime NOT NULL,
update_date datetime
);

insert into m_category values(,,"","",,);


CREATE TABLE product_info(
id int PRIMARY KEY NOT NULL,
product_id int UNIQUE KEY NOT NULL,
product_name varchar(100) UNIQUE KEY NOT NULL,
product_name_kana varchar(100) UNIQUE KEY NOT NULL,
product_description varchar(255) NOT NULL,
category_id int UNIQUE KEY NOT NULL,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime NOT NULL,
release_company varchar(50),
status tinyint NOT NULL DEFAULT 0,
register_date datetime NOT NULL,
update_date datetime,
FOREIGN KEY(category_id) REFERENCES m.category_id(category_id) ON UPDATE CASCADE
);


insert into product_info varchar(,,"","","",,,"","",,"",,,);
