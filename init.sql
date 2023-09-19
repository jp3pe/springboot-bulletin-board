create user 'web' IDENTIFIED BY 'qwer1234!@#$';
grant delete
, insert,
select,
update, create
on clien.* to `web`;

create table post
(
    id            int auto_increment primary key,
    title         varchar(100)           not null comment 'A column to store title of the post.',
    content       text null comment 'Some content about the post.',
    author        VARCHAR(50) null comment 'A nickname who created the post.',
    created_date  DATETIME default NOW() not null,
    purchase_link TEXT null comment 'Link to purchase the product.'
) default character set utf8mb4 collate utf8mb4_unicode_ci
    comment 'A table to store post and metadata.';
