drop database if exists blogdemo;
create database blogdemo default charset utf8mb4;

use blogdemo;



drop table IF EXISTS user;
create table user(
    id int primary key auto_increment,
    name varchar(20),
    create_time timestamp
);

drop table IF EXISTS article;
create table article(
                        id int primary key auto_increment,
                        title varchar(50) not null,
                        content mediumtext not null,
                        user_id int,
                        create_time timestamp,
                        foreign key(user_id) references user(id)
);
insert into user(name ,create_time)values ('abc',current_timestamp );
insert into article(id, title, content, user_id, create_time) values ('标题一','内容一',1,current_timestamp );
insert into article(id, title, content, user_id, create_time) values ('标题二','内容二',1,current_timestamp );
insert into article(id, title, content, user_id, create_time) values ('标题三','内容三',1,current_timestamp );
insert into article(id, title, content, user_id, create_time) values ('标题四','内容四',1,current_timestamp );
insert into article(id, title, content, user_id, create_time) values ('标题五','内容五',1,current_timestamp );
