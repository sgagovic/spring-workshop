package rest.service;

public class Grreting {

    private final long id;
    private final String content;

    public Grreting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
