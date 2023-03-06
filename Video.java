import java.time.LocalDate;

public class Video {
    private String title;
    private int likes;
    private int views;
    private LocalDate uploadDate;

    Video(String title, LocalDate date) {
        this.title = title;
        likes = 0;
        views = 0;
        this.uploadDate = date;
    }

    Video(String title, int likes, int views) {
        this.title = title;
        this.likes = likes;
        this.views = views;
    }

    void addLike() {
        likes++;
    }

    void addLike(int nLikes) {
        likes += nLikes;
    }

    void addView() {
        views++;
    }

    void addView(int nViews) {
        views += nViews;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public int getViews() {
        return views;
    }

    public LocalDate getDate() {
        return uploadDate;
    }
}
