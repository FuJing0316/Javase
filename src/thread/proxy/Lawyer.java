package thread.proxy;

/**
 * @Author: fujing
 * @Date: 2021/11/22
 * @Description:  代理人：律师
 * @Version: 1.0
 */
public class Lawyer implements KindPerson {

    KindPerson kindPerson;


    public Lawyer(){
        this.kindPerson = new Boss(); //只代理 被告Boss
    }

    public Lawyer(KindPerson kindPerson){
        this.kindPerson = kindPerson; //可以代理任何有 申述、举证能力的一类人
    }


    @Override
    public void appeal() {
        this.kindPerson.appeal();
    }

    @Override
    public void proof() {
        this.kindPerson.proof();
    }
}
