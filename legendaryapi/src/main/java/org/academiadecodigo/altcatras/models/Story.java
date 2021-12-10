package org.academiadecodigo.altcatras.models;

public class Story {
    private String Author;
    private String path;
    private String fearType;

    public Story(String Author, String path, String fearType){
        this.Author = Author;
        this.path = path;
        this.fearType = fearType;
    }

    public String getFearType() {
        return fearType;
    }

    public void setFearType(String fearType) {
        this.fearType = fearType;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
