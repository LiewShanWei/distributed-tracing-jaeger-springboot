package tap.tracing.applicationa;

public class App {
    private String id;
    private String name;
    private int age;
    private boolean isUp;

    public App(){}
    public App(String id){
        this.id= id;
        this.name= "Application A";
        this.age = 1;
        this.isUp = true;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setUp(boolean isUp){
        this.isUp = isUp;
    }

    public boolean getUp(){
        return this.isUp;
    }
}
