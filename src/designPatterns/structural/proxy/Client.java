package designPatterns.structural.proxy;

import designPatterns.structural.proxy.filemanager.FileManager;
import designPatterns.structural.proxy.proxymanager.FileManagerProxy;

public class Client {
    public static void main(String[] args) {
        FileManager fileManager = new FileManagerProxy("user123");
        fileManager.readFile("example.txt");
    }
}
