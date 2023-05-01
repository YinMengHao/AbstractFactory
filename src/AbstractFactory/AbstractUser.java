package AbstractFactory;

public interface AbstractUser {
    // 获取对应id的user
    User getUser(int id);

    // 向数据库插入user
    void insertUser(User user);

}
