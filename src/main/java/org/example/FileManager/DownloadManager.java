package org.example.FileManager;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadManager {

    private ExecutorService executorService;

    public DownloadManager(int thread) {
        this.executorService = Executors.newFixedThreadPool(thread);
    }

    public void downloadFiles(List<String> filename){
        for(String file:filename){

            DownloadTask downloadTask=new DownloadTask(file);
            executorService.submit(downloadTask);
        }
    }

    public void shutdown(){
        executorService.shutdown();
    }


}
