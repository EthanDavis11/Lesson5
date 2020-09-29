package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class face {
    private int px,py,diameter;
    private Color color,ec;
    private Graphics g;
    
    
    public face(Graphics g, int x,int y){
        
        px=x;
        py=y;
        
        this.g = g;
        
        diameter =100;
        color=Color.red;
        ec=Color.black;
        
    }
    public void setColor(Color c){
    color = c; 
        }
    public void setEColor(Color c){
    ec = c; 
        }
    
    
    public void draw(boolean m){
        drawHead();
        drawEyes();
        if(m==true){
        drawMouth();
        }
        if(m==false){
            drawfrown();
        }
        

    }
    public void move(int x,int y){
        px=x;
        py=y;
             
    }
    public void reSize(int x){
        diameter =x;
    }
    
    private void drawHead(){
        g.setColor(color);
        g.fillOval(px,py,diameter,diameter);
    }
    private void drawEyes(){
        g.setColor(ec);
        g.fillOval(px+diameter/10,py+diameter/4,diameter/4,diameter/4);
        g.fillOval(px+diameter/2+diameter/10,py+diameter/4,diameter/4,diameter/4);
        
    }
    private void drawMouth(){
        g.setColor(Color.black);
        g.drawLine(px+(diameter/8),py+(diameter*2/3),px+(diameter/5),py+(diameter*3/4));
        g.drawLine(px+(diameter-(diameter*1/8)),py+(diameter*2/3),px+(diameter-(diameter*1/4)),py+(diameter*3/4));
        g.drawLine(px+(diameter/5),py+(diameter*3/4),px+(diameter-(diameter*1/4)),py+(diameter*3/4));

    }
    private void drawfrown(){
        g.setColor(Color.black);
        g.drawLine(px+(diameter/8),py+(diameter*4/5),px+(diameter/5),py+(diameter*3/4));
        g.drawLine(px+(diameter-(diameter*1/8)),py+(diameter*4/5),px+(diameter-(diameter*1/4)),py+(diameter*3/4));
        g.drawLine(px+(diameter/5),py+(diameter*3/4),px+(diameter-(diameter*1/4)),py+(diameter*3/4));
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
    }
    
}
