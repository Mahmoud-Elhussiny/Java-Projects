package vehicleparking;
public class Motocycle extends Vehicle{
    private int length;
    private int prize;
    
    
    Motocycle(){
        length=2;
        prize=5;
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
