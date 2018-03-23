CREATE TABLE ADMIN_SCHOOL (
    schoolId int NOT NULL IDENTITY(1,1),
	addressId varchar(255),
    failitiesId int,
	status varchar(255),
    PRIMARY KEY (schoolId)

	CREATE TABLE ADMIN_Facilities (
    id int NOT NULL IDENTITY(1,1),
    failitiesName varchar(255),
	status varchar(255),
);

	CREATE TABLE ADMIN_Address (
    id int NOT NULL IDENTITY(1,1),
    area varchar(255),
	city varchar(255),
	district varchar(255),
	pincode varchar(255),
	state varchar(255),
	country varchar(255),
	landmark varchar(255),
	status varchar(255),
);