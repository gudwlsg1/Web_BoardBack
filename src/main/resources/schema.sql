use web02board;

drop table if exists User;
drop table if exists Post;

create table User(
  id bigint auto_increment primary key,
  account varchar(100) not null unique,
  password varchar(100),
  username varchar(30),
  email varchar(50) not null unique,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Post(
  id bigint auto_increment primary key,
  user_id bigint,
  title varchar(255),
  content text,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
)engine=InnodB default charset=utf8;