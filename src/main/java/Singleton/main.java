package Singleton;

import static java.util.Currency.getInstance;

public class main {

    public static void main(String[] args) {

        DBConnection s1=DBConnection.getInstance();
        DBConnection s2=DBConnection.getInstance();

        if(s1==s2){
            System.out.println("Both are same instances");
        }else{
            System.out.println("Different instances");
        }


    }
}
