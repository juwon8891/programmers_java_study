public class MusicBoxExam {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();
        MusicPlayer p1 = new MusicPlayer(1, box);
        MusicPlayer p2 = new MusicPlayer(2, box);
        MusicPlayer p3 = new MusicPlayer(3, box);
        p1.start();
        p2.start();
        p3.start();
    }
}
