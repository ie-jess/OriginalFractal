public void setup()
{
  size(500,500);
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
