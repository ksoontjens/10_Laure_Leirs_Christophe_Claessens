package hellotvxlet;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HTextButton;
import org.havi.ui.event.HActionListener;



public class whatToWatch_Controller implements Xlet, HActionListener {
  
  whatToWatch_model[] moviesModels= new whatToWatch_model[10];
  whatToWatch_View view ;
  String movies[][] = new String[10][3];
  String currentRating[] = new String[5];
  int rnd;
  int rating = 0;
  HTextButton btnConfirm;
  HTextButton btnConfirmScore;
  HTextButton btnStart;
  HTextButton[][] arrRatingbuttons;
  String totalRating;
  byte moviesRated = 0;
  
    public whatToWatch_Controller() {
    System.out.println("started controller");
   
    view = new whatToWatch_View();
    
    }

    public void initXlet(XletContext context) {
     
    }

    public void startXlet() {
     System.out.println("controller adding movies");
    moviesModels[0] = new whatToWatch_model(0,"Ratatouille", "RatatouilleBG2.png");
    moviesModels[1] = new whatToWatch_model(1,"Iron Man", "IronManBG2.png");
    moviesModels[2] = new whatToWatch_model(2,"Django unchained", "DjangoUnchainedBG2.png");
    moviesModels[3] = new whatToWatch_model(3,"Wall-e", "Wall-EBG2.png");
    moviesModels[4] = new whatToWatch_model(4,"Star Wars IV", "StarWarsIVBG2.png");
    moviesModels[5] = new whatToWatch_model(5,"Pulp Fiction", "PulpFictionBG2.png");
    moviesModels[6] = new whatToWatch_model(6,"he Dark Knight", "TheDarkKnightBG2.png");
    moviesModels[7] = new whatToWatch_model(7,"The Hunger Games", "TheHungerGamesBG2.png");
    moviesModels[8] = new whatToWatch_model(8,"The Avengers", "TheAvengersBG2.png");
    moviesModels[9] = new whatToWatch_model(9,"Jurassic Park", "JurassicParkBG2.png");
    System.out.println("started controller xlet");
    addButtonsListeners();
    }

    public void pauseXlet() {
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    public void addButtonsListeners(){
         HTextButton[][] arrButtons =  view.getRatingButtons();
     for(int i = 0; i<arrButtons.length; i++){
         for(int j = 0; j < 5; j++){
        arrButtons[i][j].addHActionListener(this);
         }
     }
          HTextButton[] arrOtherButtons = view.getOtherButtons();
          for(int k = 0; k < arrOtherButtons.length; k++){
         arrOtherButtons[k].addHActionListener(this);
         }
         btnConfirm = arrOtherButtons[0];
         btnConfirmScore = arrOtherButtons[1];
         btnStart = arrOtherButtons[2];
         arrRatingbuttons = arrButtons;
    }

    public String getNewMovie(){
            rnd = (int)(Math.random()*10);
            System.out.println(rnd);
        return moviesModels[rnd].getMovieUrl();
    }
    public String btnConfirmedRatingClicked(){
        
           if(moviesModels[rnd].getAll()>0 && moviesModels[rnd].getStory()>0 && moviesModels[rnd].getAll() > 0 && moviesModels[rnd].getCharacter() > 0 && moviesModels[rnd].getEnd()>0){
           //all ratings are given
               System.out.println("getting total" + moviesModels[rnd].getTotal());
           return moviesModels[rnd].getTotal();
           
           }
           else return "";
    }
       public void actionPerformed(ActionEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
         String buttonPushed = event.getActionCommand();
         
         System.out.println("a button was clicked" + buttonPushed);
        if( buttonPushed.equals("button1klik") ) //startButton
        {
//bg set   
            
            view.buttonStartClicked(getNewMovie());
            System.out.println("ratings on");
            view.buttonsRatingOn();
            btnStart.setEnabled(false);
        }

        if(buttonPushed.equals("Story1Click")) //startButton
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[0][1], arrRatingbuttons[0][2], arrRatingbuttons[0][3], arrRatingbuttons[0][4]};
            view.buttonClickedChange(arrRatingbuttons[0][0], arrToReturn);
           ratingButtonClicked(1,1);
         }
        
        if(buttonPushed.equals("Story2Click")) //startButton
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[0][0], arrRatingbuttons[0][2], arrRatingbuttons[0][3], arrRatingbuttons[0][4]};
            view.buttonClickedChange(arrRatingbuttons[0][1], arrToReturn);
           ratingButtonClicked(1,2);
         }
         
         if(buttonPushed.equals("Story3Click")) //startButton
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[0][0], arrRatingbuttons[0][1], arrRatingbuttons[0][3], arrRatingbuttons[0][4]};
            view.buttonClickedChange(arrRatingbuttons[0][2], arrToReturn);
           ratingButtonClicked(1,3);
         }
         
         if(buttonPushed.equals("Story4Click")) //startButton
        { 
             HTextButton[] arrToReturn = {arrRatingbuttons[0][0], arrRatingbuttons[0][1], arrRatingbuttons[0][2], arrRatingbuttons[0][4]};
            view.buttonClickedChange(arrRatingbuttons[0][3], arrToReturn);
           ratingButtonClicked(1,4);
         }
         
         if(buttonPushed.equals("Story5Click")) //startButton
        {HTextButton[] arrToReturn = {arrRatingbuttons[0][0], arrRatingbuttons[0][1], arrRatingbuttons[0][2], arrRatingbuttons[0][3]};
            view.buttonClickedChange(arrRatingbuttons[0][4], arrToReturn);
           ratingButtonClicked(1,5);
         }
        
        
         if(buttonPushed.equals("Char1Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[1][4], arrRatingbuttons[1][1], arrRatingbuttons[1][2], arrRatingbuttons[1][3]};
            view.buttonClickedChange(arrRatingbuttons[1][0], arrToReturn);
           ratingButtonClicked(2,1);
         }
        
        if(buttonPushed.equals("Char2Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[1][0], arrRatingbuttons[1][4], arrRatingbuttons[1][2], arrRatingbuttons[1][3]};
            view.buttonClickedChange(arrRatingbuttons[1][1], arrToReturn);
           ratingButtonClicked(2,2);
         }
         
         if(buttonPushed.equals("Char3Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[1][0], arrRatingbuttons[1][1], arrRatingbuttons[1][3], arrRatingbuttons[1][4]};
            view.buttonClickedChange(arrRatingbuttons[1][2], arrToReturn);
           ratingButtonClicked(2,3);
         }
         
         if(buttonPushed.equals("Char4Click"))
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[1][0], arrRatingbuttons[1][1], arrRatingbuttons[1][2], arrRatingbuttons[1][4]};
            view.buttonClickedChange(arrRatingbuttons[1][3], arrToReturn);
           ratingButtonClicked(2,4);
         }
         
         if(buttonPushed.equals("Char5Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[1][0], arrRatingbuttons[1][1], arrRatingbuttons[1][2], arrRatingbuttons[1][3]};
            view.buttonClickedChange(arrRatingbuttons[1][4], arrToReturn);
           ratingButtonClicked(2,5);
         }

 
         if(buttonPushed.equals("end1Click")) 
        {
           HTextButton[] arrToReturn = {arrRatingbuttons[2][1], arrRatingbuttons[2][2], arrRatingbuttons[2][3],arrRatingbuttons[2][4]};
            view.buttonClickedChange(arrRatingbuttons[2][0], arrToReturn);
          ratingButtonClicked(4,1);
         }
        
        if(buttonPushed.equals("end2Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[2][0], arrRatingbuttons[2][2], arrRatingbuttons[2][3],arrRatingbuttons[2][4]};
            view.buttonClickedChange(arrRatingbuttons[2][1], arrToReturn);
           ratingButtonClicked(4,2);
         }
         
         if(buttonPushed.equals("end3Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[2][0], arrRatingbuttons[2][1], arrRatingbuttons[2][3],arrRatingbuttons[2][4]};
            view.buttonClickedChange(arrRatingbuttons[2][2], arrToReturn);
           ratingButtonClicked(4,3);
         }
         
         if(buttonPushed.equals("end4Click"))
        {
           HTextButton[] arrToReturn = {arrRatingbuttons[2][0], arrRatingbuttons[2][1], arrRatingbuttons[2][2],arrRatingbuttons[2][4]};
            view.buttonClickedChange(arrRatingbuttons[2][3], arrToReturn);
           ratingButtonClicked(4,4);
         }
         
         if(buttonPushed.equals("end5Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[2][0], arrRatingbuttons[2][1], arrRatingbuttons[2][2],arrRatingbuttons[2][3]};
            view.buttonClickedChange(arrRatingbuttons[2][4], arrToReturn);
           ratingButtonClicked(4,5);
         }
         
        if(buttonPushed.equals("audio1Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[3][1], arrRatingbuttons[3][2], arrRatingbuttons[3][3], arrRatingbuttons[3][4]};
            view.buttonClickedChange(arrRatingbuttons[3][0], arrToReturn);
           ratingButtonClicked(3,1);
         }
        
        if(buttonPushed.equals("audio2Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[3][0], arrRatingbuttons[3][2], arrRatingbuttons[3][3], arrRatingbuttons[3][4]};
            view.buttonClickedChange(arrRatingbuttons[3][1], arrToReturn);
           ratingButtonClicked(3,2);
         }
         
         if(buttonPushed.equals("audio3Click")) 
        {
           HTextButton[] arrToReturn = {arrRatingbuttons[3][0], arrRatingbuttons[3][1], arrRatingbuttons[3][3], arrRatingbuttons[3][4]};
            view.buttonClickedChange(arrRatingbuttons[3][2], arrToReturn);
           ratingButtonClicked(3,3);
         }
         
         if(buttonPushed.equals("audio4Click"))
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[3][0], arrRatingbuttons[3][1], arrRatingbuttons[3][2], arrRatingbuttons[3][4]};
            view.buttonClickedChange(arrRatingbuttons[3][3], arrToReturn);
           ratingButtonClicked(3,4);
         }
         
         if(buttonPushed.equals("audio5Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[3][0], arrRatingbuttons[3][1], arrRatingbuttons[3][2], arrRatingbuttons[3][3]};
            view.buttonClickedChange(arrRatingbuttons[3][4], arrToReturn);
           ratingButtonClicked(3,5);
         }
        
      
         if(buttonPushed.equals("all1Click")) 
        {
           HTextButton[] arrToReturn = {arrRatingbuttons[4][1], arrRatingbuttons[4][2], arrRatingbuttons[4][3],arrRatingbuttons[4][4]};
            view.buttonClickedChange(arrRatingbuttons[4][0], arrToReturn);
           ratingButtonClicked(5,1);
         }
        
        if(buttonPushed.equals("all2Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[4][0], arrRatingbuttons[4][2], arrRatingbuttons[4][3],arrRatingbuttons[4][4]};
            view.buttonClickedChange(arrRatingbuttons[4][1], arrToReturn);
           ratingButtonClicked(5,2);
         }
         
         if(buttonPushed.equals("all3Click")) 
        {
           HTextButton[] arrToReturn = {arrRatingbuttons[4][0], arrRatingbuttons[4][1], arrRatingbuttons[4][3],arrRatingbuttons[4][4]};
            view.buttonClickedChange(arrRatingbuttons[4][2], arrToReturn);
            ratingButtonClicked(5,3);
         }
         
         if(buttonPushed.equals("all4Click"))
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[4][0], arrRatingbuttons[4][1], arrRatingbuttons[4][2],arrRatingbuttons[4][4]};
            view.buttonClickedChange(arrRatingbuttons[4][3], arrToReturn);
           ratingButtonClicked(5,4);
         }
         
         if(buttonPushed.equals("all5Click")) 
        {
            HTextButton[] arrToReturn = {arrRatingbuttons[4][0], arrRatingbuttons[4][1], arrRatingbuttons[4][2],arrRatingbuttons[4][3]};
            view.buttonClickedChange(arrRatingbuttons[4][4], arrToReturn);
            ratingButtonClicked(5,5);
         }
       
     
         
        if(buttonPushed.equals("confirmClick")){ //confirms the rating
           System.out.println("confirmingRating");
            totalRating = btnConfirmedRatingClicked();
           if( totalRating != ""){
            moviesRated++;
            view.showRating(totalRating);
           view.buttonRatingOff();
           btnConfirmScore.setEnabled(true);
           btnConfirm.setEnabled(false);
           
           }
         }
         
       if(buttonPushed.equals("confirmScoreClick")){

           if(moviesRated < 10){
               System.out.println(moviesRated);
           while(moviesModels[rnd].getAll() != 0){
               System.out.println(moviesModels[rnd].getAll() != 0);
               rnd = (int)(Math.random()*10);
           }
           view.buttonsRatingOn();
           view.newRandomMovieShow(moviesModels[rnd].getMovieUrl());
           view.hideRating();
           }
                     else{
               view.answeredAll(); 
           } 
           
       }

       }
    

    public void ratingButtonClicked(int type, int rating){
        switch(type){
            case 1:
               moviesModels[rnd].setStory(rating);
        break;
        
            case 2:
                moviesModels[rnd].setCharacter(rating);
                break;
                
            case 3:
                moviesModels[rnd].setAudio(rating);
                break;
                        
            case 4:
                moviesModels[rnd].setEnd(rating);
                break;
                    
            case 5:
                moviesModels[rnd].setAll(rating);
                break;
        }
        
    }

}

