USE swp391_db_releasee;
SET FOREIGN_KEY_CHECKS = 0;

truncate table t01_course;
truncate table t02_slot;
truncate table t03_center;
truncate table t05_role;
truncate table t06_feedback;
truncate table t07_material;
truncate table t08_image_avt;
truncate table t09_attendance;
truncate table t10_result;
truncate table t11_manager_admin_media;
truncate table t13_subject;
truncate table t14_user;
truncate table t15_enrollment;
truncate table t16_user_center;
truncate table t17_student_slot;

delete from t01_class;
delete from t02_schedule;
delete from  t03_teacher;
delete from t04_center;
delete from t05_manager;
delete from t06_role;
delete from t07_feedback;
delete from t08_material;
delete from t09_image_avt;
delete from t10_attendance;
delete from t11_result;
delete from t12_post;
delete from t13_subject;
delete from t14_user;
delete from t15_enrollment;
delete from t16_user_center;
delete from t17_student_schedule;



SET FOREIGN_KEY_CHECKS = 1;