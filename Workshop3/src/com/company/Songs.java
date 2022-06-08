package com.company;

/**
 * Main class,
 *
 *
 * @version 1.05.003 2022-06-02.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 * @author Juan Pablo Tabares Gallego - juancho9615@hotmail.com
 *
 * @since 1.01.001
 */
public class Songs {

    /**
     * Declaration of attributes.
     */
    private String name;
    private int id;
    private int day;
    private int month;
    private String year;
    private String description;
    private float duration;
    public String genre;
    private String cover;
    public String date;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public float getDuration() {
        return duration;
    }

    public String getCover() {
        return cover;
    }

    /**
     *
     * Constructor used to create the songs of the app music.
     *
     * @param name Song's name.
     * @param id Id's name.
     * @param day Song's date.
     * @param month Song's date.
     * @param year Song's date.
     * @param description Song's description
     * @param duration Song's duration.
     * @param genre Song's genre.
     * @param cover Song's cover.
     */

    public Songs(String name, int id, int day, int month, String year, String description, int duration, String genre, String cover) {
        this.name = name;
        this.id = id;
        this.date = day + "/" + month + "/" + year;
        this.day = day;
        this.month = month;
        this.year = year;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
    }
}
