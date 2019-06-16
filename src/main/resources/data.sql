use web02board;

insert into User(account, password, username, email) values
('user1', '1234', 'test1', 'user1@dgsw.hs.kr'),
('user2', '1234', 'test2', 'user2@dgsw.hs.kr'),
('user3', '1234', 'test3', 'user3@dgsw.hs.kr'),
('user4', '1234', 'test4', 'user4@dgsw.hs.kr'),
('user5', '1234', 'test5', 'user5@dgsw.hs.kr');

insert into Post(user_id, title, content) values
(1,'title1', 'content1'),
(2,'title2', 'content2'),
(3,'title3', 'content3');