
-- 004.sql
-- t15_enrollment, t16_user_center, t17_student_schedule

USE swp391_db_release;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS t15_enrollment; -- n-n: class - student
CREATE TABLE t15_enrollment (
     C15_ENROLLMENT_ID INT AUTO_INCREMENT PRIMARY KEY,
     C15_USER_ID INT NOT NULL,
     C15_CLASS_ID INT NOT NULL,
     CONSTRAINT CK_T15_FK UNIQUE(C15_USER_ID, C15_CLASS_ID),
     CONSTRAINT FK_ENROLLMENT_USER FOREIGN KEY (C15_USER_ID) REFERENCES t14_user(C14_USER_ID),
     CONSTRAINT FK_ENROLLMENT_CLASS FOREIGN KEY (C15_CLASS_ID) REFERENCES t01_class(C01_CLASS_ID)
);

DROP TABLE IF EXISTS t16_user_center; -- n-n: center - student
CREATE TABLE t16_user_center (
     C16_USER_CENTER_ID INT AUTO_INCREMENT PRIMARY KEY,
     C16_USER_ID INT NOT NULL,
     C16_CENTER_ID INT NOT NULL,
     CONSTRAINT CK_T16_FK UNIQUE(C16_USER_ID, C16_CENTER_ID),
     CONSTRAINT FK_T16_USER FOREIGN KEY (C16_USER_ID) REFERENCES t14_user(C14_USER_ID),
     CONSTRAINT FK_T16_CENTER FOREIGN KEY (C16_CENTER_ID) REFERENCES t04_center(C04_CENTER_ID)
);

DROP TABLE IF EXISTS t17_student_schedule; -- n-n: 1 student học nhiều slot, 1 slot có nhiều student
CREATE TABLE t17_student_schedule (
     C17_STUDENT_SCHEDULE_ID INT AUTO_INCREMENT PRIMARY KEY,
     C17_USER_ID INT NOT NULL,
     C17_SCHEDULE_ID INT NOT NULL,
     CONSTRAINT CK_T17_FK UNIQUE(C17_USER_ID, C17_SCHEDULE_ID),
     CONSTRAINT FK_T17_USER FOREIGN KEY (C17_USER_ID) REFERENCES t14_user(C14_USER_ID),
     CONSTRAINT FK_T17_SCHEDULE FOREIGN KEY (C17_SCHEDULE_ID) REFERENCES t02_schedule(C02_SCHEDULE_ID)
);

SET FOREIGN_KEY_CHECKS = 1;