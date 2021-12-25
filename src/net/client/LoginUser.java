package net.client;

import java.io.Serializable;

/**
 * @Author: fujing
 * @Date: 2021/12/20
 * @Description:
 * @Version: 1.0
 */

/**
 * 对象要进行网络传输，必须要实现Serializable接口，标记它是一个可被序列化的对象
 */
public class LoginUser implements Serializable {

    //serialVersionUID 的作用：值是多少无所谓，是用来标记对象在序列化和反序列化的过程中，是同一个对象
    private static final long serialVersionUID = 182083278901876514L;

    private String name;
    private String passWord;

    public LoginUser() {
    }

    public LoginUser(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
