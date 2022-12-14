<h1>Domain Description</h1>
<p>In an educational  Institute there are several courses running parallel  every day. For every course there are several batches at same/different time. Every course has a session wise/day wise schedule. It will be difficult for the Faculty Head to know the status of every batch i.e what is the session taught at each day in a batch.
So the Automated Course Monitoring System will keep the records of all the courses,batches,faculties and the daywise update for every batch. It will also help the Faculty Head to maintain the course plan .</p>

<h1>Types of users</h1>
•	Administrator.
<br>
•	Faculty
<br>
<h1>Role of Administrator</h1>
•	Login to his account
<br>
•	 Create, Update, View Course.
<br>
•	Create, Update, View Batch. A batch is related to a course. 
<br>
•	Create, Update, View Faculty.
<br>
•	Allocate faculty to a batch.
<br>
•	Create, Update, View Course plan.
<br>
•	View the Day wise update of every batch.
<br>
•	 Generate Report for every batch.
<br>

<h1>Role of Faculty</h1>
•	Login to his/her account
<br>
•	View the Course Plan
<br>
•	Fill up the day wise planner.
<br>
•	Update his/her password.
<br>

<h1>Tables</h1>
<h1>Admin</h1>
<br>
•	username
<br>
•	password:
<br>

<h1>Faculty</h1>
<br>
•	facultyid
<br>
•	facultyname
<br>
•	facultyaddress
<br>
•	mobile
<br>
•	email 
<br>
•	username
<br>
•	password
<br>
<h1>Course</h1>
<br>
•	coursed
<br>
•	courseName
<br>
•	fee
<br>
•	courseDescription
<br>
<h1>Batch</h1>
•	batchId
<br>
•	courseId
<br>
•	facultyId
<br>
•	numberofStudents
<br>
•	batchstartDate
<br>
•	duration 
<br>

<h1>CoursPlan</h1>
•	planId
<br>
•	batchId
<br>
•	daynumber
<br>
•	topic
<br>
•	status: completed/pending

