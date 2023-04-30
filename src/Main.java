//using System.Reflection
public class Main {
    public  static  void main(String[] args) {
        System.out.println("抽象工厂模式");

        // 1。创建抽象工厂（运用了多态）
        AbstractFactory factory = new AccessServerFactory();

        User user = new User();
        user.setId(100);
        user.setName("Jack");

        AbstractUser abUser = factory.createUser();
        abUser.insertUser(user);
        System.out.println(abUser.getUser(100));

    }
}
