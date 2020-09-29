package Lucky7;

import java.util.Scanner;

public class DiceMain {
static int i=1,maxm,maxr;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("How many dollars do you have? ");
        int mon = s.nextInt();
        dice d1 = new dice();
        dice d2 = new dice();
        
        if(mon>0){
            maxm=mon;
            maxr=1;
        while(mon>0){
            mon-=1;
            i += 1;
            d1.roll();
            d2.roll();
            if(d1.getNum() + d2.getNum()==7){
                mon+=4;
            }
            if(mon>maxm){
                maxm=mon;
                maxr=i;
        }
        }
        }
        
        else{
            System.out.println("Not enough money to play");
        }
        
        System.out.format("You broke after %d rolls.\n",i);
        System.out.format("You should have quit after %d rolls when you had $%d\n",maxr,maxm);

    }
    
}
