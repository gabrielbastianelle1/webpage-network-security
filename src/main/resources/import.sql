ALTER TABLE users MODIFY id binary(36);

insert into users (id, email, password) VALUES ('d1afd6ea-ce40-11ed-afa1-0242ac120002', 'user@example.com','123');