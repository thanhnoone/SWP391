
USE swp391_db_releasee;

INSERT INTO t05_role (C05_ROLE_ID, C05_ROLE_DESC) VALUES
(1, 'STUDENT'),
(2, 'PARENT'),
(3, 'TEACHER'),
(4, 'MANAGER'),
(5, 'ADMIN');


INSERT INTO t14_user (C14_USER_USERNAME, C14_USER_PASSWORD, C14_ACC_STATUS, C14_USER_CODE, C14_USER_NAME, C14_USER_PHONE, C14_USER_ADDRESS, C14_USER_DOB, C14_USER_GENDER, C14_USER_EMAIL, C14_ROLE_ID, C14_PARENT_ID) VALUES
('student_username_1', 'student_password_1', 1, 10001, 'Student 1', '123456789', '123 Street, City', '2000-01-01', 1, 'student1@example.com', 1, NULL),
('parent_username_1', 'parent_password_1', 1, 20001, 'Parent 1', '123456789', '123 Street, City', '1970-01-01', 0, 'parent1@example.com', 2, NULL),
('teacher_username_1', 'teacher_password_1', 1, 30001, 'Teacher 1', '123456789', '123 Street, City', '1980-01-01', 1, 'teacher1@example.com', 3, NULL),
('manager_username_1', 'manager_password_1', 1, 40001, 'Manager 1', '123456789', '123 Street, City', '1990-01-01', 1, 'manager1@example.com', 4, NULL),
('admin_username_1', 'admin_password_1', 1, 50001, 'Admin 1', '123456789', '123 Street, City', '1995-01-01', 1, 'admin1@example.com', 5, NULL),
('student_username_2', 'student_password_2', 1, 10002, 'Student 2', '123456789', '123 Street, City', '2000-01-01', 1, 'student2@example.com', 1, NULL),
('parent_username_2', 'parent_password_2', 1, 20002, 'Parent 2', '123456789', '123 Street, City', '1970-01-01', 0, 'parent2@example.com', 2, NULL),
('teacher_username_2', 'teacher_password_2', 1, 30002, 'Teacher 2', '123456789', '123 Street, City', '1980-01-01', 1, 'teacher2@example.com', 3, NULL),
('manager_username_2', 'manager_password_2', 1, 40002, 'Manager 2', '123456789', '123 Street, City', '1990-01-01', 1, 'manager2@example.com', 4, NULL),
('student_username_3', 'student_password_3', 1, 10004, 'Student 3', '123456789', '123 Street, City', '2000-01-01', 1, 'student4@example.com', 1, NULL),
('student_username_4', 'student_password_4', 1, 10003, 'Student 4', '123456789', '123 Street, City', '2000-01-01', 1, 'studentABC@example.com', 1, NULL),
('parent_username_3', 'parent_password_3', 1, 20003, 'Parent 3', '123456789', '123 Street, City', '1970-01-01', 0, 'parent3@example.com', 2, NULL),
('teacher_username_3', 'teacher_password_3', 1, 30003, 'Teacher 3', '123456789', '123 Street, City', '1980-01-01', 1, 'teacher3@example.com', 3, NULL),
('manager_username_3', 'manager_password_3', 1, 40003, 'Manager 3', '123456789', '123 Street, City', '1990-01-01', 1, 'manager3@example.com', 4, NULL),
('student_username_5', 'student_password_5', 1, 10236, 'Student 5', '123456789', '123 Street, City', '2000-01-01', 1, 'student5@example.com', 1, NULL),
('student_username_6', 'student_password_6', 1, 10234, 'Student 6', '123456789', '123 Street, City', '2000-01-01', 1, 'student6@example.com', 1, NULL),
('parent_username_4', 'parent_password_4', 1, 20004, 'Parent 4', '123456789', '123 Street, City', '1970-01-01', 0, 'parent4@example.com', 2, NULL),
('teacher_username_4', 'teacher_password_4', 1, 30004, 'Teacher 4', '123456789', '123 Street, City', '1980-01-01', 1, 'teacher4@example.com', 3, NULL),
('manager_username_4', 'manager_password_4', 1, 40004, 'Manager 4', '123456789', '123 Street, City', '1990-01-01', 1, 'manager4@example.com', 4, NULL),
('student_username_7', 'student_password_7', 1, 10007, 'Student 7', '123456789', '123 Street, City', '2000-01-01', 1, 'student7@example.com', 1, NULL),
('student_username_8', 'student_password_8', 1, 10008, 'Student 8', '123456789', '123 Street, City', '2000-01-01', 1, 'student8@example.com', 1, NULL),
('student_username_9', 'student_password_9', 1, 10009, 'Student 9', '123456789', '123 Street, City', '2000-01-01', 1, 'student9@example.com', 1, NULL),
('student_username_10', 'student_password_10', 1, 10010, 'Student 10', '123456789', '123 Street, City', '2000-01-01', 1, 'student10@example.com', 1, NULL),
('student_username_11', 'student_password_11', 1, 10011, 'Student 11', '123456789', '123 Street, City', '2000-01-01', 1, 'student11@example.com', 1, NULL),
('student_username_12', 'student_password_12', 1, 10012, 'Student 12', '123456789', '123 Street, City', '2000-01-01', 1, 'student12@example.com', 1, NULL),
('student_username_13', 'student_password_13', 1, 10013, 'Student 13', '123456789', '123 Street, City', '2000-01-01', 1, 'student13@example.com', 1, NULL),
('student_username_14', 'student_password_14', 1, 10014, 'Student 14', '123456789', '123 Street, City', '2000-01-01', 1, 'student14@example.com', 1, NULL),
('student_username_15', 'student_password_15', 1, 10015, 'Student 15', '123456789', '123 Street, City', '2000-01-01', 1, 'student15@example.com', 1, NULL),
('student_username_16', 'student_password_16', 1, 10016, 'Student 16', '123456789', '123 Street, City', '2000-01-01', 1, 'student16@example.com', 1, NULL),
('student_username_17', 'student_password_17', 1, 10017, 'Student 17', '123456789', '123 Street, City', '2000-01-01', 1, 'student17@example.com', 1, NULL),
('student_username_18', 'student_password_18', 1, 10018, 'Student 18', '123456789', '123 Street, City', '2000-01-01', 1, 'student18@example.com', 1, NULL),
('student_username_19', 'student_password_19', 1, 10019, 'Student 19', '123456789', '123 Street, City', '2000-01-01', 1, 'student19@example.com', 1, NULL),
('student_username_20', 'student_password_20', 1, 10020, 'Student 20', '123456789', '123 Street, City', '2000-01-01', 1, 'student20@example.com', 1, NULL),
('student_username_21', 'student_password_21', 1, 10021, 'Student 21', '123456789', '123 Street, City', '2000-01-01', 1, 'student21@example.com', 1, NULL);
SELECT * FROM t14_user;

INSERT INTO t13_subject (C13_SUBJECT_NAME, C13_SUBJECT_DESC) VALUES
('Subject 1', 'Description of Subject 1'),
('Subject 2', 'Description of Subject 2'),
('Subject 3', 'Description of Subject 3'),
('Subject 4', 'Description of Subject 4'),
('Subject 5', 'Description of Subject 5'),
('Subject 6', 'Description of Subject 6'),
('Subject 7', 'Description of Subject 7'),
('Subject 8', 'Description of Subject 8'),
('Subject 9', 'Description of Subject 9'),
('Subject 10', 'Description of Subject 10'),
('Subject 11', 'Description of Subject 11'),
('Subject 12', 'Description of Subject 12'),
('Subject 13', 'Description of Subject 13'),
('Subject 14', 'Description of Subject 14'),
('Subject 15', 'Description of Subject 15'),
('Subject 16', 'Description of Subject 16'),
('Subject 17', 'Description of Subject 17'),
('Subject 18', 'Description of Subject 18'),
('Subject 19', 'Description of Subject 19'),
('Subject 20', 'Description of Subject 20');


INSERT INTO t03_center (C03_CENTER_CODE, C03_CENTER_NAME, C03_CENTER_DESC, C03_CENTER_ADDRESS, C03_CENTER_PHONE, C03_CENTER_EMAIL, C03_CENTER_REGULATIONS, C03_IMAGE_PATH, C03_MANAGER_ID) VALUES
(1001, 'Center 1', 'Description of Center 1', '123 Street, City', '123456789', 'center1@example.com', 'Regulations of Center 1', 'path_to_image1', 4),
(1002, 'Center 2', 'Description of Center 2', '456 Street, City', '987654321', 'center2@example.com', 'Regulations of Center 2', 'path_to_image2', 4),
(1003, 'Center 3', 'Description of Center 3', '789 Street, City', '111223344', 'center3@example.com', 'Regulations of Center 3', 'path_to_image3', 4),
(1004, 'Center 4', 'Description of Center 4', '1011 Street, City', '998877665', 'center4@example.com', 'Regulations of Center 4', 'path_to_image4', 9),
(1005, 'Center 5', 'Description of Center 5', '1213 Street, City', '554433221', 'center5@example.com', 'Regulations of Center 5', 'path_to_image5', 9),
(1006, 'Center 6', 'Description of Center 6', '1415 Street, City', '667788990', 'center6@example.com', 'Regulations of Center 6', 'path_to_image6', 9),
(1007, 'Center 7', 'Description of Center 7', '1617 Street, City', '112233445', 'center7@example.com', 'Regulations of Center 7', 'path_to_image7', 9),
(1008, 'Center 8', 'Description of Center 8', '1819 Street, City', '998877665', 'center8@example.com', 'Regulations of Center 8', 'path_to_image8', 9),
(1009, 'Center 9', 'Description of Center 9', '2021 Street, City', '554433221', 'center9@example.com', 'Regulations of Center 9', 'path_to_image9', 9),
(1010, 'Center 10', 'Description of Center 10', '2223 Street, City', '667788990', 'center10@example.com', 'Regulations of Center 10', 'path_to_image10', 14),
(1011, 'Center 11', 'Description of Center 11', '2425 Street, City', '112233445', 'center11@example.com', 'Regulations of Center 11', 'path_to_image11', 14),
(1012, 'Center 12', 'Description of Center 12', '2627 Street, City', '998877665', 'center12@example.com', 'Regulations of Center 12', 'path_to_image12', 14),
(1013, 'Center 13', 'Description of Center 13', '2829 Street, City', '554433221', 'center13@example.com', 'Regulations of Center 13', 'path_to_image13', 14),
(1014, 'Center 14', 'Description of Center 14', '3031 Street, City', '667788990', 'center14@example.com', 'Regulations of Center 14', 'path_to_image14', 19),
(1015, 'Center 15', 'Description of Center 15', '3233 Street, City', '112233445', 'center15@example.com', 'Regulations of Center 15', 'path_to_image15', 19),
(1016, 'Center 16', 'Description of Center 16', '3435 Street, City', '998877665', 'center16@example.com', 'Regulations of Center 16', 'path_to_image16', 19),
(1017, 'Center 17', 'Description of Center 17', '3637 Street, City', '554433221', 'center17@example.com', 'Regulations of Center 17', 'path_to_image17', 19),
(1018, 'Center 18', 'Description of Center 18', '3839 Street, City', '667788990', 'center18@example.com', 'Regulations of Center 18', 'path_to_image18', 19),
(1019, 'Center 19', 'Description of Center 19', '4041 Street, City', '112233445', 'center19@example.com', 'Regulations of Center 19', 'path_to_image19', 19),
(1020, 'Center 20', 'Description of Center 20', '4243 Street, City', '998877665', 'center20@example.com', 'Regulations of Center 20', 'path_to_image20', 19);


INSERT INTO t01_course (C01_COURSE_NAME, C01_COURSE_CODE, C01_COURSE_DESC, C01_COURSE_START_DATE, C01_COURSE_END_DATE, C01_AMOUNT_OF_STUDENTS, C01_COURSE_FEE, C01_CENTER_ID, C01_SUBJECT_ID, C01_TEACHER_ID) VALUES
('Class 1', 1001, 'Description of Class 1', '2024-01-01', '2024-12-31', 20, 100.00, 1, 1, 3),
('Class 2', 1002, 'Description of Class 2', '2024-01-01', '2024-12-31', 20, 100.00, 1, 2, 8),
('Class 3', 1003, 'Description of Class 3', '2024-01-01', '2024-12-31', 20, 100.00, 1, 3, 13),
('Class 4', 1004, 'Description of Class 4', '2024-01-01', '2024-12-31', 20, 100.00, 2, 1, 18),
('Class 5', 1005, 'Description of Class 5', '2024-01-01', '2024-12-31', 20, 100.00, 2, 2, 3),
('Class 6', 1006, 'Description of Class 6', '2024-01-01', '2024-12-31', 20, 100.00, 2, 3, 8),
('Class 7', 1007, 'Description of Class 7', '2024-01-01', '2024-12-31', 20, 100.00, 3, 1, 13),
('Class 8', 1008, 'Description of Class 8', '2024-01-01', '2024-12-31', 20, 100.00, 3, 2, 18),
('Class 9', 1009, 'Description of Class 9', '2024-01-01', '2024-12-31', 20, 100.00, 3, 3, 3),
('Class 10', 1010, 'Description of Class 10', '2024-01-01', '2024-12-31', 20, 100.00, 4, 1, 8),
('Class 11', 1011, 'Description of Class 11', '2024-01-01', '2024-12-31', 20, 100.00, 4, 2, 13),
('Class 12', 1012, 'Description of Class 12', '2024-01-01', '2024-12-31', 20, 100.00, 4, 3, 18),
('Class 13', 1013, 'Description of Class 13', '2024-01-01', '2024-12-31', 20, 100.00, 5, 1, 3),
('Class 14', 1014, 'Description of Class 14', '2024-01-01', '2024-12-31', 20, 100.00, 5, 2, 8),
('Class 15', 1015, 'Description of Class 15', '2024-01-01', '2024-12-31', 20, 100.00, 5, 3, 13),
('Class 16', 1016, 'Description of Class 16', '2024-01-01', '2024-12-31', 20, 100.00, 6, 1, 18),
('Class 17', 1017, 'Description of Class 17', '2024-01-01', '2024-12-31', 20, 100.00, 6, 2, 3),
('Class 18', 1018, 'Description of Class 18', '2024-01-01', '2024-12-31', 20, 100.00, 6, 3, 8),
('Class 19', 1019, 'Description of Class 19', '2024-01-01', '2024-12-31', 20, 100.00, 7, 1, 13),
('Class 20', 1020, 'Description of Class 20', '2024-01-01', '2024-12-31', 20, 100.00, 7, 2, 18);


-- t18_room
INSERT INTO t18_room (C18_STATUS, C18_CENTER_ID) VALUES
(1, 1), (0, 2), (1, 3), (0, 4), (1, 5), (0, 6), (1, 7), (0, 8), (1, 9), (0, 10),
(1, 11), (0, 12), (1, 13), (0, 14), (1, 15), (0, 16), (1, 17), (0, 18), (1, 19), (0, 1),
(1, 2), (0, 3), (1, 4), (0, 5), (1, 6), (0, 7), (1, 8), (0, 9), (1, 10), (0, 11),
(1, 12), (0, 13), (1, 14), (0, 15), (1, 16), (0, 17), (1, 18), (0, 19), (1, 1), (0, 2);


-- t02_slot
INSERT INTO t02_slot (C02_SLOT_DATE, C02_SLOT_START_TIME, C02_SLOT_END_TIME, C02_COURSE_ID, C02_TEACHER_ID, C02_SUBJECT_ID, C02_ROOM_ID)
VALUES 
('2024-05-29', '08:00:00', '10:00:00', 1, 3, 1, 1),
('2024-05-29', '08:00:00', '10:00:00', 2, 8, 2, 2),
('2024-05-29', '10:30:00', '12:30:00', 3, 13, 3, 3),
('2024-05-29', '10:30:00', '12:30:00', 4, 18, 4, 4),
('2024-05-29', '14:00:00', '16:00:00', 5, 3, 5, 1),
('2024-05-29', '14:00:00', '16:00:00', 6, 8, 6, 2),
('2024-05-29', '16:30:00', '18:30:00', 7, 13, 7, 3),
('2024-05-29', '16:30:00', '18:30:00', 8, 18, 8, 4),
('2024-05-29', '08:00:00', '10:00:00', 9, 3, 9, 1),
('2024-05-29', '08:00:00', '10:00:00', 10, 8, 10, 2),
('2024-05-29', '10:30:00', '12:30:00', 11, 13, 11, 3),
('2024-05-29', '10:30:00', '12:30:00', 12, 18, 12, 4),
('2024-05-29', '14:00:00', '16:00:00', 13, 3, 13, 1),
('2024-05-29', '14:00:00', '16:00:00', 14, 8, 14, 2),
('2024-05-29', '16:30:00', '18:30:00', 15, 13, 15, 3),
('2024-05-29', '16:30:00', '18:30:00', 16, 18, 16, 4),
('2024-05-29', '08:00:00', '10:00:00', 17, 3, 17, 1),
('2024-05-29', '08:00:00', '10:00:00', 18, 8, 18, 2),
('2024-05-29', '10:30:00', '12:30:00', 19, 13, 19, 3);


-- t06_feedback
INSERT INTO t06_feedback (C06_FEEDBACK_DESC, C06_USER_ID, C06_SEND_TO)
VALUES 
('Feedback 1', 1, 'teacher1@example.com'), 
('Feedback 2', 6, 'teacher2@example.com'), 
('Feedback 3', 11, 'teacher3@example.com'), 
('Feedback 4', 18, 'student1@example.com'), 
('Feedback 5', 3, 'student2@example.com'), 
('Feedback 6', 8, 'student1@example.com'), 
('Feedback 7', 13, 'student3@example.com'), 
('Feedback 8', 18, 'student4@example.com'), 
('Feedback 9', 3, 'student3@example.com'), 
('Feedback 10', 8, 'student1@example.com'),
('Feedback 11', 16, 'teacher4@example.com'); 


-- t09_attendance
INSERT INTO t09_attendance (C09_ATTENDANCE_STATUS, C09_STUDENT_ID, C09_SLOT_ID) VALUES
(1, 1, 1), (1, 6, 2), (1, 11, 3), (1, 16, 4), (1, 1, 5), (1, 6, 6), (1, 11, 7), (1, 16, 8), (1, 1, 9), (1, 6, 10), 
(1, 11, 11), (1, 16, 12), (1, 1, 13), (1, 6, 14), (1, 11, 15), (1, 16, 16), (1, 1, 17), (1, 6, 18), (1, 11, 19),
(1, 10, 1), (1, 10, 2), (1, 10, 3), (1, 10, 4), (1, 10, 5), (1, 10, 6), (1, 10, 7), (1, 10, 8), (1, 10, 9), (1, 10, 10), 
(1, 10, 11), (1, 10, 12), (1, 10, 13), (1, 10, 14), (1, 10, 15), (1, 10, 16), (1, 10, 17), (1, 10, 18), (1, 10, 19), 
(1, 15, 1), (1, 15, 2), (1, 15, 3), (1, 15, 4), (1, 15, 5), (1, 15, 6), (1, 15, 7), (1, 15, 8), (1, 15, 9), (1, 15, 10), 
(1, 15, 11), (1, 15, 12), (1, 15, 13), (1, 15, 14), (1, 15, 15), (1, 15, 16), (1, 15, 17), (1, 15, 18), (1, 15, 19), 
(1, 20, 1), (1, 20, 2), (1, 20, 3), (1, 20, 4), (1, 20, 5), (1, 20, 6), (1, 20, 7), (1, 20, 8), (1, 20, 9), (1, 20, 10), 
(1, 20, 11), (1, 20, 12), (1, 20, 13), (1, 20, 14), (1, 20, 15), (1, 20, 16), (1, 20, 17), (1, 20, 18), (1, 20, 19), 
(1, 25, 1), (1, 25, 2), (1, 25, 3), (1, 25, 4), (1, 25, 5), (1, 25, 6), (1, 25, 7), (1, 25, 8), (1, 25, 9), (1, 25, 10), 
(1, 25, 11), (1, 25, 12), (1, 25, 13), (1, 25, 14), (1, 25, 15), (1, 25, 16), (1, 25, 17), (1, 25, 18), (1, 25, 19), 
(1, 30, 1), (1, 30, 2), (1, 30, 3), (1, 30, 4), (1, 30, 5), (1, 30, 6), (1, 30, 7), (1, 30, 8), (1, 30, 9), (1, 30, 10), 
(1, 30, 11), (1, 30, 12), (1, 30, 13), (1, 30, 14), (1, 30, 15), (1, 30, 16), (1, 30, 17), (1, 30, 18), (1, 30, 19);




-- t07_material
INSERT INTO t07_material (C07_MATERIALS_NAME, C07_TEACHER_ID, C07_SUBJECT_ID)
VALUES 
('Materials 1', 3, 1),
('Materials 2', 8, 2),
('Materials 3', 13, 3),
('Materials 4', 18, 4),
('Materials 5', 3, 5),
('Materials 6', 8, 6),
('Materials 7', 13, 7),
('Materials 8', 18, 8),
('Materials 9', 3, 9),
('Materials 10', 8, 10),
('Materials 11', 13, 11),
('Materials 12', 18, 12),
('Materials 13', 3, 13),
('Materials 14', 8, 14),
('Materials 15', 13, 15),
('Materials 16', 18, 16),
('Materials 17', 3, 17),
('Materials 18', 8, 18),
('Materials 19', 13, 19),
('Materials 20', 18, 20);



-- t10_result
INSERT INTO t10_result (C10_RESULT_TYPE, C10_RESULT_VAL, C10_STUDENT_ID, C10_COURSE_ID) VALUES
(1, 7, 1, 3), (1, 5, 6, 12), (1, 8, 11, 8), (1, 2, 16, 5), (1, 9, 1, 19), (1, 3, 6, 10),
(2, 6, 11, 15), (1, 4, 16, 2), (2, 10, 1, 17), (1, 1, 6, 4), (1, 8, 1, 7), (1, 3, 6, 14), (1, 5, 11, 3), 
(3, 6, 16, 18), (2, 2, 1, 10), (1, 4, 6, 5), (1, 9, 11, 19), (1, 7, 16, 12), (1, 10, 1, 2), (1, 1, 6, 15),
(2, 7, 10, 3), (1, 5, 10, 12), (1, 8, 10, 8), (1, 2, 10, 5), (1, 9, 10, 19), 
(2, 3, 15, 10), (3, 6, 15, 15), (2, 4, 15, 2), (1, 10, 15, 17), (1, 1, 15, 4),
(1, 8, 20, 7), (1, 3, 20, 14), (1, 5, 20, 3), (1, 6, 20, 18), (1, 2, 20, 10),
(2, 4, 25, 5), (2, 9, 25, 19), (2, 7, 25, 12), (1, 10, 25, 2), (1, 1, 25, 15),
(1, 7, 30, 1), (2, 5, 30, 6), (1, 8, 30, 11), (1, 2, 30, 16), (1, 9, 30, 1),
(1, 3, 31, 6), (1, 6, 31, 11), (1, 4, 31, 16), (1, 10, 31, 1), (1, 1, 31, 6);



INSERT INTO t11_manager_admin_media (C11_TITLE, C11_CONTENT, C11_TYPE, C11_MEDIA_STATUS, C11_PUBLISHED_DATE, C11_SEND_TO, C11_FILE_PATH, C11_ACTOR_ID)
VALUES
    ('Title 1', 'Content 1', 1, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 4),
    ('Title 2', 'Content 2', 1, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 9),
    ('Title 3', 'Content 3', 0, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Title 4', 'Content 4', 1, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 14),
    ('Title 5', 'Content 5', 0, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Title 6', 'Content 6', 1, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 19),
    ('Title 7', 'Content 7', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Title 8', 'Content 8', 0, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Title 9', 'Content 9', 1, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 4),
    ('Title 10', 'Content 10', 0, DEFAULT, CURRENT_DATE(), 'admin1@example.com', NULL, 9),
    ('Another Title', 'Another Content', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Another Title 2', 'Another Content 2', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Another Title 3', 'Another Content 3', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Another Title 4', 'Another Content 4', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5),
    ('Another Title 5', 'Another Content 5', 1, DEFAULT, CURRENT_DATE(), 'All', NULL, 5);


-- Chèn lại dữ liệu với student id là 31, 32, 33, hoặc 34 (lựa chọn thủ công)
INSERT INTO t15_enrollment (C15_STUDENT_ID, C15_COURSE_ID) VALUES
(1, 5),(6, 8),(11, 15),(16, 3),(1, 10),(6, 18),(11, 2),(16, 7),(1, 13),(6, 1),
(11, 14),(16, 6),(1, 9),(6, 12),(11, 19),(16, 4),(1, 17),(6, 11),(11, 20),(16, 16),
(10, 1), (10, 2), (10, 3), (10, 4), (10, 5), (10, 6), (10, 7), (10, 8), (10, 9), (10, 10), (10, 11), (10, 12), (10, 13), (10, 14), (10, 15), (10, 16), (10, 17), (10, 18), (10, 19),
(15, 1), (15, 2), (15, 3), (15, 4), (15, 5), (15, 6), (15, 7), (15, 8), (15, 9), (15, 10), (15, 11), (15, 12), (15, 13), (15, 14), (15, 15), (15, 16), (15, 17), (15, 18), (15, 19),
(20, 1), (20, 2), (20, 3), (20, 4), (20, 5), (20, 6), (20, 7), (20, 8), (20, 9), (20, 10), (20, 11), (20, 12), (20, 13), (20, 14), (20, 15), (20, 16), (20, 17), (20, 18), (20, 19),
(25, 1), (25, 2), (25, 3), (25, 4), (25, 5), (25, 6), (25, 7), (25, 8), (25, 9), (25, 10), (25, 11), (25, 12), (25, 13), (25, 14), (25, 15), (25, 16), (25, 17), (25, 18), (25, 19),
(30, 1), (30, 2), (30, 3), (30, 4), (30, 5), (30, 6), (30, 7), (30, 8), (30, 9), (30, 10), (30, 11), (30, 12), (30, 13), (30, 14), (30, 15), (30, 16), (30, 17), (30, 18), (30, 19),
(31, 1), (31, 2), (31, 3), (31, 4), (31, 5), (31, 6), (31, 7), (31, 8), (31, 9), (31, 10), (31, 11), (31, 12), (31, 13), (31, 14), (31, 15), (31, 16), (31, 17), (31, 18), (31, 19),
(32, 1), (32, 2), (32, 3), (32, 4), (32, 5), (32, 6), (32, 7), (32, 8), (32, 9), (32, 10), (32, 11), (32, 12), (32, 13), (32, 14), (32, 15), (32, 16), (32, 17), (32, 18), (32, 19),
(33, 1), (33, 2), (33, 3), (33, 4), (33, 5), (33, 6), (33, 7), (33, 8), (33, 9), (33, 10), (33, 11), (33, 12), (33, 13), (33, 14), (33, 15), (33, 16), (33, 17), (33, 18), (33, 19),
(34, 1), (34, 2), (34, 3), (34, 4), (34, 5), (34, 6), (34, 7), (34, 8), (34, 9), (34, 10), (34, 11), (34, 12), (34, 13);




INSERT INTO t16_user_center (C16_USER_ID, C16_CENTER_ID) VALUES
    (1, 5),
    (6, 8),
    (11, 15),
    (16, 3),
    (3, 10),
    (8, 18),
    (13, 2),
    (18, 7),
    (1, 13),
    (6, 1),
    (11, 14),
    (16, 6),
    (3, 9),
    (8, 12),
    (13, 19),
    (18, 4),
    (1, 17),
    (6, 11),
    (11, 20),
    (16, 16);


INSERT INTO t17_student_slot (C17_STUDENT_ID, C17_SLOT_ID) VALUES
    (1, 5),
    (6, 8),
    (11, 15),
    (16, 3),
    (1, 10),
    (6, 18),
    (11, 2),
    (16, 7),
    (1, 13),
    (6, 1),
    (11, 14),
    (16, 6),
    (1, 9),
    (6, 12),
    (11, 3),
    (16, 4),
    (1, 17),
    (6, 11),
    (11, 19),
    (16, 16);

SET FOREIGN_KEY_CHECKS =1;