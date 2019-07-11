public class IPhoneRobot {

    private IPhone iPhone;
    public IPhoneRobot(IPhone iPhone) {
        this.iPhone = iPhone;
    }
    public void useMobile(String message){
        iPhone.call(message);
    }
}
