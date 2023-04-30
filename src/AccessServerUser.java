public class AccessServerUser implements AbstractUser {
    @Override
    public User getUser(int id) {
        System.out.println("在Access Server中获取到ID的user");
        return null;
    }

    @Override
    public void insertUser(User user) {
        System.out.println("在Access Server中插入了User");
    }
}
