package pruebaprogramacion.datos;

public class Personal {
    
    public static void main(String[] args) {

        String wellcome = wellcomeSr();  

        perNombre("Alejandro");
        perApellido("Fernandez");
        perSexo();
        perEdad(28);
        perNacionalidad("Argentina");
        perDomicilio("calle wallaby 42 sidney");
        perTelefono(55555555);
        perInsta("@ale.jsk");
        perFb("fb.com/alejandro.jsk.fernandez");
     
    }

    public static String wellcomeSr(){
        System.out.println("Modelo beta de bienvenida\nUsuario beta:\n");
        return null;
    }

    public static String perNombre(String name){
        System.out.println("Nombre: " + name);
        return name;
    }
    public static String perApellido(String name){
        System.out.println("Apellido: " + name);
        return name;
    }
    public static void perSexo(){
        boolean checkSex = true;
        if(checkSex){
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Femenino");
        }
    }
    public static int perEdad(Integer number){
        System.out.println("Edad: " + number);
        return number;
    }
    public static String perNacionalidad(String name){
        System.out.println("Nacionalidad: " + name);
        return name;
    }
    public static String perDomicilio(String name){
        System.out.println("Domicilio: " + name);
        return name;
    }
    public static int perTelefono(Integer number){
        System.out.println("Telefono: " + number);
        return number;
    }
    public static String perInsta(String name){
        System.out.println("Instagram: " + name);
        return name;
    }
    public static String perFb(String name){
        System.out.println("Facebook: " + name);
        return name;
    }
}
