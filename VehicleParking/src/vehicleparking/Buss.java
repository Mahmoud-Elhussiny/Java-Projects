package vehicleparking;
public class Buss extends Vehicle{
    private int length;
    private int prize;
    
    
    Buss(){
        length=10;
        prize=15;
    }
    

    @Override
    public double Prize(double hour) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return hour*prize;
    
    }

    @Override
    public int length() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return length;
    }
}
