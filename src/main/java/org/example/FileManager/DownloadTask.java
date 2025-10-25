package org.example.FileManager;

public class DownloadTask implements Runnable{

    public String filename;


    public DownloadTask(String filename){
        this.filename=filename;
    }

    @Override
    public void run() {

        System.out.println("Downloading file: " + filename);
        for(int i=0;i<=100;i+=10){
            System.out.println("Download progress of " + filename + ": " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                if(i==100){
                    System.out.println("Download completed for file: " + filename);
                }
            }

        }

    }
}
