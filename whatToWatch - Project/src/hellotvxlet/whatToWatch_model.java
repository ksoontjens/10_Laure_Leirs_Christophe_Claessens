package hellotvxlet;
import javax.tv.xlet.*;


public class whatToWatch_model implements Xlet {

int movieNr;
 String movieTitle;
 String movieUrl;
 int story = 0;
 int characters = 0;
 int end = 0;
 int audio = 0;
 int all = 0;
 int total = 0;

    public whatToWatch_model(int tMovieNr, String tMovieTitle, String tMovieUrl){
        movieNr = tMovieNr;
        movieTitle = tMovieTitle;
        movieUrl = tMovieUrl;

    }
   public whatToWatch_model() {
    
    }

    public int getNumberMovie(){
     return movieNr;
    }
    
     public String getMovieTitle(){
     return movieTitle;
    }

     public String getMovieUrl(){
     return movieUrl;
    }
     public int getStory(){
     return story;
     }
     public void setStory(int rating){
         story = rating;
     }
     public int getCharacter(){
     return characters;
     }
    public void setCharacter(int rating){
         characters = rating;
     }
     public int getEnd(){
     return end;
     }
     public void setEnd(int rating){
         end = rating;
     }
     public int getAudio(){
     return audio;
     }
    public void setAudio(int rating){
         audio = rating;
     }
     public int getAll(){
     return all;
     }
     public void setAll(int rating){
         all = rating;
     }
     public String getTotal(){
         total = (story + characters + end + audio + all)*4;
         return "" +  total + "%"; //to String
     }

       public void initXlet(XletContext arg0) throws XletStateChangeException {
    }

    public void startXlet() throws XletStateChangeException {

    }

    public void pauseXlet() {

    }

    public void destroyXlet(boolean arg0) throws XletStateChangeException {

    }


}

