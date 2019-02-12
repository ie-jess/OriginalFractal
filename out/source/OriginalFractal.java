import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
  
  background(0);
  rectMode(CENTER);
}
public void draw()
{
  smol(250,100,150);
  smol(250,150,150);
  smol(250,200,150);
  smol(250,250,150);
  smol(250,300,150);
  smol(250,350,150);
  smol(250,400,150);
}
public void smol(int x, int y, int siz)
{
  noFill();
  ellipse(x,y,siz,siz);
  
  if(siz > 10){
    stroke(random(255),random(255),random(255));
    strokeWeight(random(5));
    smol(x- siz,y,siz/2);
    stroke(random(255),random(255),random(255));
    strokeWeight(random(5));
    smol(x+siz,y,siz/2);
  }
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
