package vehicleparking;
import java.util.*;
public class VehicleParking {
    static Scanner in = new Scanner(System.in);
    public static String[]garage = new String[100];
    
    
    static void Creat (){
       System.out.println("Enter the ID of vehicle"); 
       String id;
       id=in.next();
       for(int i=0;i<100;i++){
           if(id.equals(garage[i])){
               System.out.println("Error,There is the same ID ");
               return;
           }
               
       }
       
       int t=1;
       while(t==1){
           
             Scanner inp = new Scanner(System.in);
            System.out.println("1: If the vehicle is a bus ");
            System.out.println("2: If the vehicle is a truck ");
            System.out.println("3: If the vehicle is a car ");
            System.out.println("4: If the vehicle is a motorcycle ");

            int n,test=0,c=0;
            n=inp.nextInt();

            switch(n){
                     case 1:{
                         t=0;
                         Buss B = new Buss();
                         for(int i=0;i<100;i++){
                             if(".".equals(garage[i])){
                                 test++;
                             }
                             else
                                 test=0;

                             if(test==B.length()){
                                 for(int j=i;j>i-test;j--){
                                     garage[j]=id;
                                 }
                                 c=1;
                                 break;
                             }
                         }
                         if(c==0)
                             System.out.println("There is no place to expand this vehicle ");
                         break;
                     }
                     case 2:{
                         t=0;
                         Truck T = new Truck();
                         for(int i=0;i<100;i++){
                             if(".".equals(garage[i])){
                                 test++;
                             }
                             else
                                 test=0;

                             if(test==T.length()){
                                 for(int j=i;j>i-test;j--){
                                     garage[j]=id;
                                 }
                                 c=1;
                                 break;
                             }
                         }
                         if(c==0)
                             System.out.println("There is no place to expand this vehicle ");
                         break;
                     }
                     case 3:{
                         t=0;
                         Car C = new Car();
                         for(int i=0;i<100;i++){
                             if(".".equals(garage[i])){
                                 test++;
                             }
                             else
                                 test=0;

                             if(test==C.length()){
                                 for(int j=i;j>i-test;j--){
                                     garage[j]=id;
                                 }
                                 c=1;
                                 break;
                             }
                         }
                         if(c==0)
                             System.out.println("There is no place to expand this vehicle ");
                         break;
                     }
                     case 4:{
                         t=0;
                         Motocycle M = new Motocycle();
                         for(int i=0;i<100;i++){
                             if(".".equals(garage[i])){
                                 test++;
                             }
                             else
                                 test=0;

                             if(test==M.length()){
                                 for(int j=i;j>=i-test;j--){
                                     garage[j]=id;
                                 }
                                 c=1;
                                 break;
                             }
                         }
                         if(c==0)
                             System.out.println("There is no place to expand this vehicle ");
                         break;
                     }
                     default:{
                         System.out.println("You must enter a number from the list ");
                     }
                 }
       }
       
    }
    
    static void remove(){
        int u=0;
        for(int i=0;i<100;i++){
            if(garage[i].equals('.'))
                u++;
                
        }
        if(u==100){
            System.out.println("The garage is empty ");
            return;
        }
        
         System.out.println("Enter the ID vehicle ");
         String id;
         int t=0;
         id=in.next();
         for(int i=0;i<100;i++){
           if(id.equals(garage[i])){
               t=1;
               break;
           }    
         }
        
         if(t==0){
             System.out.println("This vehicle is not available in the garage");
             return;
         }
         
        System.out.println("How many hours this vehicle stay in this garage ");
        int h = 0,count=0,k=1,r;
        while(k==1){
            r=0;
             Scanner n = new Scanner(System.in);
        try{
            
          h = n.nextInt();
          if(h<=0){
              r=1;
              throw new Exception();
          }
        
        }
        catch(Exception e){
            r=1;
            System.out.println("You Shoud Input Postive Intger Namber ");
        }
        
        if(r==0)
            k = 0;
        
        }
        for(int i=0;i<100;i++){
            if(id.equals(garage[i])){
                count++;
                garage[i]=".";
            }
        }
        
        switch (count) {
            case 2:
                Motocycle M=new Motocycle();
                System.out.println("You shoude pay the amount of  " +M.Prize(h)+" $$" );
                break;
            case 5:
                Car C=new Car();
                System.out.println("You shoude pay the amount of  " +C.Prize(h)+" $$" );
                break;
            case 7:
                Truck T = new Truck();
                System.out.println("You shoude pay the amount of  " +T.Prize(h)+" $$" );
                break;
            case 10:
                Buss B = new Buss();
                System.out.println("You shoude pay the amount of  " +B.Prize(h)+" $$" );
                break;
            default:
                break;
        }
            
        
    }
    
    static void Stutes(){
        int c=0;
        for(int i=99;i>=0;i--){
            if(garage[i].equals("."))
                c++;
            else{
                if(c>0){
                    System.out.println("this is "+ c+ "meters free");
                }
                c = 0;
            }
        }
        
        if(c>0)
             System.out.println("this is "+ c+ "meters free");
    }
    
    public static void main(String[] args) {
        for(int i=0;i<100;i++)
            garage[i]=".";
     
       int t=1; 
       while(t==1){
            Scanner inp = new Scanner(System.in); 
          
       System.out.println("1: add vehicle ");
       System.out.println("2: remove vehicle ");
       System.out.println("3: state of garage ");
       System.out.println("4: exit of program ");
       
       try{
           
       int num;
       num=inp.nextInt();
       
       
            switch(num){
                case 1:{
                    Creat();
                    break;
                }
                case 2:{
                    remove();
                    break;
                }
                case 3:{
                    Stutes();
                    break;
                }
                case 4:{
                    System.out.println("Thank you for use this program");
                    t=0;
                    break;
                }
                default:{
                    System.out.println("You must enter a number from the list ");
                }
            }
            }
       catch(InputMismatchException e){
           System.out.println("You Mast Input Intger Namber");
       }
            
       }
       
    }
    
}
