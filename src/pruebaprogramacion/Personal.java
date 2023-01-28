package pruebaprogramacion;

public class Personal {
    public static void main(String[] args) {

        // Corp Information
        String corporation = comCorp();
        System.out.println(corporation);
        since(2023);

        // Personal Information
        perName("Alejandro");
        perLastName("Fernandez");
        perYear(28);
        perPhone(155555555);
        perAddress("P.sherman calle wallaby 42 sydney");
        perInsta("@ale.jsk");
        perFacebook("fb.com/alejandro.jsk.fernandez");
    }
    public static int since(Integer number){
        System.out.println("SINCE - " + number);
        return number;
    }
    public static String comCorp(){
        return "------------------------- \nProgramacion Java Basico\n -------------------------";
    }
    public static String perName(String name){
        System.out.println("Name: " + name);
        return name;
    }
    public static String perLastName(String name){
        System.out.println("Last Name: " + name);
        return name;
    }
    public static int perYear(Integer number){
        System.out.println("Year: " + number);
        return number;
    }
    private static int perPhone(Integer number){
        System.out.println("Phone: " + number);
        return number;
    }
    private static String perAddress(String name){
        System.out.println("Address: " + name);
        return name;
    }
    public static String perInsta(String name){
        System.out.println("Instagram: " + name);
        return name;
    }
    public static String perFacebook(String name){
        System.out.println("Facebook: " + name);
        return name;
    }
}
