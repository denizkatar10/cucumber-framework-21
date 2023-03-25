package database_stepdefinitions;
import io.cucumber.java.en.Given;
import utilities.DBUtils;
import utilities.Driver;
import java.sql.*;
public class Read_Step_Defs {
    @Given("user connects to the database")
    public void user_connects_to_the_database() {
//        Call teh appropriate method form DBUtils to connect to the database
        DBUtils.createConnection();
    }
    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) {
//        String query = "Select Price from tHOTELROOM"; //Price= column, tHOTELROOM=table  name
        String query=   "Select "+column+" from "+table;
//        RUN THAT QUERY USING executeQuery from DBUtils
        DBUtils.executeQuery(query);

//        NOW DRIVER IS ON THE PRICE COLUMN ON HOTEL TABLE
    }
    @Given("user reads all rows in the {string} column")
    public void user_reads_all_rows_in_the_column(String column) throws SQLException {
//      We will use Result set to do actions
//        resultSet.next() -> takes us to the next row
//        resultSet -> DBUtils.getResultset()

//        Go to the next row
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();//on the 3rd row

        DBUtils.getResultset().absolute(4);//Takes me to 4th row

        Object fourthColumnObject=DBUtils.getResultset().getObject(column);//Getting 4th column data on "Price" column
        System.out.println(fourthColumnObject);

    }
}