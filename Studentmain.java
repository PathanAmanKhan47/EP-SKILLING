package Stud.main;

import student.Bean.StudentBean;
import student.insert.StudentInsert;

public class Studentmain {
	public static void main(String[] args)
	{
		StudentBean sb = new StudentBean();
		sb.setRegno(275);
		sb.setName("AK");
		StudentInsert si = new StudentInsert();
		int i = si.StudentInsert(sb);
		if(i>0)
		{
			System.out.println("Insertion is successful");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
