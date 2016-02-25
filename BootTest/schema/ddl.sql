create table user_info (
    id int AUTO_INCREMENT PRIMARY KEY,
    userid varchar(50) not null,
    passwd varchar(200) not null,
    name    varchar(50) not null,
    failcnt int,
    lastlogintime timestamp,
    createtime timestamp,
    passwdchangetime timestamp
);
