public class Mobile {
    /**
     * the mobile name
     */
    private String name;
    /**
     * the mobile color
     */
    private String color;
    /**
     * the mobile brand
     */
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message){
        System.out.println("Message : "+message);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


}
