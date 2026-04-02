CREATE TABLE Students (
        StudentID INT AUTO_INCREMENT PRIMARY KEY,
        FirstName VARCHAR(50),
        LastName VARCHAR(50),
        Age INT,
        GPA DECIMAL(3, 2)
        );
        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('John', 'Doe', 20, 3.5);

        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('Jane', 'Smith', 22, 3.9);

        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('Bob', 'Johnson', 19, 3.2);
        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('Zenith', 'Academy', 15, 3.8);
        SELECT * FROM Students;
        SELECT FirstName, LastName FROM Students WHERE GPA > 3.5;

        SELECT AVG(Age) AS AverageAge FROM Students;
        SELECT studentID, FirstName, Age FROM Students WHERE GPA < 3.5;

        UPDATE Students
        SET GPA = 3.8
        WHERE StudentID = 1;

        DELETE FROM Students
        WHERE StudentID = 2;

        SELECT * FROM Students;

        CREATE TABLE Courses (
        CourseID INT AUTO_INCREMENT PRIMARY KEY,
        CourseName VARCHAR(100)
        );
        INSERT INTO Courses (CourseName)
        VALUES ('Fund of IT');

        INSERT INTO Courses (CourseName)
        VALUES ('Fund of Web Dev');
        SELECT * FROM Courses;

        CREATE TABLE Enrollments (
        EnrollmentID INT AUTO_INCREMENT PRIMARY KEY,
        StudentID INT,
        CourseID INT,
        FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
        FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
        );
        INSERT INTO Enrollments (StudentID, CourseID)
        VALUES (1, 1);
        SELECT Students.FirstName, Students.LastName
        FROM Students
        JOIN Enrollments ON Students.StudentID = Enrollments.StudentID
        WHERE Enrollments.CourseID = 1;

        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('Mia', 'Ross', 23, 3.8);

        INSERT INTO Students (FirstName, LastName, Age, GPA)
        VALUES ('Sumiko', 'Noda', 18, 3.5);

        SELECT * FROM Students;

        INSERT INTO Enrollments (StudentID, CourseID)
        VALUES (6, 2);
        INSERT INTO Enrollments (StudentID, CourseID)
        VALUES (1, 2);
        INSERT INTO Enrollments (StudentID, CourseID)
        VALUES (4, 2);

        SELECT Students.FirstName, Students.LastName
        FROM Students
        JOIN Enrollments ON Students.StudentID = Enrollments.StudentID
        WHERE Enrollments.CourseID = 2;

