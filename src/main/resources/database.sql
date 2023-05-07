create table users(
	id serial primary key not null,
	name varchar(20) not null,
	created_at bigint not null,
	updated_at bigint not null
)