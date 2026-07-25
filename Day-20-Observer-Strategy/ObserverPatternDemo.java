// ObserverPatternDemo.java

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Subscriber {
    void update(String videoTitle);
}

// Concrete Observer
class YouTubeSubscriber implements Subscriber {

    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification:");
        System.out.println("📢 New Video Uploaded: " + videoTitle);
        System.out.println();
    }
}

// Subject Interface
interface Channel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}

// Concrete Subject
class YouTubeChannel implements Channel {

    private List<Subscriber> subscribers = new ArrayList<>();

    private String latestVideo;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestVideo);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;

        System.out.println("🎥 New Video Uploaded!");
        System.out.println("-------------------------");
        System.out.println();

        notifySubscribers();
    }
}

// Main Class
public class ObserverPatternDemo {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber s1 = new YouTubeSubscriber("Ankitha");
        Subscriber s2 = new YouTubeSubscriber("Rahul");
        Subscriber s3 = new YouTubeSubscriber("Priya");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.uploadVideo("Java Observer Pattern Explained");
    }
}
