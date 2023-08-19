package designPatterns.structural.proxy.proxymanager;

import designPatterns.structural.proxy.filemanager.FileManager;
import designPatterns.structural.proxy.filemanager.RealFileManager;

public class FileManagerProxy implements FileManager{
    private FileManager realFileManager;
    private String accessCode;

    public FileManagerProxy(String accessCode) {
        this.accessCode = accessCode;
    }

    private void authenticate() {
        // Authenticates the user based on access code
        // Logic for authentication goes here
    }

    private void logAccess(String filename) {
        // Log the access to the file
        System.out.println("Access logged - User: " + accessCode + ", File: " + filename);
    }

    public void readFile(String filename) {
        authenticate();

        if (realFileManager == null) {
            realFileManager = new RealFileManager();
        }

        realFileManager.readFile(filename);

        logAccess(filename);
    }
}
