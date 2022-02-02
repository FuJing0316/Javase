package basic.excise;

/**
 * @Author: fujing
 * @Date: 2022/2/2
 * @Description:
 * @Version: 1.0
 */
public class SelfAddDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
//            int k = ++i; //i先自增，然后再赋值给k，所以每轮循环进来执行完此句，k值等于i自增之后的值
            int k = i++; //先将i赋值给k，然后i再自增1，所以每次循环进来执行完此句时， k比i 都小1
            while (k < 5) {
                System.out.print(i); //++i输出13； i++输出的是135
                break;
            }
        }

    }

}
