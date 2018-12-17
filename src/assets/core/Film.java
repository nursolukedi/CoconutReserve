package assets.core;

import java.util.Date;

public class Film {
    private String filmName;
    private Date filmTime;

    public Film(String filmName, Date filmTime) {

        if ( filmName == null || filmTime == null )
        {
            throw new NullPointerException("Film parameters are null");
        }

        this.filmName = filmName;
        this.filmTime = filmTime;
    }


    public String getFilmName() {
        return filmName;
    }

    public Date getFilmTime() {
        return filmTime;
    }

    public String toString(){
        return filmName; }
}
