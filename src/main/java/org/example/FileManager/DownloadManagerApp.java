package org.example.FileManager;

import java.util.List;

public class DownloadManagerApp {

    public static void main(String[] args) {
        DownloadManager downloadManager=new DownloadManager(3);

        List<String> files=List.of("file1.txt","file2.txt","file3.txt","file4.txt","file5.txt");
        downloadManager.downloadFiles(files);

        for(int i=0;i<5;i++){
            System.out.println("Main thread is doing other work "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
