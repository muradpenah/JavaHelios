package lesson22_DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new Mp4Adapter(new OldVideoPlayer());
        player.play("laleler.mp4");
    }
}
