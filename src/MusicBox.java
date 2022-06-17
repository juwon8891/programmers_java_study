public class MusicBox {
    public synchronized void playMusicA() {
        for (int i = 0; i < 10; i++) {
                System.out.println("신나는 음악!!");
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void playMusicB() {{
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                System.out.println("슬픈 음악!!");
            }
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }}
    }
    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            synchronized(this){
                System.out.println("카페음악!!");
            }
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
