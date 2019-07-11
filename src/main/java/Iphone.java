public class Iphone extends Mobile{
    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void call(String message){
        if(message.length()>=20){
            System.out.println("<iPhone> Message cannot be sent");
        }else {
            System.out.println("<iPhone>Message : " + message);
        }
    }
}
