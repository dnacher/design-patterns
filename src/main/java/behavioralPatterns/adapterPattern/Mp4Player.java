package behavioralPatterns.adapterPattern;

public class Mp4Player implements AdvanceMediaPlayer{


    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
