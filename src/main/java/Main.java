public class Main {
    public static void main(String args[]){
        Mobile mobile= new Mobile("mo","red","hao");
        mobile.call("mobile");
        System.out.println(mobile.toString());
        Iphone iphone = new Iphone("iphone","blue","jenkins");
        iphone.call("iphone");
        Andriod andriod=new Andriod("andriod","black","xiaomi");
        andriod.call("andriod");

        Person person =new Person(iphone);
        person.useMobile("message111111111111111111111111111111");
    }
}
