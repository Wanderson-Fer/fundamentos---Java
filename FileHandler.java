import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileHandler {
    public static void createNewFile(File f) {
        try {
            if (f.exists()) {
                System.out.println("O arquivo já existe: " + f.getAbsolutePath());
            } else {
                f.createNewFile();
                System.out.println("Arquivo criado: " + f.getAbsolutePath());
            }
        } catch (Exception e) {
            System.out.println("Arquivo não encontrado ou nome inválido!");
            e.printStackTrace();
        }
    }

    public static void writeToFile(File f, String s) {
        System.out.println("Can write: " + f.canWrite());
        try {
            FileWriter writer = new FileWriter(f.getName());
            writer.write(s);
            writer.close();

            System.out.println("Sucesfully written");
        } catch (IOException e) {
            System.out.println("An error as ocurred");
            e.printStackTrace();
        }
    }

    public static void readerFile(File f) {
        try {
            Scanner reader = new Scanner(f);
            String content = "";
            while (reader.hasNextLine()) {
                content += reader.nextLine();
            }
            System.out.println(content);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    public static void getFileInfo(File f) {
        if(f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Last modified: " + f.lastModified());
            System.out.println("File size in bytes" + f.length());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writeable: " + f.canWrite());
        } else {
            System.out.println("Something wrong is not right.");
        }
    }

    public static void main(String[] args) {
        String fileName = "file.txt";
        File file = new File(fileName);

        String message = "Lambda is a powerful feature of Java that makes it easier to write concise and readable code";

        createNewFile(file);
        writeToFile(file, message);
        readerFile(file);
        getFileInfo(file);

        if(file.delete()) {
            System.out.println("File Deleted");
        } else {
            System.out.println("Failed to delete the file");
        }

    }
}