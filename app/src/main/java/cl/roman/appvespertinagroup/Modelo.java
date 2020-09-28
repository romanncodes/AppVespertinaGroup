package cl.roman.appvespertinagroup;

public class Modelo {
    public String name;
    public String lastName;
    public int age;
    public String address;

    public Modelo(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static String getConfig(){
        return "CONFIG";
    }

    public static String getInformation(){return "ok";}
}

