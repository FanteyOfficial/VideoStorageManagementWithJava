import java.util.*;

public class Storage {
    HashMap<String, Video> videoData;

    void addVideoToStorage(Video v) {
        videoData.put(v.getTitle(), v);
    }

    void removeVideoFromStorage(String videoTitle) throws VideoNotExistException {
        videoData.remove(videoTitle);
    }
}