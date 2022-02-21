package oop1.one;

/**
 * @Author: fujing
 * @Date: 2022/2/21
 * @Description:
 * @Version: 1.0
 */
public class Admin {
    private String name;

    private String pwd;

    public Admin(){
    }

    public Admin(String name,String pwd){
        this.name = name;
        this.pwd = pwd;
    }

    public Admin(String name){
        this.name = "lucy";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
