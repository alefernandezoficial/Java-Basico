package pruebaprogramacion.myfirstapp.basededatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InteractiveFile {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Pattern emailPattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
            Matcher emailMatcher;

/*
 * NOMBRE DE USUARIO
 */
            System.out.println("Introduce tu nombre de usuario (maximo 20 caracteres): ");
            String username = scan.nextLine();
            while (username.length() > 20) {
                System.out.println("ERROR: No puedes superar el maximo de caracteres!");
                username = scan.nextLine();
            }
/*
 * DNI
 */
            System.out.println("Introduce tu DNI: ");
            String dni = scan.nextLine();
            while (!dni.matches("^[0-9]{8}$")) {
                System.out.println("ERROR: Debe tener 8 numeros, introduzca uno valido");
                dni = scan.nextLine();
            }
/*
 * CORREO ELECTRONICO
 */
            System.out.println("Introduce tu correo electronico: ");
            String email = scan.nextLine();
            emailMatcher = emailPattern.matcher(email);
            while (!emailMatcher.matches()) {
                System.out.println("ERROR: correo electronico NO VALIDO!");
                email = scan.nextLine();
                emailMatcher = emailPattern.matcher(email);
            }
/*
 * CONTRASEÑA
 */
            System.out.println("Introduce tu contraseña: ");
            String password = scan.nextLine();
            while (!password.matches("^[A-Za-z0-9]+$")) {
                System.out.println("ERROR: contraseña SOLO con LETRAS y NUMEROS!");
                password = scan.nextLine();
            }
/*
 * IMPRESION DE ARCHIVO TXT
 */
            System.out.println("Creando archivo de usuario ...");
            File userFile = new File(username + ".txt");

            try {
                if (userFile.createNewFile()){
                    System.out.println("Archivo creado exitosamente!");
                } else {
                    System.out.println("El archivo ya existe.");
                }

                FileWriter writer = new FileWriter(userFile);
                writer.write("Nombre de usuario: " + username + "\n");
                writer.write("Clave DNI: " + dni + "\n");
                writer.write("Correo electronico: " + email + "\n");
                writer.write("Contraseña: " + password + "\n");
                writer.close();
                System.out.println("Informacion guardada en el archivo.");
            }   catch (IOException e) {
                System.out.println("ERROR AL CREAR EL ARCHIVO!");
                e.printStackTrace();
            }
        }

    }

}

