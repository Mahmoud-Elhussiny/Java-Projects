package vehicleparking;
public class Truck extends Vehicle{
    private int length;
    private int prize;
    
    
    Truck(){
        length=7;
        prize=15;
    }

    @Override
    public int length() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return length;
    }

    @Override
    public double Prize(double hour) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return prize*hour;
    }

}
