public class Person {
    private String name;
    private Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void useMobile(String message){
        mobile.call(message);
    }
}
