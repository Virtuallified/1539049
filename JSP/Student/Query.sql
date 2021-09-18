/*SQL Queries to perform before execution of JSP*/

/*Create Table*/
CREATE TABLE department (Dept_id varchar2(10), Dept_Name varchar2(50) NOT NULL, CONSTRAINT pk_did PRIMARY KEY (Dept_id));
CREATE TABLE students (Roll number(10) NOT NULL, Name varchar2(50) NOT NULL, Dept_id varchar2(10) NOT NULL, CONSTRAINT pk_Roll PRIMARY KEY (Roll), CONSTRAINT fk_did FOREIGN KEY (Dept_id) REFERENCES department (Dept_id));
CREATE TABLE course (Roll number(10), Cor_id varchar2(10), Cor_Title varchar2(50) NOT NULL, credit varchar2(10), grade varchar2(10), CONSTRAINT fk_roll FOREIGN KEY (roll) REFERENCES students (roll));
/*Structure of Table*/
DESC department;
DESC students;
DESC course;
/*Drop a Table*/
DROP TABLE course;
DROP TABLE students;
DROP TABLE department;
/*Insert Data into Table */
INSERT INTO students VALUES ('101', 'Pulok Mondol', 'SCA01');
INSERT INTO department VALUES('SCA01','SCA');
INSERT INTO course VALUES('101','MCA401','EC','0','A');
/*Show a Table*/
SELECT * FROM students;
SELECT * FROM department;
SELECT * FROM course;