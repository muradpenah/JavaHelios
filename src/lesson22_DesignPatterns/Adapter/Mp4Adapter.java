package lesson22_DesignPatterns.Adapter;

public class Mp4Adapter  implements AudioPlayer {
    private  OldVideoPlayer oldVideoPlayer;

    public Mp4Adapter(OldVideoPlayer oldVideoPlayer) {
        this.oldVideoPlayer = oldVideoPlayer;
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp4")){
            String aviFile = filename.replace(".mp4",".avi");
            System.out.println("fayl formati mp4 den avi formatina cevrildi. ");
            oldVideoPlayer.playAvi(aviFile);
        }
    }
}
