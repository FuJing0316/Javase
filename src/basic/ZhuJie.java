package basic;

/**
 * @Author: fujing
 * @Date: 2023/3/2
 * @Description: ����һ���ĵ�ע��
 * @Version: 1.0
 */
public class ZhuJie {
    public static void main(String[] args){
        int a = 0;
        String b = "";
        test1(a,b);
    }


    /**
     * ��һ��������ע�ͣ�ʹ���ĵ�ע��
     * һ���ĵ�ע�Ϳ������jdk�ṩ�Ĺ���Javadoc.exe��һ��ʹ�ã�ͨ��Javadoc.exe���Զ��ĵ�ע�ͽ��н���������һ������ҳ�ļ���ʽ���ֵĸó����˵���ĵ���Ҳ�����Զ������Ӧ��API�ĵ���
     * @param a ����a
     * @param b ����b
     * @return a+b�ĺ�
     */
    private static String test1(int a, String b) {
        /*
        ����һ������ע������
        ����a+b
         */
        return a + b;
    }
}
