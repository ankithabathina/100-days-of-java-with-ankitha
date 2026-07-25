// Target Interface
interface MediaPlayer {

    void play(String audioType, String fileName);

}

// Adaptee Class
class Mp4Player {

    public void playMp4(String fileName) {

        System.out.println("Playing MP4 file: " + fileName);

    }

}

// Adapter Class
class MediaAdapter implements MediaPlayer {

    private Mp4Player mp4Player;

    public MediaAdapter() {

        mp4Player = new Mp4Player();

    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp4")) {

            mp4Player.playMp4(fileName);

        } else {

            System.out.println("Unsupported media format.");

        }

    }

}

// Client Class
class AudioPlayer implements MediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {

            System.out.println("Playing MP3 file: " + fileName);

        } else if (audioType.equalsIgnoreCase("mp4")) {

            adapter = new MediaAdapter();
            adapter.play(audioType, fileName);

        } else {

            System.out.println("Invalid media format.");

        }

    }

}

// Main Class
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");

        player.play("mp4", "movie.mp4");

        player.play("vlc", "video.vlc");

    }

}
