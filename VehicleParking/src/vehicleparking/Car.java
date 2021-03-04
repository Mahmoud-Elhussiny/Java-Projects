package vehicleparking;
public class Car extends Vehicle{
    private int length;
    private int prize;
    
    
    Car(){
        length=5;
        prize=10;
    }
    
    @Override
    public double Prize(double hour) {
        return prize*hour;
    }
    
    @Override
    public int length() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       return length;
    }
    
}
