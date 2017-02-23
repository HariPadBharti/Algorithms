//Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

//We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class triplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int acount = 0;
        int bcount = 0;
        if(a0<=100 && a1<=100 && a2<=100 && b0<=100 && b1<=100 && b2<=100 && a0>=1 && a1>=1 && a2>=1 && b0>=1 && b1>=1 && b2>=1)
            {
            if(a0<b0)
                bcount+=1;
            if(b0<a0)
                acount+=1;
            
            if(a1>b1)
                acount+=1;
            if(b1>a1)
                bcount+=1;
            
            if(a2>b2)
                acount+=1;
            if(b2>a2)
                bcount+=1;
            
                
            
        }
        System.out.println(acount + " " + bcount);
        
    }
}

