package DataAccess;

import AbstractFactory.AbstractUser;
import AbstractFactory.AccessServerUser;
import AbstractFactory.SqlServerUser;

public class DataAccess {
    private static String db = "Sqlserver";
//    private static String db = "Access";

    public static AbstractUser CreateUser() {
        AbstractUser result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlServerUser();
                break;
            case "Access":
                result = new AccessServerUser();
                break;
        }
        return result;
    }

    public static AbstractDepartment CreateDepartment() {
        AbstractDepartment result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
