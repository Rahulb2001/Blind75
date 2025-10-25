package org.example.FactoryAssignment1;

public class AudioPlayerFactory {

    public static AudioPlayer createPlayer(String format,int volume,double playBackRate){

        if(format.equalsIgnoreCase("MP3")){
            return  new MP3Player(volume, playBackRate);
        } else if (format.equalsIgnoreCase("FLAC")) {
            return new FLACPlayer(volume,playBackRate);
        } else if (format.equalsIgnoreCase("WAC")) {
            return new WAVPlayer(volume,playBackRate);
        }else{
            return null;
        }

    }
}