DROP DATABASE IF EXISTS finalexam;
CREATE DATABASE finalexam;

USE finalexam;
DROP TABLE IF EXISTS ExperienceCandidate;
CREATE TABLE ExperienceCandidate(
	id		TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	Fullname VARCHAR(50) NOT NULL,
	Phone VARCHAR(12) NOT NULL,
	Email VARCHAR(50) NOT NULL,
	`Password` VARCHAR(50) NOT NULL,
    ExpInYear INT NOT NULL,
    ProSkill VARCHAR(30) NOT NULL
);
DROP TABLE IF EXISTS FresherCandidate;
CREATE TABLE FresherCandidate(
	id		TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
	Fullname VARCHAR(50) NOT NULL,
	Phone VARCHAR(12) NOT NULL,
	Email VARCHAR(50) NOT NULL,
	`Password` VARCHAR(50) NOT NULL,
    GraduationRank VARCHAR(50) NOT NULL
);

INSERT INTO ExperienceCandidate(Fullname,Phone, Email,`Password`,ExpInYear,ProSkill) 
	VALUES	(N'Nguyễn Hoàng Giang','0359934748','thienmocki@gmail.com', 'giang2000',1,'Java'),
			(N'Nguyễn Hoàng Giang1','0359934749','thienmocki1@gmail.com', 'giang2000',2,'Python'),
			(N'Nguyễn Hoàng Giang2','0359934750','thienmocki2@gmail.com', 'giang2000',3,'HTML')
;
INSERT INTO FresherCandidate(Fullname,Phone, Email,`Password`,GraduationRank) 
	VALUES	(N'Nguyễn Hoàng Giang3','0359934751','thienmocki3@gmail.com', 'giang2000','EXCELLENCE'),
			(N'Nguyễn Hoàng Giang4','0359934752','thienmocki4@gmail.com', 'giang2000','GOOD'),
			(N'Nguyễn Hoàng Giang5','0359934753','thienmocki5@gmail.com', 'giang2000','FAIR'),
            (N'Nguyễn Hoàng Giang6','0359934754','thienmocki6@gmail.com', 'giang2000','POOR')
;
