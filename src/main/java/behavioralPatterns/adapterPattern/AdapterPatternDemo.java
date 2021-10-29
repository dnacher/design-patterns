package behavioralPatterns.adapterPattern;

public class AdapterPatternDemo {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Beyond the horizon");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
