package org.VladQA.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject = new File("src/main/java/org/VladQA/filemanagementservice/test.txt" );

        FileManager.informIfTheFileExist(fileObject);
        FileManager.createTheFileIfItDoesNotExist(fileObject);
        FileManager.informIfTheFileExist(fileObject);
        FileManager.printIfTheFileIsADirectoryOrNot(fileObject);
        FileManager.printTheFileAbsolutePath(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.deleteTheFileIfExist(fileObject);

        String filePath = "src/main/java/org/VladQA/filemanagementservice/testOutput.txt";
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter("src/main/java/org/VladQA/filemanagementservice/testOutput.txt", "content 1");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter("src/main/java/org/VladQA/filemanagementservice/testOutput.txt", "continut 2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFile(fileObjectUsedForReading);

    }
}
