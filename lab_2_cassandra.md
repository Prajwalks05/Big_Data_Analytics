### Cassandra Commands executed in Lab-2
```
CREATE KEYSPACE Employee
WITH replication = {
'class': 'SimpleStrategy',
'replication_factor': 1
};
```
### describe the elements
```
DESCRIBE KEYSPACES;
```
### switch db
```
USE Employee;
```

### Create table employee info
```
CREATE TABLE Employee_Info (
Emp_Id INT PRIMARY KEY,
Emp_Name TEXT,
Designation TEXT,
Date_of_Joining DATE,
Salary FLOAT,
Dept_Name TEXT
);
```

### Describe the table
```
DESCRIBE TABLE Employee_Info;
#####################Output############################
CREATE TABLE employee1.employee_info (
    emp_id int PRIMARY KEY,
    date_of_joining date,
    dept_name text,
    designation text,
    emp_name text,
    salary float
) WITH additional_write_policy = '99p'
    AND bloom_filter_fp_chance = 0.01
    AND caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    AND cdc = false
    AND comment = ''
    AND compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold': '32', 'min_threshold': '4'}
    AND compression = {'chunk_length_in_kb': '16', 'class': 'org.apache.cassandra.io.compress.LZ4Compressor'}
    AND crc_check_chance = 1.0
    AND default_time_to_live = 0
    AND extensions = {}
    AND gc_grace_seconds = 864000
    AND max_index_interval = 2048
    AND memtable_flush_period_in_ms = 0
    AND min_index_interval = 128
    AND read_repair = 'BLOCKING'
    AND speculative_retry = '99p';
```

### Batch insertion of values
```
BEGIN BATCH
INSERT INTO Employee_Info (Emp_Id, Emp_Name, Designation, Date_of_Joining, Salary,
Dept_Name)
VALUES (120, 'Priyanka GH', 'Developer', '2024-05-06', 100000, 'Engineering');
INSERT INTO Employee_Info (Emp_Id, Emp_Name, Designation, Date_of_Joining, Salary,
Dept_Name)
VALUES (121, 'Shreya', 'Developer', '2024-05-06', 90000, 'Management');
INSERT INTO Employee_Info (Emp_Id, Emp_Name, Designation, Date_of_Joining, Salary,
Dept_Name)
VALUES (122, 'Sadhana', 'Engineer', '2024-05-07', 120000, 'Engineering');
APPLY BATCH;


########################### Output ##############################
qlsh:employee1> select * from Employee_Info;

 emp_id | date_of_joining | dept_name   | designation | emp_name    | salary
--------+-----------------+-------------+-------------+-------------+---------
    120 |      2024-05-06 | Engineering |   Developer | Priyanka GH |   1e+05
    122 |      2024-05-07 | Engineering |    Engineer |     Sadhana | 1.2e+05
    121 |      2024-05-06 |  Management |   Developer |      Shreya |   90000

(3 rows)
```
### (d) Update Employee Name & Department of Emp-Id 121
```
UPDATE Employee_Info
SET Emp_Name = 'Rachana', Dept_Name = 'HR'
WHERE Emp_Id = 121;
################################# Output #######################################
cqlsh:employee1> select * from Employee_Info;

 emp_id | date_of_joining | dept_name   | designation | emp_name    | salary
--------+-----------------+-------------+-------------+-------------+---------
    120 |      2024-05-06 | Engineering |   Developer | Priyanka GH |   1e+05
    122 |      2024-05-07 | Engineering |    Engineer |     Sadhana | 1.2e+05
    121 |      2024-05-06 |          HR |   Developer |     Rachana |   90000

(3 rows)
```

### (e) Sort Employee Records Based on Salary
```
SELECT * FROM Employee_Info
ALLOW FILTERING;
##################### Output ################################
cqlsh:employee1> select * from Employee_Info allow filtering;

 emp_id | date_of_joining | dept_name   | designation | emp_name    | salary
--------+-----------------+-------------+-------------+-------------+---------
    120 |      2024-05-06 | Engineering |   Developer | Priyanka GH |   1e+05
    122 |      2024-05-07 | Engineering |    Engineer |     Sadhana | 1.2e+05
    121 |      2024-05-06 |          HR |   Developer |     Rachana |   90000

(3 rows)
```

### (f) Alter Table to Add Projects (SET type)
```
ALTER TABLE Employee_Info
ADD Projects SET<TEXT>;


UPDATE Employee_Info
SET Projects = {'Project A', 'Project B'}
WHERE Emp_Id = 120;
UPDATE Employee_Info
SET Projects = {'Project C'}
WHERE Emp_Id = 121;
UPDATE Employee_Info
SET Projects = {'Project A', 'Project D'}
WHERE Emp_Id = 122;


SELECT Emp_Id, Emp_Name, Projects FROM Employee_Info;

####################################### Output ########################################
cqlsh:employee1> select Emp_Id,Emp_Name,Projects from Employee_Info;

 emp_id | emp_name    | projects
--------+-------------+----------------------------
    120 | Priyanka GH | {'Project A', 'Project B'}
    122 |     Sadhana | {'Project A', 'Project D'}
    121 |     Rachana |              {'Project C'}

(3 rows)
```
### (h) Create TTL of 15 Seconds to Display Values
```
cqlsh:employee1> UPDATE Employee_Info
             ... USING TTL 15
             ... SET Salary = 0
             ... WHERE Emp_Id = 121;
cqlsh:employee1> SELECT * FROM Employee_Info;

 emp_id | date_of_joining | dept_name   | designation | emp_name    | projects                   | salary
--------+-----------------+-------------+-------------+-------------+----------------------------+---------
    120 |      2024-05-06 | Engineering |   Developer | Priyanka GH | {'Project A', 'Project B'} |   1e+05
    122 |      2024-05-07 | Engineering |    Engineer |     Sadhana | {'Project A', 'Project D'} | 1.2e+05
    121 |      2024-05-06 |          HR |   Developer |     Rachana |              {'Project C'} |       0

(3 rows)
cqlsh:employee1> SELECT * FROM Employee_Info;

 emp_id | date_of_joining | dept_name   | designation | emp_name    | projects                   | salary
--------+-----------------+-------------+-------------+-------------+----------------------------+---------
    120 |      2024-05-06 | Engineering |   Developer | Priyanka GH | {'Project A', 'Project B'} |   1e+05
    122 |      2024-05-07 | Engineering |    Engineer |     Sadhana | {'Project A', 'Project D'} | 1.2e+05
    121 |      2024-05-06 |          HR |   Developer |     Rachana |              {'Project C'} |    null

(3 rows)
```































