package beans;

import java.io.Serializable;

public class Artist implements Serializable {
    private long id;
    private boolean isBand;
    private String name;
    private String language;

    public Artist() {
    }

    public Artist(long id, boolean isBand, String name, String language) {
        this.id = id;
        this.isBand = isBand;
        this.name = name;
        this.language = language;
    }

    public Artist(boolean isBand, String name, String language) {
        this.isBand = isBand;
        this.name = name;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isBand() {
        return isBand;
    }

    public void setBand(boolean band) {
        isBand = band;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
