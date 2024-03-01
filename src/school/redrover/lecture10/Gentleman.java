package school.redrover.lecture10;

public class Gentleman extends Person{

    private String address;
    public Gentleman(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }
    public Gentleman(String name) {
        this(name, 0);
    }
    public Gentleman() {
        this(null);
    }

    public Gentleman (String name, int age){
//        super(name, age);
        this(name, age, null);
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getName(){
        return "Mr. " + super.getName();
    }

    public void setGentleman(String name, int age, String address){
      setName(name);
      setAge(age);
      this.address = address;
    }
    public void setGentleman(String name, int age){
        this.setGentleman(name, age, null);
    }
    public void setGentleman(String name){
        this.setGentleman(name,0);
    }
}
