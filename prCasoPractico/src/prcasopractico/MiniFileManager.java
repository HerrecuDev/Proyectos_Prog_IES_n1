package prcasopractico;

import java.io.File;
import java.util.Date;

public class MiniFileManager {

    private static String path;

    public static void iniciarRuta(String ruta) {
        path = ruta;
    }

    public static String getPWD() {
        return path;
    }

    public static boolean changeDir(String dir) {

        if (!dir.equals("..")) {
            File dondeMovernos = new File(path + "/" + dir);
            if (dondeMovernos.exists()) {
                path = dondeMovernos.getPath();
                return true;
            } else {
                return false;
            }
        } else {
            File dondeMovernos = new File(new File(path).getParent());
            if (dondeMovernos.exists()) {
                path = dondeMovernos.getPath();
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean createDir(String dir) {
        if (!dir.equals("..")) {
            File carpeta = new File(path + "/" + dir);
            if (carpeta.exists()) {
                return false;
            } else {
                carpeta.mkdir();
                return true;
            }
        }
        return false;
    }

    public static boolean moveFile(String origen, String destino) {
        File origenF = new File(path + "/" + origen);
        File destinoF = new File(path + "/" + destino);

        return origenF.renameTo(destinoF);

    }

    public static void printList(boolean info) {
        File[] contenido = new File(path).listFiles();

        for (File f : contenido) {
            System.out.println(f.getName() + "\t" + (info ? (f.isFile() ? f.length() : "") + "" + new Date(f.lastModified()) : ""));
        }

    }

    public static boolean removeFile(String fichero) {
        return borrarEnBucle(path + "/" + fichero);
    }

    public static boolean borrarEnBucle(String ruta) {
        File ficheroABorrar = new File(ruta);
        System.out.println(ficheroABorrar.getAbsoluteFile() + "borrar");
        if (ficheroABorrar.exists() && ficheroABorrar.isFile()) {
            return ficheroABorrar.delete();

        } else if (ficheroABorrar.exists() && ficheroABorrar.isDirectory()) {
            File[] contenido = new File(ruta).listFiles();

            for (File f : contenido) {
                System.out.println(f.getName());
                if (f.isFile()) {
                    System.out.println(f.getName() + "dentro");
                    f.delete();
                } else if (f.isDirectory()) {

                    borrarEnBucle(f.getPath());
                }
            }
            return ficheroABorrar.delete();
        }
        return false;
    }

}
