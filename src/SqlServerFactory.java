public class SqlServerFactory implements  AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new SqlServerUser();
    }
}
