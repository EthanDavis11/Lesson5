
package Lucky7;

public class dice {
    private int num;
    
    public dice(int num) {
        this.num = num;
    }

    public dice() {
        this(0);
    }
    
    public void roll(){
        num = (int)(Math.random() * 6) + 1;
    }
    
    public int getNum() {
        return num;
}
}
