create database if not exists mydb;
use mydb;
create table blog(b_id int unsigned not null primary key,
  b_url varchar(40) not null unique,
                   b_name varchar(40) not null,
                     b_date date not null,a_id int unsigned not null);


create table author(a_id int unsigned not null primary key,
                   a_name varchar(40) not null);


alter table blog
add foreign key (a_id) references author(a_id);


create table tags(t_id int unsigned not null primary key,
                   t_name varchar(40) not null);
create table post(p_id int unsigned not null primary key,
  
                   p_name varchar(40) not null,a_id int unsigned not null);
                  

alter table post
add foreign key (a_id) references author(a_id);


create table category(c_id int unsigned not null primary key,
                   c_name varchar(40) not null, b_id int unsigned not null,category_c_id int unsigned not null );

alter table category
add foreign key (b_id) references blog(b_id),
add foreign key (category_c_id) references category(c_id);

create table comments(c_id int unsigned not null primary key,
                   comments varchar(40) not null,p_id int unsigned not null );

alter table comments
add foreign key (p_id) references post(p_id);

create table post_has_tags(post_p_id int unsigned not null,
  
                   tags_t_id int unsigned not null);

                

alter table post_has_tags
add foreign key (post_p_id) references tags(t_id),
add foreign key (tags_t_id) references post(p_id);
  
create table category_has_posts(post_p_id int unsigned not null,
  
                   category_c_id int unsigned not null);

alter table category_has_posts
add foreign key (post_p_id) references category(c_id),
add foreign key (category_c_id) references post(p_id);

select * from author;

INSERT INTO `mydb`.`blog` (`b_id`, `b_url`, `b_name`, `b_date`, `a_id`) VALUES ('1', 'abc@cde.com', 'nature', '21/06/19', '2');
INSERT INTO `mydb`.`blog` (`b_id`, `b_url`, `b_name`, `b_date`, `a_id`) VALUES ('2', 'dsdh@fsfh.com', 'programming', '25/07/19', '1');

select * from post;
select * from tags;
select * from category;
select * from comments;
select * from post_has_tags;
Alter table category
drop foreign key category_ibfk_2;

show create table category;
Alter table category
drop category_c_id;

alter table category
add category_c_id int unsigned;

alter table category

add foreign key (category_c_id) references category(c_id);


select * from blog;
  