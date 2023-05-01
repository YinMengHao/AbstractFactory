package AbstractFactory;

public class SqlServerUser implements  AbstractUser {

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中获取到ID的user");
        return null;
    }

    @Override
    public void insertUser(User user) {
        System.out.println("在SQL Server中插入了User");
    }
}
