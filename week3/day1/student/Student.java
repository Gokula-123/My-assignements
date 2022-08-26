package org.student;

import org.department.Department;

public class Student extends Department{
        public String StudentName(String s) {
        	System.out.println(s);
        	return s;
        }
        public String StudentDept(String s) {
        	System.out.println(s);
        	return s;
        }
        public int StudentId(int i) {
        	System.out.println(i);
        	return i;
        }
        
        public static void main(String[] args) {
			Student obj = new Student();
			obj.collegeName("ST.Josephs Institute of Technology");
			obj.collegeCode(387954);
			obj.CollegeRank(106);
			obj.DepartmentName("Engineering");
			obj.StudentName("Gokula");
			obj.StudentDept("EEE");
			obj.StudentId(516);
		}
}
