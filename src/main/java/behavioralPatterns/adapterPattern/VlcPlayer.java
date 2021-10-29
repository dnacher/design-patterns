package behavioralPatterns.adapterPattern;

public class VlcPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("PLaying vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
