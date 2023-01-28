package pruebaprogramacion;

public class Main {

    public static void main(String[] args) {
        // Corporacion
        comCorp();

        // Integrantes
        comRoster("Alejandro");
        comRoster("Alexis");
        comRoster("Roberta");
        comRoster("Lola");

        // Owner
        String owner = theOnlyOne();
        System.out.println(owner);

        // Nacimientos
        comYear(2023);

    }
    public static void comCorp(){
        System.out.println("---------- \nSickGamers - Esport Organitation \n----------");
    }
    public static void comRoster(String name){
        System.out.println(name);
    }
    public static String theOnlyOne(){
        return "---------- \nCreador \n---------- \nAlejandro Fernandez \n----------- ";
    }
    public static int comYear(Integer number){
        System.out.println("SINCE - " + number);
        return number;
    }
}