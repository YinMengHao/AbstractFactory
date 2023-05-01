package AbstractFactory;//using System.Reflection

import DataAccess.DataAccess;
import DataAccess.*;

import javax.xml.crypto.Data;

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

        // 抽象工厂模式的不足：
        /**
         * 难以扩展新的产品
         * */


        // DataAccess: 工厂类
        User user1 = new User();
        Department dept = new Department();

        AbstractUser user2 = DataAccess.CreateUser();
        user2.insertUser(user1);
        user2.getUser(100);

        AbstractDepartment department = DataAccess.CreateDepartment();
        department.insert(dept);
        department.getDepartment(100);
    }
}
