create schema clien collate utf8mb4_unicode_ci;

create user 'web' IDENTIFIED BY 'qwer1234!@#$';
grant delete, insert, select, update on clien.* to `web`;