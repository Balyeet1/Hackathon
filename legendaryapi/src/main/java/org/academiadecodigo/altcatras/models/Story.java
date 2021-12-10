package org.academiadecodigo.altcatras.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Story {
    @NotNull(message = "Author is mandatory")
    @NotBlank(message = "Author is mandatory")
    @Size(min = 3, max = 32)
    private String Author;

    @NotNull(message = "path is mandatory")
    @NotBlank(message = "path is mandatory")
    @Size(min = 3, max = 128)
    private String path;

    @NotNull(message = "Fear type is mandatory")
    @NotBlank(message = "Fear type is mandatory")
    @Size(min = 3, max = 32)
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
