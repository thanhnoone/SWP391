
-- 001.sql
-- t06_role, t14_user, t09_image_avt, t13_subject, t04_center
USE swp391_db_release;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS t06_role;
CREATE TABLE t06_role (
   C06_ROLE_ID INT PRIMARY KEY,
   C06_ROLE_DESC ENUM('STUDENT', 'PARENT', 'TEACHER', 'MANAGER', 'ADMIN') NOT NULL
);

DROP TABLE IF EXISTS t14_user;
CREATE TABLE t14_user (
    C14_USER_ID INT AUTO_INCREMENT PRIMARY KEY,
    C14_USER_USERNAME VARCHAR(30) NOT NULL UNIQUE,
    C14_USER_PASSWORD VARCHAR(50) NOT NULL,
    C14_ACC_STATUS BIT(1) NOT NULL,
    C14_USER_CODE INT NOT NULL UNIQUE,
    C14_USER_NAME VARCHAR(30) NOT NULL,
    C14_USER_PHONE VARCHAR(20) NOT NULL,
    C14_USER_ADDRESS VARCHAR(100) NOT NULL,
    C14_USER_DOB DATE NOT NULL,
    C14_USER_GENDER BIT(1) NOT NULL,
    C14_USER_EMAIL VARCHAR(50) NOT NULL,
    C14_ROLE_ID INT NOT NULL ,
    C14_PARENT_ID INT,
    CONSTRAINT FK_USER_ROLE FOREIGN KEY (C14_ROLE_ID) REFERENCES t06_role(C06_ROLE_ID),
    CONSTRAINT FK_USER_PARENT FOREIGN KEY (C14_PARENT_ID) REFERENCES t14_user(C14_USER_ID)
);

DROP TABLE IF EXISTS t09_image_avt;
CREATE TABLE t09_image_avt (
    C09_IMAGE_ID INT AUTO_INCREMENT PRIMARY KEY,
    C09_IMAGE_PATH VARCHAR(255) NOT NULL UNIQUE,
    C09_IMAGE_TYPE ENUM('STUDENT', 'PARENT', 'TEACHER', 'MANAGER', 'ADMIN', 'CENTER') NOT NULL,
    C09_USER_ID INT NOT NULL,
    CONSTRAINT FK_IMAGE_USER FOREIGN KEY (C09_USER_ID) REFERENCES t14_user(C14_USER_ID)
);

DROP TABLE IF EXISTS t13_subject;
CREATE TABLE t13_subject (
    C13_SUBJECT_ID INT AUTO_INCREMENT PRIMARY KEY,
    C13_SUBJECT_NAME VARCHAR(30) NOT NULL UNIQUE,
    C13_SUBJECT_DESC TEXT NOT NULL
);

DROP TABLE IF EXISTS t04_center;
CREATE TABLE t04_center (
    C04_CENTER_ID INT AUTO_INCREMENT PRIMARY KEY,
    C04_CENTER_CODE INT NOT NULL UNIQUE,
    C04_CENTER_NAME VARCHAR(30) NOT NULL,
    C04_CENTER_DESC TEXT NOT NULL,
    C04_CENTER_ADDRESS VARCHAR(50) NOT NULL,
    C04_CENTER_PHONE VARCHAR(20) NOT NULL,
    C04_CENTER_EMAIL VARCHAR(30) NOT NULL,
    C04_CENTER_REGULATIONS TEXT NOT NULL,
    C04_CREATED_AT DATE DEFAULT(CURRENT_TIMESTAMP) NOT NULL,
    C04_IMAGE_PATH TEXT NOT NULL
);

SET FOREIGN_KEY_CHECKS = 0;