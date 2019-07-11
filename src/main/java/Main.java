public class Main {
    public static void main(String args[]){
        Mobile mobile= new Mobile("mo","red","hao");
        mobile.call("mobile");
        System.out.println(mobile.toString());
        IPhone iphone = new IPhone("iphone","blue","jenkins");
        iphone.call("iphone");
        Andriod andriod=new Andriod("andriod","black","xiaomi");
        andriod.call("andriod");

        Person person =new Person(iphone);
        person.useMobile("iphone");

        IPhoneRobot iPhoneRobot =new IPhoneRobot(iphone);
        iPhoneRobot.useMobile("iPhoneRobot");
    }
}
