/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author wille
 */
public class Movie {
    // values
    private String mov = "MOV";
    private String title = "";
    private String director = "Unknown";
    private int year;
    private int rating = 0;
    private int seasons = 1;
    //private Genre;
    // tv object
    public Movie(String mov, String t, String d, int y, int r){
        mov = getType();
        this.setTitle(t);
        this.setDirector(d);
        this.setYear(y);
        this.setRating(r);
    }
    // getters and setters for values
    public String getType(){
        return this.mov;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public String getDirector(){
        return this.director;
    }
    public void setDirector(String d){
        this.director = d;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        if(y >= 0 && y <= 2020){
            this.year = y;
        }
        else{
            System.out.println("Invalid year");
            this.year = 0;
        }
    }
    public int getRating(){
        return this.rating;
    }
    public void setRating(int r){
        if(r <=10 && r>=0){
            this.rating = r;
        }
        else{
            System.out.println("Invalid rating");
            this.rating = 0;
        }
    }
    public String toString(){
        return getType()+": "+getTitle()+", Created by "+getDirector()+
                " | "+getYear()+" | "+getRating()+".0 Rating";
    }
}

