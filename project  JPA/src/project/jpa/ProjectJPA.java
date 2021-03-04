package project.jpa;

import java.util.Scanner;

class ProjectJPA { 
   
    static Scanner in = new Scanner(System.in);
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        double nambers, nsub,test1;
        int test;
        int sum = 0;
        
      
        while(true){
            System.out.print("Enter the student namber : ");
            nambers = in.nextDouble();
            test = (int) nambers ;
            test1 = nambers - test ;
            if(nambers<=0 || test1 !=0 )
                System.out.println("error you shoud enter positive intger");
            else
                break;
        }        
        
        student nams[] = new student[test];
        
        for (int i = 0; i < nambers; i++) {
            nams[i] = new student();
            System.out.print("Enter name student " + (i + 1) + " ");
            nams[i].nam = inp.nextLine();
            System.out.print("Enter id student " + (i + 1) + " ");
            while(true){
                int y=0;
                nams[i].id = inp.nextLine();
                for(int j=0;j<i;j++){
                    if(nams[j].id.equals(nams[i].id)){
                        System.out.println("There is the same ID\nEnter the Different ID");
                        y=1;
                    }
                }
                if(y==0)
                    break;
            }
        }
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        
        int test2 ;
        double test3;
        while(true){
        System.out.print("Enter the subjects namber : ");
            nsub = in.nextDouble();
            test2 = (int) nsub ;
            test3 = nsub-test2 ;
            if(nsub<=0 || test3!=0)
                System.out.println("error you shoud enter positive intger");
            else
                break;
        }
        
        double hour1,hour2 ;
        int h;
        subject[] cod = new subject[test2];
        for (int i = 0; i < nsub; i++) {
            cod[i] = new subject();
            System.out.print("Enter code subject  " + (i + 1) + " ");
            
            while(true){
                int y=0;
                cod[i].code = inp.nextLine();
                for(int j=0;j<i;j++){
                    if(cod[j].code.equals(cod[i].code)){
                        System.out.println("There is the same ID\nEnter the Different ID");
                        y=1;
                    }
                }
                if(y==0)
                    break;
            }
            
            System.out.print("Enter name subject " + (i + 1) + " ");
            cod[i].name = inp.nextLine();
            while(true){
                System.out.print("Enter hour subject " + (i + 1) + " ");
                
                hour1 = in.nextDouble();
                h = (int) hour1 ;
                hour2 = hour1 - h;
                if(hour1 <= 0 || hour2 != 0)
                     System.out.println("error you shoud enter  positive intger hour ");
                else
                    break;
            }
            cod[i].hour = h;
            sum += cod[i].hour;
        }
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        
        grade scr[][] = new grade[test][test2];

        for (int i = 0; i < nambers; i++) {
            System.out.println("enter grads of the student " + nams[i].nam);
            for (int j = 0; j < nsub; j++) {
                scr[i][j] = new grade();
                System.out.print("enter grade subject  " + cod[j].name + " ");
                scr[i][j].scor = in.nextDouble();
                
                if (scr[i][j].scor > 100 || scr[i][j].scor < 0) {
                    System.out.println("Error,enter the scor betwen 0 : 100 \n enter the grade again");
                    j--;
                } else if (scr[i][j].scor >= 90) {
                    scr[i][j].jpa = 4;
                } else if (scr[i][j].scor >= 85) {
                    scr[i][j].jpa = 3.7;
                } else if (scr[i][j].scor >= 80) {
                    scr[i][j].jpa = 3.3;
                } else if (scr[i][j].scor >= 75) {
                    scr[i][j].jpa = 3;
                } else if (scr[i][j].scor >= 70) {
                    scr[i][j].jpa = 2.7;
                } else if (scr[i][j].scor >= 65) {
                    scr[i][j].jpa = 2.3;
                } else if (scr[i][j].scor >= 60) {
                    scr[i][j].jpa = 2;
                } else if (scr[i][j].scor >= 55) {
                    scr[i][j].jpa = 1.7;
                } else if (scr[i][j].scor >= 50) {
                    scr[i][j].jpa = 1.3;
                } else if (scr[i][j].scor >= 45) {
                    scr[i][j].jpa = 1;
                } else {
                    scr[i][j].jpa = 0;
                }

            }
        }
        double toutel;
        for(int i=0;i<nambers;i++){
            toutel =0;
            for(int j=0;j<nsub;j++){
                toutel += (scr[i][j].jpa*cod[j].hour) ;
            }
            nams[i].tjpa= toutel/sum ;
        }
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
        
        
        for(int i=0;i<nambers;i++){
            System.out.println("JPA of Student :  " + nams[i].nam);
            for(int j=0;j<nsub;j++){
                System.out.print( "jpa " + cod[j].name + " = " + scr[i][j].jpa + "\t\t");
            }
            
            System.out.println("Toutal JPA = " + nams[i].tjpa);
            
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        }
        
    }

}
