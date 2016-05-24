package hellotvxlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import javax.tv.xlet.*;
import org.davic.resources.ResourceClient;
import org.davic.resources.ResourceProxy;
import org.dvb.ui.DVBColor;
import org.havi.ui.HBackgroundConfigTemplate;
import org.havi.ui.HBackgroundConfiguration;
import org.havi.ui.HBackgroundDevice;
import org.havi.ui.HBackgroundImage;
import org.havi.ui.HConfigurationException;
import org.havi.ui.HPermissionDeniedException;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HScreen;
import org.havi.ui.HState;
import org.havi.ui.HStaticText;
import org.havi.ui.HStillImageBackgroundConfiguration;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HBackgroundImageEvent;
import org.havi.ui.event.HBackgroundImageListener;


public class whatToWatch_View implements Xlet, ResourceClient, HBackgroundImageListener {

  String movieUrl = "";
  HScene scene;
  HTextButton button1;
  
  HTextButton btnStory1;
  HTextButton btnStory2;
  HTextButton btnStory3;
  HTextButton btnStory4;
  HTextButton btnStory5;
  
  HTextButton btnChar1;
  HTextButton btnChar2;
  HTextButton btnChar3;
  HTextButton btnChar4;
  HTextButton btnChar5;
  
  HTextButton btnEnd1;
  HTextButton btnEnd2;
  HTextButton btnEnd3;
  HTextButton btnEnd4;
  HTextButton btnEnd5;
  
  HTextButton btnAudio1;
  HTextButton btnAudio2;
  HTextButton btnAudio3;
  HTextButton btnAudio4;
  HTextButton btnAudio5;
  
  HTextButton btnAll1;
  HTextButton btnAll2;
  HTextButton btnAll3;
  HTextButton btnAll4;
  HTextButton btnAll5;
  
  HTextButton btnConfirm;
  HTextButton btnConfirmScore;
  HStaticText lblStory;
  HStaticText lblChar;
  HStaticText lblEnd;   
  HStaticText lblAudio;       
  HStaticText lblAll;
  HStaticText lblYourScore;
  HStillImageBackgroundConfiguration HBackConfig;
  private HBackgroundImage bgStart;
  private HBackgroundImage bgCover;
  
  
    public whatToWatch_View() {
          scene = HSceneFactory.getInstance().getDefaultHScene();
          System.out.println("view started");
          
          
          
          
          HBackgroundConfigTemplate hbct=new HBackgroundConfigTemplate();
    hbct.setPreference(hbct.STILL_IMAGE, hbct.REQUIRED);
    HBackgroundDevice d;
    HScreen s=HScreen.getDefaultHScreen();
    d=s.getDefaultHBackgroundDevice();
    if (d.reserveDevice(this)) System.out.println("Backgroup Reserved"); else System.out.println("Backgroup NOT Reserved");
        try {
            d.setBackgroundConfiguration(HBackConfig=(HStillImageBackgroundConfiguration)d.getBestConfiguration(hbct));
        } catch (SecurityException ex) {
            ex.printStackTrace();
        } catch (HPermissionDeniedException ex) {
            ex.printStackTrace();
        } catch (HConfigurationException ex) {
            ex.printStackTrace();
        }
    
    bgStart = new HBackgroundImage("bgStart.jpg");//bgStart.jpg
    bgStart.load(this);
    lblStory =  new HStaticText("Story",378,10,200,50); 
    lblChar =  new HStaticText("Characters",400,110,200,50);
    lblEnd =  new HStaticText("End",372,210,200,50);
    lblAudio =  new HStaticText("Audio",378,310,200,50);
    lblAll =  new HStaticText("Overall Score",412,410,200,50);
    Font fontBtnStart = new Font ("sansSerif", Font.BOLD, 100);      
    lblYourScore = new HStaticText ("You gave the movie ", 378,40, 300, 500);
    lblYourScore.setFont(fontBtnStart);
    button1 = new HTextButton("Random Movie", 80,30,562,270);
    button1.setForeground(Color.BLACK);
    button1.setFont(fontBtnStart);
    button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    button1.setActionCommand("button1klik");
    scene.add(button1);
    
    
    
    
    btnStory1 = new HTextButton("1", 450,60,30,30);
    btnStory1.setForeground(Color.BLACK);
    btnStory1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnStory1.setActionCommand("Story1Click");
    scene.add(btnStory1);
    
    btnStory2 = new HTextButton("2", 500,60,30,30);
    btnStory2.setForeground(Color.BLACK);
    btnStory2.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnStory2.setActionCommand("Story2Click");
    scene.add(btnStory2);
    
    btnStory3 = new HTextButton("3", 550,60,30,30);
    btnStory3.setForeground(Color.BLACK);
    btnStory3.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnStory3.setActionCommand("Story3Click");
    scene.add(btnStory3);
    
    btnStory4 = new HTextButton("4", 600,60,30,30);
    btnStory4.setForeground(Color.BLACK);
    btnStory4.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnStory4.setActionCommand("Story4Click");  
    scene.add(btnStory4);
    
    btnStory5 = new HTextButton("5", 650,60,30,30);
    btnStory5.setForeground(Color.BLACK);
    btnStory5.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnStory5.setActionCommand("Story5Click");  
    scene.add(btnStory5);
    
    
    btnChar1 = new HTextButton("1", 450,160,30,30);
    btnChar1.setForeground(Color.BLACK);
    btnChar1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnChar1.setActionCommand("Char1Click");  
    scene.add(btnChar1);
    
    btnChar2 = new HTextButton("2", 500,160,30,30);
    btnChar2.setForeground(Color.BLACK);
    btnChar2.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnChar2.setActionCommand("Char2Click");
    scene.add(btnChar2);
    
    btnChar3 = new HTextButton("3", 550,160,30,30);
    btnChar3.setForeground(Color.BLACK);
    btnChar3.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnChar3.setActionCommand("Char3Click"); 
    scene.add(btnChar3);
    
    btnChar4 = new HTextButton("4", 600,160,30,30);
    btnChar4.setForeground(Color.BLACK);
    btnChar4.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnChar4.setActionCommand("Char4Click");
    scene.add(btnChar4);
    
    btnChar5 = new HTextButton("5", 650,160,30,30);
    btnChar5.setForeground(Color.BLACK);
    btnChar5.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnChar5.setActionCommand("Char5Click");
    scene.add(btnChar5);
    
    btnEnd1 = new HTextButton("1", 450,260,30,30);
    btnEnd1.setForeground(Color.BLACK);
    btnEnd1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnEnd1.setActionCommand("end1Click");
    scene.add(btnEnd1);
    
    btnEnd2 = new HTextButton("2", 500,260,30,30);
    btnEnd2.setForeground(Color.BLACK);
    btnEnd2.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnEnd2.setActionCommand("end2Click");
    scene.add(btnEnd2);
    
    btnEnd3 = new HTextButton("3", 550,260,30,30);
    btnEnd3.setForeground(Color.BLACK);
    btnEnd3.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnEnd3.setActionCommand("end3Click");
    scene.add(btnEnd3);
    
    btnEnd4 = new HTextButton("4", 600,260,30,30);
    btnEnd4.setForeground(Color.BLACK);
    btnEnd4.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnEnd4.setActionCommand("end4Click");
    scene.add(btnEnd4);
    
    btnEnd5 = new HTextButton("5", 650,260,30,30);
    btnEnd5.setForeground(Color.BLACK);
    btnEnd5.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnEnd5.setActionCommand("end5Click");
    scene.add(btnEnd5);
    
    btnAudio1 = new HTextButton("1", 450,360,30,30);
    btnAudio1.setForeground(Color.BLACK);
    btnAudio1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAudio1.setActionCommand("audio1Click");
    scene.add(btnAudio1);
    
    btnAudio2 = new HTextButton("2", 500,360,30,30);
    btnAudio2.setForeground(Color.BLACK);
    btnAudio2.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAudio2.setActionCommand("audio2Click");
    scene.add(btnAudio2);
    
    btnAudio3 = new HTextButton("3", 550,360,30,30);
    btnAudio3.setForeground(Color.BLACK);
    btnAudio3.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAudio3.setActionCommand("audio3Click");
    scene.add(btnAudio3);
    
    btnAudio4 = new HTextButton("4", 600,360,30,30);
    btnAudio4.setForeground(Color.BLACK);
    btnAudio4.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAudio4.setActionCommand("audio4Click");
    scene.add(btnAudio4);
    
    btnAudio5 = new HTextButton("5", 650, 360,30,30);
    btnAudio5.setForeground(Color.BLACK);
    btnAudio5.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAudio5.setActionCommand("audio5Click");
    scene.add(btnAudio5);
    
    btnAll1 = new HTextButton("1", 450,460,30,30);
    btnAll1.setForeground(Color.BLACK);
    btnAll1.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAll1.setActionCommand("all1Click");
    scene.add(btnAll1);
    
    btnAll2 = new HTextButton("2", 500,460,30,30);
    btnAll2.setForeground(Color.BLACK);
    btnAll2.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAll2.setActionCommand("all2Click");
    scene.add(btnAll2);
    
    btnAll3 = new HTextButton("3", 550,460,30,30);
    btnAll3.setForeground(Color.BLACK);
    btnAll3.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAll3.setActionCommand("all3Click");
    scene.add(btnAll3);
    
    btnAll4 = new HTextButton("4", 600,460,30,30);
    btnAll4.setForeground(Color.BLACK);
    btnAll4.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAll4.setActionCommand("all4Click");
    scene.add(btnAll4);
    
    btnAll5 = new HTextButton("5", 650, 460,30,30);
    btnAll5.setForeground(Color.BLACK);
    btnAll5.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnAll5.setActionCommand("all5Click");
    scene.add(btnAll5);
    
    btnConfirm = new HTextButton("Confirm", 450,520,100,30);
    btnConfirm.setForeground(Color.BLACK);
    btnConfirm.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnConfirm.setActionCommand("confirmClick");
    scene.add(btnConfirm);
  //  btnConfirm.setBackground(Color.BLACK);

    btnConfirmScore = new HTextButton("Confirm", 450,520,100,30);
    //btnConfirmScore.setForeground(Color.BLACK);
    btnConfirmScore.setBackgroundMode(HVisible.BACKGROUND_FILL);
    btnConfirmScore.setActionCommand("confirmScoreClick");
    scene.add(btnConfirmScore);
    btnConfirmScore.setBackground(Color.BLACK);
    
    //up,down, left, right
    btnStory1.setFocusTraversal(null, btnChar1, null, btnStory2);
    btnChar1.setFocusTraversal(btnStory1, btnEnd1, null, btnChar2);
    btnEnd1.setFocusTraversal(btnChar1, btnAudio1, null, btnEnd2);
    btnAudio1.setFocusTraversal(btnEnd1, btnAll1, null, btnAudio2);
    btnAll1.setFocusTraversal(btnAudio1, btnConfirm, null, btnAll2);     
    
    btnStory2.setFocusTraversal(null, btnChar2, btnStory1, btnStory3);
    btnChar2.setFocusTraversal(btnStory2, btnEnd2, btnChar1, btnChar3);
    btnEnd2.setFocusTraversal(btnChar2, btnAudio2, btnEnd1, btnEnd3);
    btnAudio2.setFocusTraversal(btnEnd2, btnAll2, btnAudio1, btnAudio3);
    btnAll2.setFocusTraversal(btnAudio2, btnConfirm, btnAll1, btnAll3);   
    
    btnStory3.setFocusTraversal(null, btnChar3, btnStory2, btnStory4);
    btnChar3.setFocusTraversal(btnStory3, btnEnd3, btnChar2, btnChar4);
    btnEnd3.setFocusTraversal(btnChar3, btnAudio3, btnEnd2, btnEnd4);
    btnAudio3.setFocusTraversal(btnEnd3, btnAll3, btnAudio2, btnAudio4);
    btnAll3.setFocusTraversal(btnAudio3, btnConfirm, btnAll2, btnAll4);   
    
    btnStory4.setFocusTraversal(null, btnChar4, btnStory3, btnStory5);
    btnChar4.setFocusTraversal(btnStory4, btnEnd4, btnChar3, btnChar5);
    btnEnd4.setFocusTraversal(btnChar4, btnAudio4, btnEnd3, btnEnd5);
    btnAudio4.setFocusTraversal(btnEnd4, btnAll4, btnAudio3, btnAudio5);
    btnAll4.setFocusTraversal(btnAudio4, btnConfirm, btnAll3, btnAll5);   
    
    btnStory5.setFocusTraversal(null, btnChar5, btnStory4, null);
    btnChar5.setFocusTraversal(btnStory5, btnEnd5, btnChar4, null);
    btnEnd5.setFocusTraversal(btnChar5, btnAudio5, btnEnd4, null);
    btnAudio5.setFocusTraversal(btnEnd5, btnAll5, btnAudio4, null);
    btnAll5.setFocusTraversal(btnAudio5, btnConfirm, btnAll4, null);   
            
    btnConfirm.setFocusTraversal(btnAll1, null, null, null);
     
    btnStory1.setVisible(false);
    btnStory2.setVisible(false);
    btnStory3.setVisible(false);
    btnStory4.setVisible(false);
    btnStory5.setVisible(false);
  
    btnChar1.setVisible(false);
    btnChar2.setVisible(false);
    btnChar3.setVisible(false);
    btnChar4.setVisible(false);
    btnChar5.setVisible(false);

    btnEnd1.setVisible(false);
    btnEnd2.setVisible(false);
    btnEnd3.setVisible(false);
    btnEnd4.setVisible(false);
    btnEnd5.setVisible(false);

    btnAudio1.setVisible(false);
    btnAudio2.setVisible(false);
    btnAudio3.setVisible(false);
    btnAudio4.setVisible(false);
    btnAudio5.setVisible(false);

    btnAll1.setVisible(false);
    btnAll2.setVisible(false);
    btnAll3.setVisible(false);
    btnAll4.setVisible(false);
    btnAll5.setVisible(false);
    
    btnConfirm.setVisible(false);
    btnConfirm.setEnabled(false);
    btnConfirmScore.setVisible(false);
    btnConfirmScore.setEnabled(false);
    
    btnStory1.setEnabled(false);
    btnStory2.setEnabled(false);
    btnStory3.setEnabled(false);
    btnStory4.setEnabled(false);
    btnStory5.setEnabled(false);
  
    btnChar1.setEnabled(false);
    btnChar2.setEnabled(false);
    btnChar3.setEnabled(false);
    btnChar4.setEnabled(false);
    btnChar5.setEnabled(false);

    btnEnd1.setEnabled(false);
    btnEnd2.setEnabled(false);
    btnEnd3.setEnabled(false);
    btnEnd4.setEnabled(false);
    btnEnd5.setEnabled(false);

    btnAudio1.setEnabled(false);
    btnAudio2.setEnabled(false);
    btnAudio3.setEnabled(false);
    btnAudio4.setEnabled(false);
    btnAudio5.setEnabled(false);

    btnAll1.setEnabled(false);
    btnAll2.setEnabled(false);
    btnAll3.setEnabled(false);
    btnAll4.setEnabled(false);
    btnAll5.setEnabled(false);
    
    scene.add(lblStory);
    scene.add(lblChar);
    scene.add(lblEnd);
    scene.add(lblAudio);
    scene.add(lblAll);
    scene.add(lblYourScore);
    
    
    lblStory.setVisible(false);
    lblChar.setVisible(false);
    lblEnd.setVisible(false);
    lblAudio.setVisible(false);
    lblAll.setVisible(false);
    lblYourScore.setVisible(false);
    
    scene.validate();
    scene.setVisible(true);
    
    button1.requestFocus(); //focus op button
    }

    public void initXlet(XletContext context) {
    
    }
    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void buttonStartClicked(String urlBg){

    bgStart = new HBackgroundImage(urlBg);
    bgStart.load(this);    
    button1.setVisible(false);
    scene.repaint();
    }
    
    public void newRandomMovieShow(String urlBg){
   bgStart = new HBackgroundImage(urlBg);
    bgStart.load(this);
    scene.repaint();

    }
    
    public void buttonClickedChange(HTextButton buttonClicked, HTextButton[] buttonOtherOfType){
         buttonClicked.setBackgroundMode(HVisible.BACKGROUND_FILL);
         buttonClicked.setBackground(Color.GREEN);
    for(int i = 0;i<4;i++){
            buttonOtherOfType[i].setBackground(Color.BLACK);
            buttonOtherOfType[i].setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
    }
         scene.repaint();
    }
    public void buttonRatingOff(){
            btnStory1.setEnabled(false);
            btnStory2.setEnabled(false);
            btnStory3.setEnabled(false);
            btnStory4.setEnabled(false);
            btnStory5.setEnabled(false);
  
            btnChar1.setEnabled(false);
            btnChar2.setEnabled(false);
            btnChar3.setEnabled(false);
            btnChar4.setEnabled(false);
            btnChar5.setEnabled(false);

            btnEnd1.setEnabled(false);
            btnEnd2.setEnabled(false);
            btnEnd3.setEnabled(false);
            btnEnd4.setEnabled(false);
            btnEnd5.setEnabled(false);

            btnAudio1.setEnabled(false);
            btnAudio2.setEnabled(false);
            btnAudio3.setEnabled(false);
            btnAudio4.setEnabled(false);
            btnAudio5.setEnabled(false);

            btnAll1.setEnabled(false);
            btnAll2.setEnabled(false);
            btnAll3.setEnabled(false);
            btnAll4.setEnabled(false);
            btnAll5.setEnabled(false);
            
            btnStory1.setVisible(false);
            btnStory2.setVisible(false);
            btnStory3.setVisible(false);
            btnStory4.setVisible(false);
            btnStory5.setVisible(false);
  
            btnChar1.setVisible(false);
            btnChar2.setVisible(false);
            btnChar3.setVisible(false);
            btnChar4.setVisible(false);
            btnChar5.setVisible(false);

            btnEnd1.setVisible(false);
            btnEnd2.setVisible(false);
            btnEnd3.setVisible(false);
            btnEnd4.setVisible(false);
            btnEnd5.setVisible(false);

            btnAudio1.setVisible(false);
            btnAudio2.setVisible(false);
            btnAudio3.setVisible(false);
            btnAudio4.setVisible(false);
            btnAudio5.setVisible(false);

            btnAll1.setVisible(false);
            btnAll2.setVisible(false);
            btnAll3.setVisible(false);
            btnAll4.setVisible(false);
            btnAll5.setVisible(false);
                     
            btnConfirm.setVisible(false);
             
            lblStory.setVisible(false);
            lblChar.setVisible(false);
            lblEnd.setVisible(false);
            lblAudio.setVisible(false);
            lblAll.setVisible(false);
    }
    
    public void showRating(String totalRating){
                
//change text to rating           // lblYourScore.setTextContent("You gave the movie a new rating",HState.NORMAL_STATE);//+ rating + "%"
            lblYourScore.setTextContent(totalRating, HState.NORMAL_STATE);
            lblYourScore.setVisible(true);
            btnConfirmScore.setVisible(true);
            btnConfirmScore.setEnabled(true);
            btnConfirmScore.requestFocus();
            scene.repaint();
    }
    public void hideRating(){
    btnConfirmScore.setVisible(false);
    lblYourScore.setVisible(false);
    btnConfirmScore.setEnabled(false);
    
    scene.repaint();
    }
    public void answeredAll(){
    
    lblYourScore.setTextContent(" Rated \n all \n movies", HState.NORMAL_STATE);
    lblYourScore.setVisible(true);
    btnConfirmScore.setVisible(false);
    btnConfirmScore.setEnabled(false);
    scene.repaint();
    }
    
    public void buttonsRatingOn(){  
     btnAll4.setBackground(Color.BLACK);
     btnAll4.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAll1.setBackground(Color.BLACK);
     btnAll1.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAll2.setBackground(Color.BLACK);
     btnAll2.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAll3.setBackground(Color.BLACK);
     btnAll3.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAll5.setBackground(Color.BLACK);
     btnAll5.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     
     btnStory1.setBackground(Color.BLACK);
     btnStory1.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnStory2.setBackground(Color.BLACK);
     btnStory2.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnStory3.setBackground(Color.BLACK);
     btnStory3.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnStory4.setBackground(Color.BLACK);
     btnStory4.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnStory5.setBackground(Color.BLACK);
     btnStory5.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     
     btnChar1.setBackground(Color.BLACK);
     btnChar1.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnChar2.setBackground(Color.BLACK);
     btnChar2.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnChar3.setBackground(Color.BLACK);
     btnChar3.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnChar4.setBackground(Color.BLACK);
     btnChar4.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnChar5.setBackground(Color.BLACK);
     btnChar5.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     
     btnEnd1.setBackground(Color.BLACK);
     btnEnd1.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnEnd2.setBackground(Color.BLACK);
     btnEnd2.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnEnd3.setBackground(Color.BLACK);
     btnEnd3.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnEnd4.setBackground(Color.BLACK);
     btnEnd4.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnEnd5.setBackground(Color.BLACK);
     btnEnd5.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     
     btnAudio1.setBackground(Color.BLACK);
     btnAudio1.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAudio2.setBackground(Color.BLACK);
     btnAudio2.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAudio3.setBackground(Color.BLACK);
     btnAudio3.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAudio4.setBackground(Color.BLACK);
     btnAudio4.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     btnAudio5.setBackground(Color.BLACK);
     btnAudio5.setBackgroundMode(HVisible.NO_BACKGROUND_FILL);
     
    btnStory1.setVisible(true);
    btnStory2.setVisible(true);
    btnStory3.setVisible(true);
    btnStory4.setVisible(true);
    btnStory5.setVisible(true);
  
    btnChar1.setVisible(true);
    btnChar2.setVisible(true);
    btnChar3.setVisible(true);
    btnChar4.setVisible(true);
    btnChar5.setVisible(true);

    btnEnd1.setVisible(true);
    btnEnd2.setVisible(true);
    btnEnd3.setVisible(true);
    btnEnd4.setVisible(true);
    btnEnd5.setVisible(true);

    btnAudio1.setVisible(true);
    btnAudio2.setVisible(true);
    btnAudio3.setVisible(true);
    btnAudio4.setVisible(true);
    btnAudio5.setVisible(true);

    btnAll1.setVisible(true);
    btnAll2.setVisible(true);
    btnAll3.setVisible(true);
    btnAll4.setVisible(true);
    btnAll5.setVisible(true);
    
    btnStory1.setEnabled(true);
    btnStory2.setEnabled(true);
    btnStory3.setEnabled(true);
    btnStory4.setEnabled(true);
    btnStory5.setEnabled(true);
  
    btnChar1.setEnabled(true);
    btnChar2.setEnabled(true);
    btnChar3.setEnabled(true);
    btnChar4.setEnabled(true);
    btnChar5.setEnabled(true);

    btnEnd1.setEnabled(true);
    btnEnd2.setEnabled(true);
    btnEnd3.setEnabled(true);
    btnEnd4.setEnabled(true);
    btnEnd5.setEnabled(true);

    btnAudio1.setEnabled(true);
    btnAudio2.setEnabled(true);
    btnAudio3.setEnabled(true);
    btnAudio4.setEnabled(true);
    btnAudio5.setEnabled(true);

    btnAll1.setEnabled(true);
    btnAll2.setEnabled(true);
    btnAll3.setEnabled(true);
    btnAll4.setEnabled(true);
    btnAll5.setEnabled(true);
    
    lblStory.setVisible(true);
    lblChar.setVisible(true);
    lblEnd.setVisible(true);
    lblAudio.setVisible(true);
    lblAll.setVisible(true);
    
    btnConfirm.setVisible(true);
    btnConfirm.setEnabled(true);
    
    btnStory1.requestFocus();
    }
    public HTextButton[][] getRatingButtons(){
 //   HTextButton[] arrButtons;// = new HTextButton[25];
    HTextButton[][] arrButtons = { {btnStory1, btnStory2, btnStory3, btnStory4, btnStory5}, {btnChar1, btnChar2, btnChar3, btnChar4, btnChar5},{btnEnd1, btnEnd2, btnEnd3, btnEnd4, btnEnd5},{btnAudio1, btnAudio2, btnAudio3,btnAudio4, btnAudio5}, {btnAll1, btnAll2, btnAll3, btnAll4, btnAll5}};
    return arrButtons;
    }
    
    public HTextButton[] getOtherButtons(){
    HTextButton[] arrButtons = { btnConfirm, btnConfirmScore,button1};
    return arrButtons;
    }
    
    public boolean requestRelease(ResourceProxy proxy, Object requestData) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release(ResourceProxy proxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void notifyRelease(ResourceProxy proxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imageLoaded(HBackgroundImageEvent e) {
   //     System.out.println("imageLoaded");
        try {
            HBackConfig.displayImage(bgStart);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (HPermissionDeniedException ex) {
            ex.printStackTrace();
        } catch (HConfigurationException ex) {
            ex.printStackTrace();
        }
    }

    public void imageLoadFailed(HBackgroundImageEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

