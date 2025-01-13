drop database if exists mydb0110;
create database mydb0110;
use mydb0110;

create table waiting(
wno int auto_increment,
wphone varchar(13),
wpeople int,
primary key(wno)
);

select*from waiting;

