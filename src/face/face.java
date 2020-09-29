package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class face {
    private int px,py,diameter;
    private Color color;
    private Graphics g;
    
    
    public face(Graphics g, int x,int y){
        
        px=x;
        py=y;
        
        this.g = g;
        
        diameter =100;
        color=Color.red;
        
    }
    public void setColor(Color c){
    color = c; 
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
        g.setColor(Color.black);
        g.fillOval(px+diameter/10,py+diameter/4,diameter/4,diameter/4);
        g.fillOval(px+diameter/2+diameter/10,py+diameter/4,diameter/4,diameter/4);
        
    }
    private void drawMouth(){
        g.setColor(Color.black);
        g.drawLine(px+(diameter/8),py+(diameter*2/4),px+(diameter/5),py+(diameter*2/3));
        g.drawLine(px+(diameter-(diameter*1/8)),py+(diameter*2/4),px+(diameter-(diameter*1/4)),py+(diameter*2/3));
        g.drawLine(px+(diameter/5),py+(diameter*2/3),px+(diameter-(diameter*1/4)),py+(diameter*2/3));

    }
    private void drawfrown(){
        g.setColor(Color.black);
        g.drawLine(px+(diameter/8),py+(diameter*3/4),px+(diameter/5),py+(diameter*2/3));
        g.drawLine(px+(diameter-(diameter*1/8)),py+(diameter*3/4),px+(diameter-(diameter*1/4)),py+(diameter*2/3));
        g.drawLine(px+(diameter/5),py+(diameter*2/3),px+(diameter-(diameter*1/4)),py+(diameter*2/3));
    }
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
    }
    
}
