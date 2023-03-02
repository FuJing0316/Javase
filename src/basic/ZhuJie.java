package basic;

/**
 * @Author: fujing
 * @Date: 2023/3/2
 * @Description: 这是一个文档注释
 * @Version: 1.0
 */
public class ZhuJie {
    public static void main(String[] args){
        int a = 0;
        String b = "";
        test1(a,b);
    }


    /**
     * 对一个方法的注释，使用文档注释
     * 一般文档注释可以配合jdk提供的工具Javadoc.exe来一起使用，通过Javadoc.exe可以对文档注释进行解析，生成一套以网页文件形式体现的该程序的说明文档（也就是自定义类对应的API文档）
     * @param a 参数a
     * @param b 参数b
     * @return a+b的和
     */
    private static String test1(int a, String b) {
        /*
        这是一个多行注释内容
        返回a+b
         */
        return a + b;
    }
}
