package practice7.lib;

import java.sql.ResultSet;

public class StudentExecution {

    public static void main(String[] args) {
        String query = "select * from students";

        try {
            ResultSet resultSet= DBUtils.getTableByQuery(query);
            while (resultSet.next()){
                Student student = new Student();
                student.getId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setLocation(resultSet.getString("location"));
            }

        } catch (Exception e) {
            System.out.println("there was an exception. Please review: ");
            e.printStackTrace();

        }finally {
            DBUtils.cleanupDatabases();
        }
    }
}
