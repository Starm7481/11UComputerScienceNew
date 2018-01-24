package gameproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.Icon;
import java.awt.EventQueue;
/**
 *
 * @author lamon
 */
public class GameProject extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // YOUR GAME VARIABLES WOULD GO HERE
/* 
 *  GAME FEATURES
 * - Random spawning 
 * - Multiple layer menu
 * - Animations on menu items 
 * - Player boundaries 
 * - difficulty menu 
 * - score 
 * - Colour changing cubes (indicate progress) 
 * - score increases in size the further you go 
 * - Functions used to make code shorter 
 * - Local save highscore 
 * - Text file writing and reading 
   - Highscores for each difficulty 
   - 3 character 'intial' name saving when you reach a highscore 
   - ability to move forward and back up through the UI quickly 
 */
  
    // integers for incrementing speed, pausing, and writing to files 
    double tempNum = 0;
    int tempscore = 0;
    int pauseCount = 0;
    int g = -1;
    int u = -1;
    int t = -1;
    // player speed 
    int speedInc = 0;
    int playerSize = 50;
    int playerSpeed = 8 ;
    int playerXDirection =1;
    // player controls 
    boolean player1Up = false;
    boolean player1Down = false;
    Rectangle player1 = new Rectangle(WIDTH/2-playerSize/2, 695, playerSize,playerSize);
    // cube controls 
    int cubeSize = 100;
    int cubeSpeed = 5 ;
    boolean cubeHit = false;
    // cubes 
    Rectangle cube = new Rectangle(50, 25 , cubeSize,cubeSize);
    Rectangle cube2 = new Rectangle(200, 25, cubeSize, cubeSize); 
    Rectangle cube3 = new Rectangle(350, 25, cubeSize, cubeSize);
    Rectangle cube4 = new Rectangle(500, 25, cubeSize, cubeSize);
    Rectangle cube5 = new Rectangle(650, 25, cubeSize, cubeSize);
    // platform 
    Rectangle plat = new Rectangle(25,750,750,25);

    //score 
    int score = 0;
    boolean goingDown = true;
    // menus
    boolean start = false;
    boolean diffMenu = false;
    boolean gStart = false;
    boolean startSc = true;
    //start menu animation
    int pstartY = HEIGHT/2-87;
    int startY = HEIGHT/2-100;
    int ppressY = HEIGHT/2+10;
    int pressY = HEIGHT/2;
    // cube colors 
    Color purp = new Color(66,14,150);
    Color purpl = new Color(29,0,43);
   Color good = new Color(255,189,36);
   Color gooder = new Color(255,134,36);
   Color great = new Color(255,83,36);
   Color insane = new Color(255,36,36);
   Color best = new Color(255,36,186);
    //chooses cube 
    int blankCube =  (int)(Math.random()*(5 - 1 + 1))+ 1;
    // menu fonts 
    Font biggerFont = new Font("arial", Font.BOLD, 20);
    Font BigggerFont = new Font("arial", Font.BOLD, 45+score);
    Font menuFont = new Font("arial", Font.BOLD, 55);
     Font pauseFont = new Font("arial", Font.BOLD, 110);
     // gamemode highscores 
    int tempFs = 0;
    int Ehighscore = 0;
    int Hhighscore = 0;
    int Ihighscore = 0;
    int Hs = 0;
    int press = 0;
    // used for writing to the initials documents 
    String EInitials = "";
    String HInitials = "";
    String IInitials = "";
    // more booleans for game modes and menus
    boolean Easy = false;
    boolean Hard = false;
    boolean Insane = false;
    boolean pause = false;
    boolean pauseAvail = false;
    boolean rulesMenu = false;

    // GAME VARIABLES END HERE   

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public GameProject(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
//        g.clearRect(0, 0, WIDTH, HEIGHT);
//
//        // GAME DRAWING GOES HERE
//        // set colour to black
       // Start Menu
        if(startSc == true){
          g.setFont(menuFont);
          g.setColor(Color.BLACK);

          g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(purp);
          g.drawString("VOID: A GAME OF SKILL", WIDTH/2-330, pstartY);
          
           g.drawString("Press X to Start", WIDTH/2 - 191, ppressY);
          
          g.setColor(Color.WHITE);
            
          g.drawString("VOID: A GAME OF SKILL", WIDTH/2-320, startY);
          
          g.drawString("Press X to Start", WIDTH/2 - 180, pressY);
        }
          // Difficulty Menu
          if(diffMenu == true){
              g.setFont(biggerFont);
              g.setColor(Color.BLACK);
              
              g.fillRect(0, 0, WIDTH, HEIGHT);
              
             g.setColor(purp);
              
             g.drawString("PICK YOUR DIFFICULTY", WIDTH/2-130, 205);
              
              g.drawString("EASY || PRESS R || HS = " + Ehighscore + " || " + EInitials , WIDTH/2-165, 305);
              
              g.drawString("HARD || PRESS T || HS = " + Hhighscore + " || " + HInitials, WIDTH/2-165, 405);
              
              g.drawString("INSANE || PRESS Y || HS = " + Ihighscore + " || " + IInitials, WIDTH/2-175, 505);
              
               g.drawString("PRESS Q TO RETURN HERE", WIDTH/2-155, 605);
               
                g.drawString("PRESS S FOR CONTROLS AND RULES", WIDTH/2-195, 705);
                g.setColor(Color.BLACK);

              

              g.setColor(Color.WHITE);
              g.drawString("PICK YOUR DIFFICULTY", WIDTH/2-125, 200);
              
              g.drawString("EASY || PRESS R || HS = " + Ehighscore + " || " + EInitials, WIDTH/2-160, 300);
              
              g.drawString("HARD || PRESS T || HS = " + Hhighscore + " || " + HInitials, WIDTH/2-160, 400);
              
              g.drawString("INSANE || PRESS Y || HS = " + Ihighscore + " || " + IInitials, WIDTH/2-170, 500);
              
              g.drawString("PRESS Q TO RETURN HERE", WIDTH/2-150, 600);
              
              g.drawString("PRESS S FOR CONTROLS AND RULES", WIDTH/2-190, 700);
              
              
              
          }
          // rules menu 
          if(rulesMenu == true){
                    g.setFont(biggerFont);
              g.setColor(Color.BLACK);        
              g.fillRect(0, 0, WIDTH, HEIGHT);
              
               g.setColor(purp);
                     g.drawString("RULES ", WIDTH/2-55, 205);
              
              g.drawString("- The game will speed up every 10 points", WIDTH/2-305, 255);
              
              g.drawString("- Your highscore will be recored with a three letter name", WIDTH/2-305, 305);
              
               g.drawString("- Every 5 points = one pause", WIDTH/2-305, 355);
                g.drawString("- Using a pause consumes it", WIDTH/2-305, 405);
               
               g.drawString("- Enjoy the game :)", WIDTH/2-305, 455);
               
               g.drawString("CONTROLS", WIDTH/2-55, 555);
              
              g.drawString("- press Q to move backwards through the menus", WIDTH/2-305, 605);
              
              g.drawString("- A and D to move left and right", WIDTH/2-305, 655);
              
              g.drawString("- press W to pause ", WIDTH/2-305, 705);
              
                   g.setColor(Color.WHITE);
              g.drawString("RULES ", WIDTH/2-50, 200);
              
              g.drawString("- The game will speed up every 10 points", WIDTH/2-300, 250);
              
              g.drawString("- Your highscore will be recored with a three letter name", WIDTH/2-300, 300);
              
               g.drawString("- Every 5 points = one pause", WIDTH/2-300, 350);
                g.drawString("- Using a pause consumes it", WIDTH/2-300, 400);
               
               g.drawString("- Enjoy the game :)", WIDTH/2-300, 450);
               
               g.drawString("CONTROLS", WIDTH/2-50, 550);
              
              g.drawString("- press Q to move backwards through the menus", WIDTH/2-300, 600);
              
              g.drawString("- A and D to move left and right", WIDTH/2-300, 650);
              
              g.drawString("- press W to pause ", WIDTH/2-300, 700);
             
          }
       
          // Game Interface 
        if(start == true){
          g.setColor(purpl);
//        // draw black play surface
          g.fillRect(0, 0, WIDTH, HEIGHT);
//        
//        // switch to white
          g.setColor(Color.WHITE);
          
//       // draw platform 
          g.fillRect(plat.x,plat.y,plat.width,plat.height);
          // draw the players
          g.fillRect(player1.x, player1.y, player1.width, player1.height);
          
          g.setColor(purp);
          g.drawRect(player1.x,player1.y,player1.width,player1.height);
          g.setColor(Color.WHITE);
              g.setFont(BigggerFont);
          //draw score 
          tempFs = score; 
        // increases score size 
          if(score >= 10){
              tempFs = score*2;
          }
          
        
          
    
              g.setColor(Color.WHITE);
              // setting highscores 
              if(Easy == true){
                  Hs = Ehighscore;
              }
              if(Hard == true){
                  Hs = Hhighscore;
              }
              if(Insane == true){
                  Hs = Ihighscore;
              }
       // drawing highscore and score on screen 
          g.drawString(("" + score), WIDTH/2-(tempFs), HEIGHT/2-(score));
              g.setFont(biggerFont);
          g.drawString(("HIGHSCORE " + Hs), WIDTH/2-(60), HEIGHT/2+(200));
          //set the color of the cube 
               if(score>= 5){
                g.setColor(good);
            }
             
            if(score>= 10){
                g.setColor(gooder);
           
            }
            if(score>= 15){
                g.setColor(great);
        
            }
            if(score>= 20){
                g.setColor(insane);
        
            }
            if(score>= 25){
                g.setColor(best);

            }
             if(score>= 25){
                g.setColor(best);

            }
              if(score>= 30){
                g.setColor(Color.magenta);

            }
               if(score>= 35){
                g.setColor(Color.cyan);

            }
                if(score>= 40){
                g.setColor(Color.GREEN);

            }
                 if(score>= 45){
                g.setColor(Color.BLUE);

            }
                  if(score>= 50){
                g.setColor(Color.LIGHT_GRAY);

            }
                   if(score>= 55){
                g.setColor(Color.WHITE);

            }
                     if(score>= 60){
                g.setColor(good);
            }
             
            if(score>= 65){
                g.setColor(gooder);
           
            }
            if(score>= 70){
                g.setColor(great);
        
            }
            if(score>= 75){
                g.setColor(insane);
        
            }
            if(score>= 80){
                g.setColor(best);

            }
             if(score>= 85){
                g.setColor(best);

            }
              if(score>= 90){
                g.setColor(Color.magenta);

            }
               if(score>= 95){
                g.setColor(Color.cyan);

            }
                if(score>= 100){
                g.setColor(Color.GREEN);

            }
                 if(score>= 105){
                g.setColor(Color.BLUE);

            }
                  if(score>= 110){
                g.setColor(Color.LIGHT_GRAY);

            }
                   if(score>= 115){
                g.setColor(Color.WHITE);

            }
          // draws the 4 selected cubes          
          if(cubeHit == false){
              if(blankCube != 1){
          g.fillRect(cube.x ,cube.y, cube.width, cube.height);
              }
              
              if(blankCube != 2){
          g.fillRect(cube2.x, cube2.y,cube2.width,cube2.height);
              }
              if(blankCube != 3){
          g.fillRect(cube3.x, cube3.y,cube3.width,cube3.height);
              }
            if(blankCube != 4){
          g.fillRect(cube4.x, cube4.y,cube4.width,cube4.height);
            }
            if(blankCube != 5){
          g.fillRect(cube5.x, cube5.y,cube5.width,cube5.height);              
            }
          }
          // pause display 
       if(pause == true){
               g.setFont(pauseFont);
               
               g.setColor(purp);
                 g.drawString("PAUSED", WIDTH/2-235, 505);
             
               g.setColor(Color.WHITE);
               
                g.drawString("PAUSED", WIDTH/2-230, 500);
          }
 
        // GAME DRAWING ENDS HERE
        }
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Ay of your pre setup before the loop starts should go here
       // reads files for easy highscore  and easy initial 
try{
               FileReader Er = new FileReader("EScores.txt");
               BufferedReader Ear = new BufferedReader(Er);
               
               String str;
               while((str = Ear.readLine()) != null){
                   out.println(str + "\n");
                  Ehighscore = Integer.parseInt(str);
               }
            } catch (IOException e){
                out.println("error!");
            }
try{
               FileReader Er = new FileReader("EInitials.txt");
               BufferedReader Ear = new BufferedReader(Er);
               
               String str;
               while((str = Ear.readLine()) != null){
                   out.println(str + "\n");
                  EInitials = str.toUpperCase();
               }
            } catch (IOException e){
                out.println("error!");
            }
// reads the files for hard highscore and hard initial 
try{
               FileReader Hr = new FileReader("HScores.txt");
               BufferedReader Har = new BufferedReader(Hr);
               
               String stri;
               while((stri = Har.readLine()) != null){
                   out.println(stri + "\n");
                  Hhighscore = Integer.parseInt(stri);
               }
            } catch (IOException e){
                out.println("error!");
            }
try{
               FileReader Gr = new FileReader("HInitials.txt");
               BufferedReader Gar = new BufferedReader(Gr);
               
               String stri;
               while((stri = Gar.readLine()) != null){
                   out.println(stri + "\n");
                  HInitials = stri.toUpperCase();
               }
            } catch (IOException e){
                out.println("error!");
            }
// reads the insane highscore file and initial 
try{
               FileReader Ir = new FileReader("Iscores.txt");
               BufferedReader Inr = new BufferedReader(Ir);
               
               String strin;
               while((strin = Inr.readLine()) != null){
                   out.println(strin + "\n");
                  Ihighscore = Integer.parseInt(strin);
               }
            } catch (IOException e){
                out.println("error!");
            }
try{
               FileReader Kr = new FileReader("IInitials.txt");
               BufferedReader Kar = new BufferedReader(Kr);
               
               String strin;
               while((strin = Kar.readLine()) != null){
                   out.println(strin + "\n");
                  IInitials = strin.toUpperCase();
               }
            } catch (IOException e){
                out.println("error!");
            }
      
    }
    
// this function occurs whenever the cube hits the platform (score goes up) 
    public void resetCube(){
            cubeHit = true;  
                // picks a different cube and draws resets the cubes y pos 
                blankCube = (int)(Math.random()*(5 - 1 + 1))+ 1;
                cube.y = 25;   
              cube2.y = 25;
                cube3.y = 25;
                cube4.y = 25;
                cube5.y = 25;
                cubeHit = false;
               score = score +1;
               // used to calculate pause availability 
               tempNum = tempNum + 0.2;
               BigggerFont = new Font("arial", Font.BOLD, 45+(score*4));
     // used to increase the speed every 10 points 
                 if(score%10 == 0){
                            cubeSpeed = cubeSpeed +1;
               playerSpeed = playerSpeed +1;
                            
                        }
    }
    // this void occurs when the cube hits the player (resets the game) 
    public void gameReset(){
        
                cubeHit = true;
               
                 gStart = false;
     // checks the score and sees if it was greater than the previous highscore for easy mode 
     // if it was it will rewrite a new highscore and ask for new initials 
                 if(Easy == true){
                     
                 if(score > Ehighscore){
                     Ehighscore = score;
           
                        try{
                            // creates a file writer and print writer and names the text document 
                FileWriter Ew = new FileWriter("EScores.txt");
                PrintWriter Eaw = new PrintWriter(Ew);
                
                // prints the score to the document 
                Eaw.println(Ehighscore);
                
                Eaw.close();
            } catch (IOException e){
                out.println("error!");
            }
                        // loop to make sure the initials are only three letters long 
                    
                        t = -1;
                             while(t < 0){
                                // creates a jpane to collect information 
                       String input = JOptionPane.showInputDialog("Enter your initials");
                   if(input.length() > 0 && input.length() <= 3){ 
                       t++;
                          try{
                              // creates a filewriter like before and names the document for the modes initials 
                FileWriter Rw = new FileWriter("EInitials.txt");
                PrintWriter Rnw = new PrintWriter(Rw);
                Rnw.println(input);
                // always sets it to uppercase so that it shows up as uppercase in the game 
                EInitials = input.toUpperCase();
                
                Rnw.close();
            } catch (IOException e){
                out.println("error!");
            }
                   }else{
                       System.out.println("failed");
                   }
             
                 }
                 }
                }
                   // checks the score and sees if it was greater than the previous highscore for insane mode 
     // if it was it will rewrite a new highscore and ask for new initials 
                    if(Hard == true){
                 if(score > Hhighscore){
                     Hhighscore = score;
                        try{
                FileWriter Hw = new FileWriter("HScores.txt");
                PrintWriter Haw = new PrintWriter(Hw);
                
                Haw.println(Hhighscore);
                
                Haw.close();
            } catch (IOException e){
                out.println("error!");
            }
                 
                 u = -1;
                     while(u < 0){
                       String input = JOptionPane.showInputDialog("Enter your initials");
                   if(input.length() > 0 && input.length() <= 3){ 
                       u++;
                          try{
                FileWriter Zw = new FileWriter("HInitials.txt");
                PrintWriter Znw = new PrintWriter(Zw);
                Znw.println(input);
                
                HInitials = input.toUpperCase();
                
                Znw.close();
            } catch (IOException e){
                out.println("error!");
            }
                   }else{
                       System.out.println("failed");
                   }
                 }
                 }
                }
                     // checks the score and sees if it was greater than the previous highscore for insane mode 
     // if it was it will rewrite a new highscore and ask for new initials 
                       if(Insane == true){
                 if(score > Ihighscore){
                     Ihighscore = score;
                        try{
                FileWriter Iw = new FileWriter("IScores.txt");
                PrintWriter Inw = new PrintWriter(Iw);
                
                Inw.println(Ihighscore);
                
                Inw.close();
            } catch (IOException e){
                out.println("error!");
            }
                 
                g = -1; 
                 while(g < 0){
                       String input = JOptionPane.showInputDialog("Enter your initials");
                   if(input.length() > 0 && input.length() <= 3){ 
                       g++;
                          try{
                FileWriter Nw = new FileWriter("IInitials.txt");
                PrintWriter Nnw = new PrintWriter(Nw);
                
                Nnw.println(input);
                IInitials = input.toUpperCase();
                Nnw.close();
            } catch (IOException e){
                out.println("error!");
            }
                   }else{
                       System.out.println("failed");
                   }
                 }
                 }
   
                }
                       // resets all the speeds (because they might have increased) and resets the score 
                  score = 0;
                  if(Easy == true){
                       cubeSpeed = 10;
               playerSpeed =14;
                  }
                    if(Hard == true){
                       cubeSpeed = 13;
               playerSpeed =17;
                  }
                      if(Insane == true){
                       cubeSpeed = 16;
               playerSpeed =22;
                  }
                 
    }
    
    
    
    
    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
         
          
          
            
            // start menu animation, if it hits a specified value it will change the y direction and will bounce up and down 
    speedInc = speedInc + 1;
                int inc = 1;
                    if (goingDown == true){
  
                if (pstartY <= 300){
                goingDown = false;
                 pstartY = pstartY +inc;
                startY = startY +inc;
                ppressY = ppressY +inc;
                pressY = pressY +inc;
                 }
                 else {
                pstartY = pstartY -inc;
                startY = startY -inc;
                ppressY = ppressY -inc;
                pressY = pressY -inc; 
                }
                }
                else {

                if (pstartY >= 350){
                  goingDown = true;
               pstartY = pstartY -inc;
                startY = startY -inc;
                ppressY = ppressY -inc;
                pressY = pressY -inc;
                 }
                else {
                 pstartY = pstartY +inc;
                startY = startY +inc;
                ppressY = ppressY +inc;
                pressY = pressY +inc;
    }
}

   
                    // moves the cubes downwards by increasing their speed in the y direction 
            
            
  if(gStart == true){
       pauseAvail = true;
      if(pause == false){
           cube.y = cube.y + 1*cubeSpeed;
            
           cube2.y = cube2.y+1*cubeSpeed;
            
            cube3.y = cube3.y+1*cubeSpeed;
            
            cube4.y = cube4.y+1*cubeSpeed;
            
            cube5.y = cube5.y+1*cubeSpeed;
      }
      // if any of the cubes hit the players it will run the game reset function (explained above) 
        if(blankCube != 1){
            if(cube.intersects(player1)){
          gameReset();
            }
        }
           if(blankCube != 2){
             if(cube2.intersects(player1)){
                gameReset();
            }
           }
              if(blankCube != 3){
              if(cube3.intersects(player1)){
                gameReset();
            }
              }
              
                 if(blankCube != 4){
               if(cube4.intersects(player1)){
                gameReset();
            }
                 }
                 
                    if(blankCube != 5){
                if(cube5.intersects(player1)){
                gameReset();
            }
                // if the cubes hit the platform it will reset them (explained above) 
                    }
             if(cube.intersects(plat)){      
            resetCube();
            }
                  if(cube2.intersects(plat)){
            resetCube();
            }
                    if(cube3.intersects(plat)){
            resetCube();   
            }
                      if(cube4.intersects(plat)){
            resetCube();
            }         
                        if(cube5.intersects(plat)){
            resetCube();
            }
                        
                      
                      
  }
//            
            // boundaries for the player, stops its movements from going past the platform 
            if(player1.x >= 725){
                player1Up = false;
            }
            
            if(player1.x <= 25){
                player1Down = false;
            }
            // left and right movements for the player 
            if(pause == false){
              if(player1Up){
                  player1.x = player1.x + playerSpeed;
              }else if(player1Down){
                  player1.x = player1.x - playerSpeed;
              }
            }
              
             

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            }
        }
    }

    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
            
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
     // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
//            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is
            // player movements left and right 
            if(key == KeyEvent.VK_D){
                player1Up = true;
              gStart = true;
            }else if(key == KeyEvent.VK_A){
                player1Down = true;
                gStart = true;
            }
            // player menu
           if(key == KeyEvent.VK_X){
               diffMenu = true;
               startSc = false;
               press = 0;
             
               }
               
               
           // difficulty menu and game mode selection
           //easy mode 
           if(diffMenu == true){
           if(key == KeyEvent.VK_R){
               cubeSpeed = 10;
               playerSpeed =14;
               start = true;
               Easy = true;
               press = -1;
               gameReset();
       
           }
           // hard mode 
           if(key == KeyEvent.VK_T){
                  cubeSpeed = 13;
               playerSpeed =17;
               start = true;
               Hard = true; 
               press = 0;
               gameReset();
                   diffMenu = false;
           }
           // insane mode 
           if(key == KeyEvent.VK_Y){
                  cubeSpeed = 16;
               playerSpeed =22;
               start = true;
               Insane = true;
               press = 0;
               gameReset();
                   diffMenu = false;
           }
           // options menu 
              if(key == KeyEvent.VK_S){
             press = 0;
                   diffMenu = false;
                   rulesMenu = true;
           }
           }
           // this button allows the user to incrementally back through all the menus at the press of a single button
           if(key == KeyEvent.VK_Q){
               // uses a press counter to determine if where in the menus it is 
             press = press + 1;
            start = false;
            startSc = false;
            // moves from the game screen to the difficulty menu back and back to the start screen 
            if(startSc == false){
            if(press > 2){
                press = 2;
            }
            if(press == 1){
                diffMenu = true;
            }
            if(press == 2){
                 diffMenu = false;
                startSc = true;
            }
            Easy = false;
            Hard = false;
            Insane = false; 

            }
            // moves from the rules menu to the difficulty menu 
            if(diffMenu == true){
                if(press > 2){
                    press = 2;
                }
                if(press == 1){
                    rulesMenu = false;

                }
                if(press == 2){
                   startSc = true;
                    diffMenu  = false;
                }
            }
           }
           // this is the pause button, it keeps track of when the last pause was and resets the pause 'availability' integer 
            if(key == KeyEvent.VK_W){
               
  
             
                
                
              if(tempNum >= 1.0){
                     pauseCount = pauseCount + 1;
               if(pauseCount == 1){
               
                   pause = true; 
                
               }
               if(pauseCount == 2){
               
                   pause = false;
             
                   pauseCount = 0;
                     tempNum = 0;
                   }
             
              }
               
               
               
                
               
           }
           
           
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            // store the key being pressed
                int key = e.getKeyCode();
            // determine which key it is
            // key releasses for movement 
            if(key == KeyEvent.VK_D){
                player1Up = false;
             
            }else if(key == KeyEvent.VK_A){
                player1Down = false;
             
            }
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        GameProject game = new GameProject();
                
        // starts the game loop
        game.run();
    }
}