package student.insert;

import java.sql.Connection;
import java.sql.SQLException;

import student.Bean.StudentBean;
import student.Connections.DBUtil;

public class StudentInsert {
	int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtil.DBConnection();
		return 0;
	}

}
