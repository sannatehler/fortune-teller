package se.nackademin;

import static java.lang.Math.E;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;
    private int A;
    private int B;
    private int C; 

    public int calculateA() {
        //TODO: calculate A
        int A = 1;
        
        int x = name.length();
        String name2 = name.replace(" ","");
        int y = name2.length();
        
        int z = x - y;
        A = A + z;
        //for (char x : name) 
        //{   
        //    if( x == 32 ) {
        //        A = A + 1;
        //    }                
        //}               
        
        A = A + age;
                
        while(A > 9) {
            A = A -7;
        }                

        return A;
    }

    public int calculateB() {
        //TODO: calculate B
        
        int B = location.length();
        B = B + income;
        while(B > 9){
               B = B - 7 ;
        }        
        
        
        
        return B;
    }

    public int calculateC() {
        //TODO: calculate C
        A = calculateA();
        B = calculateB();
        
        int C = A + B;
        C = C - height;        
        while(C < 0){
            C = C + 10;
        }
    
        return C;
    }

    public int calculateD() {
        //TODO: calculate D
        A = calculateA();
        B = calculateB();
        C = calculateC();
        
        int D;
      
        if(A > 5){
            D = A + B;
        }else{
            D = A + C;
        }  
        
        D = D - income;
        
        while(D < 0){
            D = D + 10;
        }
        return D;
    }

    public int calculateE() {
        //TODO: calculate E
        
        double E = age*income*income*height; 
        
        E = Math.sqrt(E);
        
        while(E >= 10){
            E = E/2;
            System.out.println(E);
        }
        
        if (E > 9) {
            E = 9;
        }
        
        E = Math.round(E);
        
        return (int) E;
                
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
