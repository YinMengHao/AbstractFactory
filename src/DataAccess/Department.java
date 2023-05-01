package DataAccess;

public class Department {
    private  int _id;
    public int getId() {
        return _id;
    }
    public void setId(int id) {
        this._id = id;
    }

    private String _deptName;
    public String getDeptName() {
        return _deptName;
    }
    public void setDeptName(String deptName) {
        this._deptName = deptName;
    }
}
