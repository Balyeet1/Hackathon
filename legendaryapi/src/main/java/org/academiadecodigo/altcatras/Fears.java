package org.academiadecodigo.altcatras;

public class Fears {

    private int id;
    private String name;


    public Fears(String name, int id){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
