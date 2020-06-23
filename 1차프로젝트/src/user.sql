create table users(
	id varchar(50) ,
	pw varchar(50) ,
	name varchar(50)  ,
	age number(10) ,
	phone varchar(20) ,
	addr varchar(20),
	money number(10) 
)

create table public_cycle (
	info_no number(20),
	name varchar(50),
	location varchar(100),
	cycle_count number(20)
)

create table individual_cycle (
	name varchar(50),
	location varchar(100),
	cycle_count number(20),
	manager_id varchar(50)
)

create table cycle_kind (
	info_no number(20),
	manger_id varchar(50),
	kind varchar(50),
	price number(10),
	cycle_count number(20)
)


select * from users;
drop table users;

alter users add constraint default 0 money;