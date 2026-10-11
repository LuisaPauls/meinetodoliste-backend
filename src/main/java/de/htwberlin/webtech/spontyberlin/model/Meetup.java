package de.htwberlin.webtech.spontyberlin.model;

public class Meetup {
    private String title;
    private String location;
    private String category;
    private String date;
    private String time;
    private int maxParticipants;

    public Meetup(String title, String location, String category, String date, String time, int maxParticipants) {
        this.title = title;
        this.location = location;
        this.category = category;
        this.date = date;
        this.time = time;
        this.maxParticipants = maxParticipants;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
}
