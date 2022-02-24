package basic;

public class regexTest {
    public static void main(String[] args) {

//        String str = "0.001";
        String str = "789.01";

//        String regex = "^(-(([0-9]+\\\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";//负负点数
//        String regex2 = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)|0)$";//正浮点数
//        String regex3 = "^(-([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)|0)$";//负负点数
        String regex4 = "^\\-?([1-9]\\d*|0)(\\.\\d{0,2})?$";//正负两位小数

//        System.out.println(str.matches(regex));
//        System.out.println(str.matches(regex2));
        System.out.println(str.matches(regex4));
    }


}
