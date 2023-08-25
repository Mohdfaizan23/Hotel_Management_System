# Hotel_Management_System
Hotel Management System (HMS) developed for managing hotels written using swing java and JDBC and utilizes data from/to the MySQL database.
## Features

- Dashboard

- Login

- Booking

- New Rooms

- New Cars

- Room Status

- Check Out

- Add Employee

- Customer Info

- Employee Info

- Pickup Service

- Pickup Info

- Reception
## First of all in Conn file you have to enter your username and password, if the username is root let it be root.

![Screenshot 2023-08-25 113014](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/1342bef9-ab1f-4e9c-8a36-60e5a229405e)

![Screenshot 2023-08-25 113048](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/aa627f64-3651-4cbd-9a76-cadbabbae29c)
## Database queries
create database hotelmanagementsystem;

show databases;

use hotelmanagementsystem;

create table login(username varchar(25), password varchar(25));

insert into login values('admin', '12345');

select * from login;

create table employee(name varchar(25), age varchar(25), gender varchar(15), job varchar(30), salary varchar(15), phone varchar(15), email varchar(40), aadhar varchar(20));

select * from employee;

create table room(roomnumber varchar(10), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));

select * from room;

create table driver(name varchar(20), age varchar(10), gender varchar(15), company varchar(20), brand varchar(20), available varchar(20), location varchar(40));

select * from driver;

create table customer(document varchar(20), number varchar(30), name varchar(30), gender varchar(15), country varchar(20), room varchar(10), checkintime varchar(80), deposit varchar(20));

select * from customer;

create table department(department varchar(30), budget varchar(30));

insert into department values('Front Office', '500000');

insert into department values('Housekeeping', '40000');

insert into department values('Food and Beverage', '23000');

insert into department values('Kitchen or Food Production', '540000');

insert into department values('Security', '320000');

select * from department;

## Screenshots
![Screenshot 2023-08-25 105632](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/bb4e47b0-d719-41d1-89f2-4070055fa3ef)

## Admin section

![Screenshot 2023-08-25 110252](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/17cb1aa2-0cc2-4363-ad73-d60ee6bf963d)
![Screenshot 2023-08-25 110314](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/40118b2d-e3a6-4b29-bf32-7833c0a79624)
![Screenshot 2023-08-25 110233](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/0a2db882-5758-45fe-9862-226a66e5166d)
## Reception section
![Screenshot 2023-08-25 105656](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/52f9a2c1-b88a-45e4-802c-773f8f3ab916)

- As soon as you select the customer Id and click on the check button, all data comes to the database and filled the all textfied automatically. and same process for update data change data manually and click the update button all the data will be changed according to you and saved in database.
![Screenshot 2023-08-25 105825](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/10e30574-f793-404d-8df7-efc0454adadf)
![Screenshot 2023-08-25 105908](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/3334bd14-af41-495f-9aac-d48bd5ef5f46)

- select the bed option and check the checkbox so that would be show what you choose.
![Screenshot 2023-08-25 105936](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/e17a66dc-1a08-4b21-a2e3-649680be6c19)

-select the car option so that would be show what you choose.
![Screenshot 2023-08-25 110031](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/ac1f210d-d0d6-4390-b307-6aeba5138244)
As soon as you select the customer Id and click  on the check button, all data comes to the database and filled the all textfield automatically and show all paid amount and pending amount, if the customer has deposited all the money then it can also be updated.
![Screenshot 2023-08-25 105737](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/9db7fdbd-e355-4301-9e10-3b6422cbc091)
![Screenshot 2023-08-25 110129](https://github.com/Mohdfaizan23/Hotel_Management_System/assets/134620532/74e5210b-6a4e-4884-ba22-04f3833813d7)


