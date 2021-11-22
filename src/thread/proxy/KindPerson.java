package thread.proxy;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description: 此接口代表具有 申述、举证能力的一类人（比如律师、被告Boss）
 * @Version: 1.0
 */
public interface KindPerson {

    //申述
    void appeal();

    //举证
    void proof();
}
