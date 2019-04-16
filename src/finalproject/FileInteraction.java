
package finalproject;

import finalproject2.Movie;
import finalproject2.Genres;
import finalproject2.TV;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInteraction{
    public void writeFileTV(ArrayList<TV> t){
        try{
            File f = new File("tv.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int x = 0 ; t.size() < x ; x++){
                String type = (t.get(x).getType());
                type = type.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(type);
                raf.writeChars(" ");  
                String title = (t.get(x).getTitle());
                title = title.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(title);
                raf.writeChars(" ");
                String creator = (t.get(x).getCreator());
                creator = creator.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(creator);
                raf.writeChars(" ");
                if(t.get(x).getGenre() == Genres.Unknown){
                    raf.writeChars("Unknown");
                }
                else if(t.get(x).getGenre() == Genres.Action){
                    raf.writeChars("Action");
                }
                else if(t.get(x).getGenre() == Genres.Adventure){
                    raf.writeChars("Adventure");
                }
                else if(t.get(x).getGenre() == Genres.Anime){
                    raf.writeChars("Anime");
                }
                else if(t.get(x).getGenre() == Genres.Comedy){
                    raf.writeChars("Comedy");
                }
                else if(t.get(x).getGenre() == Genres.Drama){
                    raf.writeChars("Drama");
                }
                else if(t.get(x).getGenre() == Genres.Documentary){
                    raf.writeChars("Documentary");
                }
                else if(t.get(x).getGenre() == Genres.Fantasy){
                    raf.writeChars("Fantasy");
                }
                else if(t.get(x).getGenre() == Genres.Horror){
                    raf.writeChars("Horror");
                }                
                else if(t.get(x).getGenre() == Genres.Indie){
                    raf.writeChars("Indie");
                }
                else if(t.get(x).getGenre() == Genres.Musical){
                    raf.writeChars("Musical");
                }
                else if(t.get(x).getGenre() == Genres.Pornographic){
                    raf.writeChars("Pornographic");
                }
                else if(t.get(x).getGenre() == Genres.Romance){
                    raf.writeChars("Romance");
                }
                else if(t.get(x).getGenre() == Genres.Science_Fiction){
                    raf.writeChars("Science_Fiction");
                }
                else if(t.get(x).getGenre() == Genres.Superhero){
                    raf.writeChars("Superhero");
                }
                else if(t.get(x).getGenre() == Genres.Thriller){
                    raf.writeChars("Thriller");
                }
                else if(t.get(x).getGenre() == Genres.Western){
                    raf.writeChars("Western");
                }
                raf.writeChars(" ");
                raf.writeInt(t.get(x).getSeasons());
                raf.writeChars(" ");
                raf.writeInt(t.get(x).getYear());
                raf.writeChars(" ");
                raf.writeInt(t.get(x).getRating());
                raf.writeBytes(System.getProperty("line.seperator"));
            }
        }catch(IOException e){
            
        }
    }
    public ArrayList<Movie> loadFileMOV(){
        ArrayList<Movie> m = new ArrayList();
        try{
            File f = new File("mov.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            while(raf.readLine().equals(true)){
                String type = String.valueOf(raf.readUTF());
                type = type.replaceAll("_", " ").toLowerCase();
                String title = String.valueOf(raf.readUTF());
                title = title.replaceAll("_", " ").toLowerCase();
                String director = String.valueOf(raf.readUTF());
                director = director.replaceAll("_", " ").toLowerCase();
                String g = String.valueOf(raf.readUTF());
                Genres genre = Genres.Unknown;
                if(g.equals("Unknown")){
                    genre = Genres.Unknown;
                }
                else if(g.equals("Action")){
                    genre = Genres.Action;
                }
                else if(g.equals("Adventure")){
                    genre = Genres.Adventure;
                }
                else if(g.equals("Anime")){
                    genre = Genres.Anime;
                }
                else if(g.equals("Comedy")){
                    genre = Genres.Comedy;
                }
                else if(g.equals("Drama")){
                    genre = Genres.Drama;
                }
                else if(g.equals("Documentary")){
                    genre = Genres.Documentary;
                }
                else if(g.equals("Fantasy")){
                    genre = Genres.Fantasy;
                }
                else if(g.equals("Horror")){
                    genre = Genres.Horror;
                }                
                else if(g.equals("Indie")){
                    genre = Genres.Indie;
                }
                else if(g.equals("Musical")){
                    genre = Genres.Musical;
                }
                else if(g.equals("Pornographic")){
                    genre = Genres.Pornographic;
                }
                else if(g.equals("Romance")){
                    genre = Genres.Romance;
                }
                else if(g.equals("Science_Fiction")){
                    genre = Genres.Science_Fiction;
                }
                else if(g.equals("Superhero")){
                    genre = Genres.Superhero;
                }
                else if(g.equals("Thriller")){
                    genre = Genres.Thriller;
                }
                else if(g.equals("Western")){
                    genre = Genres.Western;
                }
                int year = raf.readInt();
                int rating = raf.readInt();
                Movie mv = new Movie(type, title, director, year, rating, genre);
                m.add(mv);
            }
        }catch(IOException e){
            
        }
        return m;
    }
    public void writeFileMOV(ArrayList<Movie> t){
        try{
            File f = new File("mov.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int x = 0 ; t.size() < x ; x++){
                String type = (t.get(x).getType());
                type = type.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(type);
                raf.writeChars(" ");  
                String title = (t.get(x).getTitle());
                title = title.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(title);
                raf.writeChars(" ");
                String director = (t.get(x).getDirector());
                director = director.replaceAll(" ", "_").toLowerCase();
                raf.writeChars(director);
                raf.writeChars(" ");
                if(t.get(x).getGenre() == Genres.Unknown){
                    raf.writeChars("Unknown");
                }
                else if(t.get(x).getGenre() == Genres.Action){
                    raf.writeChars("Action");
                }
                else if(t.get(x).getGenre() == Genres.Adventure){
                    raf.writeChars("Adventure");
                }
                else if(t.get(x).getGenre() == Genres.Anime){
                    raf.writeChars("Anime");
                }
                else if(t.get(x).getGenre() == Genres.Comedy){
                    raf.writeChars("Comedy");
                }
                else if(t.get(x).getGenre() == Genres.Drama){
                    raf.writeChars("Drama");
                }
                else if(t.get(x).getGenre() == Genres.Documentary){
                    raf.writeChars("Documentary");
                }
                else if(t.get(x).getGenre() == Genres.Fantasy){
                    raf.writeChars("Fantasy");
                }
                else if(t.get(x).getGenre() == Genres.Horror){
                    raf.writeChars("Horror");
                }                
                else if(t.get(x).getGenre() == Genres.Indie){
                    raf.writeChars("Indie");
                }
                else if(t.get(x).getGenre() == Genres.Musical){
                    raf.writeChars("Musical");
                }
                else if(t.get(x).getGenre() == Genres.Pornographic){
                    raf.writeChars("Pornographic");
                }
                else if(t.get(x).getGenre() == Genres.Romance){
                    raf.writeChars("Romance");
                }
                else if(t.get(x).getGenre() == Genres.Science_Fiction){
                    raf.writeChars("Science_Fiction");
                }
                else if(t.get(x).getGenre() == Genres.Superhero){
                    raf.writeChars("Superhero");
                }
                else if(t.get(x).getGenre() == Genres.Thriller){
                    raf.writeChars("Thriller");
                }
                else if(t.get(x).getGenre() == Genres.Western){
                    raf.writeChars("Western");
                }
                raf.writeChars(" ");
                raf.writeInt(t.get(x).getYear());
                raf.writeChars(" ");
                raf.writeInt(t.get(x).getRating());
                raf.writeBytes(System.getProperty("line.seperator"));
            }
        }catch(IOException e){
            
        }
    }
    public ArrayList<TV> loadFileTV(){
        ArrayList<TV> t = new ArrayList();
        try{
            File f = new File("tv.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            while(raf.readLine().equals(true)){
                String type = String.valueOf(raf.readUTF());
                type = type.replaceAll("_", " ").toLowerCase();
                String title = String.valueOf(raf.readUTF());
                title = title.replaceAll("_", " ").toLowerCase();
                String creator = String.valueOf(raf.readUTF());
                creator = creator.replaceAll("_", " ").toLowerCase();
                String g = String.valueOf(raf.readUTF());
                Genres genre = Genres.Unknown;
                if(g.equals("Unknown")){
                    genre = Genres.Unknown;
                }
                else if(g.equals("Action")){
                    genre = Genres.Action;
                }
                else if(g.equals("Adventure")){
                    genre = Genres.Adventure;
                }
                else if(g.equals("Anime")){
                    genre = Genres.Anime;
                }
                else if(g.equals("Comedy")){
                    genre = Genres.Comedy;
                }
                else if(g.equals("Drama")){
                    genre = Genres.Drama;
                }
                else if(g.equals("Documentary")){
                    genre = Genres.Documentary;
                }
                else if(g.equals("Fantasy")){
                    genre = Genres.Fantasy;
                }
                else if(g.equals("Horror")){
                    genre = Genres.Horror;
                }                
                else if(g.equals("Indie")){
                    genre = Genres.Indie;
                }
                else if(g.equals("Musical")){
                    genre = Genres.Musical;
                }
                else if(g.equals("Pornographic")){
                    genre = Genres.Pornographic;
                }
                else if(g.equals("Romance")){
                    genre = Genres.Romance;
                }
                else if(g.equals("Science_Fiction")){
                    genre = Genres.Science_Fiction;
                }
                else if(g.equals("Superhero")){
                    genre = Genres.Superhero;
                }
                else if(g.equals("Thriller")){
                    genre = Genres.Thriller;
                }
                else if(g.equals("Western")){
                    genre = Genres.Western;
                }
                int seasons = raf.readInt();
                int year = raf.readInt();
                int rating = raf.readInt();
                TV tv = new TV(type, title, creator, year, rating, seasons, genre);
                t.add(tv);
            }
        }catch(IOException e){
            
        }
        return t;
    }
}
