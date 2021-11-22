package thread.proxy;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description: 法庭审判时
 * @Version: 1.0
 */
public class Court {
    public static void main(String[] args) {
//        Lawyer lawyer = new Lawyer();
//        lawyer.appeal();
//        lawyer.proof();

        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer(employee);
        lawyer.appeal();
        lawyer.proof();


    }


}
