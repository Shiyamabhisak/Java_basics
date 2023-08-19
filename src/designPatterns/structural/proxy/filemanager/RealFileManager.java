package designPatterns.structural.proxy.filemanager;

public class RealFileManager implements FileManager{
    public void readFile(String filename) {
        System.out.println("Reading file: " + filename);
        // Actual file reading logic goes here
    }
}
