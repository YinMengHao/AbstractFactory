public class AccessServerFactory implements  AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new AccessServerUser();
    }
}
