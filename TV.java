
package finalproject;

/**
 *
 * @author wille
 */
public class TV {
    // values
    private String tv = "TV";
    private String title = "";
    private String creator = "Unknown";
    private int year;
    private int rating = 0;
    private int seasons = 1;
    private Genres g = Genres.Unknown;
    // tv object
    public TV(String tv, String t, String c, int y, int r, int s, Genres g){
        tv = getType();
        this.setTitle(t);
        this.setCreator(c);
        this.setYear(y);
        this.setRating(r);
        this.setSeasons(s);
        this.setGenre(g);
    }
    // getters and setters for values
    public String getType(){
        return this.tv;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public String getCreator(){
        return this.creator;
    }
    public void setCreator(String c){
        this.creator = c;
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
    public int getSeasons(){
        return this.seasons;
    }
    public void setSeasons(int s){
        if(s >= 1){
            this.seasons = s;
        }
    }
    public Genres getGenre(){
        return this.g;
    }
    public void setGenre(Genres g){
        this.g = g;
    }
    public String toString(){
        return getType()+": "+getTitle()+", Created by "+getCreator()+" | "
                +getGenre()+" | "+getSeasons()+" Season(s) | "+getYear()+" | "+getRating()+".0 Rating";
    }
}
