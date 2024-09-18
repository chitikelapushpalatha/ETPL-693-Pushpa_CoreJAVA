package com.evergent.corejava.studentapplication;



public class StudentService { 
		                           //100      corejava    250
		public int addStudentService(int StudentId,String name,float marks)
		{  
			String grade="";
		
		   if(marks<=30)
		   {
			   grade = "C";
		   }
		   else if(marks>30 && marks<70 )
		   {
			   grade = "B";
			   
		   }
		   else
		   {
			   grade = "A";
		   }
			
			
			StudentDAO StudentDAO = new StudentDAO();
			StudentBean StudentBean=new StudentBean();
			StudentBean.setStudentId(StudentId);	
			StudentBean.setName(name);
			StudentBean.setMarks(marks);
			StudentBean.setGrade(grade);
		
			   int updateResult=StudentDAO.addStudent(StudentBean);
			
			return 1;
		} 
	}


