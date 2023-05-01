package AbstractFactory;

public class User {
    // 用户id
    private int _id;
    public int getId() {
        return _id;
    }
    public void setId(int id) {
        this._id = id;
    }

    // 用户名字
    private String _name;
    public String getName() {
        return _name;
    }
    public void setName(String name) {
        this._name = name;
    }

}
