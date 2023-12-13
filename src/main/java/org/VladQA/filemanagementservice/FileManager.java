package org.VladQA.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("File exist");
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void printTheFileName(File file) {
        String fileName = file.getName();
        System.out.println("File name is " + fileName);
    }

    public static void printTheFileAbsolutePath(File file){
        String absolutePath = file.getAbsolutePath();
        System.out.println("The absolute path is " + absolutePath);
    }

    public static void printIfTheFileIsADirectoryOrNot(File file){
        if (file.isDirectory()) {
            System.out.println("File is a directory");
        } else if (file.isFile()) {
            System.out.println("File is a file");
        }
    }

    public static void deleteTheFileIfExist(File file){
        if (file.delete()) {
            System.out.println("The file was deleted.");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}