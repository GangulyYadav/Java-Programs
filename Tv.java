// CWH practice set 11 question 6,7
// By Ganguly Yadav
// 3rd August 2021

interface TVRemote{
    void onOffButton();
    void volumeButton();    
}

interface SmartTVRemote extends TVRemote{
    void playVideo();
    void startRecording();
}


public class Tv implements SmartTVRemote{
    @Override
    public void onOffButton() {
        System.out.println("Starting TV..");
    }    

    @Override
    public void volumeButton() {
        System.out.println("Incresing volume...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video..");        
    }

    @Override
    public void startRecording() {
        System.out.println("Started Recording!");        
    }

    public static void main(String[] args) {
        Tv myTV = new Tv();
        myTV.onOffButton();
        myTV.volumeButton();
        myTV.playVideo();
        myTV.startRecording();
    }
}
