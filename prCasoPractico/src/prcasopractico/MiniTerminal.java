package prcasopractico;

import java.util.Scanner;

public class MiniTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MiniFileManager.iniciarRuta("Recursos/Documentos");

        String input = "";
        while (!input.equals("salir")) {
            System.out.print(MiniFileManager.getPWD() + " > ");
            input = scanner.nextLine();
            String[] instruccionSeparada = input.split(" ");
            String comando = instruccionSeparada[0];
            String argumento = instruccionSeparada.length > 1 ? instruccionSeparada[1] : "";
            String argumento2 = instruccionSeparada.length > 2 ? instruccionSeparada[2] : "";
            
            switch (comando) {
                case "pwd":
                    System.out.println(MiniFileManager.getPWD());
                    break;
                case "cd":
                    if (!MiniFileManager.changeDir(argumento)) {
                        System.out.println("Error: Directorio no encontrado");
                    }
                    break;
                case "ls":
                    MiniFileManager.printList(false);
                    break;
                case "ll":
                    MiniFileManager.printList(true);
                    break;
                case "mkdir":
                    if (!MiniFileManager.createDir(argumento)) {
                        System.out.println("Error: No se pudo crear el directorio");
                    }
                    break;
                case "rm":
                    if (!MiniFileManager.removeFile(argumento)) {
                        System.out.println("Error: No se pudo eliminar el archivo/directorio");
                    }
                    break;
                case "mv":
                    if (instruccionSeparada.length < 2 || !MiniFileManager.moveFile(argumento, argumento2)) {
                        System.out.println("Error: No se pudo mover el archivo/directorio");
                    }
                    break;
                case "help":
                    System.out.println("Comandos disponibles:");
                    System.out.println("pwd - Muestra la carpeta actual");
                    System.out.println("cd <DIR> - Cambia la carpeta actual");
                    System.out.println("ls - Lista archivos y directorios");
                    System.out.println("ll - Lista con detalles");
                    System.out.println("mkdir <DIR> - Crea un directorio");
                    System.out.println("rm <FILE> - Borra archivo o carpeta");
                    System.out.println("mv <FILE1> <FILE2> - Mueve o renombra archivo");
                    System.out.println("help - Muestra esta ayuda");
                    System.out.println("exit - Termina el programa");
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Error: Comando no reconocido");
                    break;
            }
        }
    }
}
