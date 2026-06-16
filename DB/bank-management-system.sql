create database bankSystem;
use bankSystem;
create table signUp(
form_no varchar(30),name varchar(30),fName varchar(30),dob varchar(30),gender varchar(30),email varchar(60),address varchar(50),city varchar(30),marital_status varchar(30),pin_code varchar(30)
);
ALTER TABLE signUp DROP COLUMN pin_code;
select * from signUp;

create table signUptwo(
form_no varchar(30),religion varchar(30),income varchar(30),education varchar(30),occupation varchar(30),senior_citizen varchar(30),existing_account varchar(60)
);
ALTER TABLE signUptwo
ADD cnic varchar(30);

select * from signUp;

create table signUpthree(
form_no varchar(30),accountType varchar(30),cardNo varchar(30),pin varchar(30),services varchar(200)
);
select * from signUpthree;

create table login(
form_no varchar(30),cardNo varchar(50),pin varchar(30)
);
select * from login;

create table bank(
pin varchar(30),date varchar(50),type varchar(30),amount varchar(20)
);
select * from bank where pin = "1234";
drop table bank ;

