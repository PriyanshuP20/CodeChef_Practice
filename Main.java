package com.codechef;
import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int a =0 ; a< T ; a++){
            int N = sc.nextInt();
            int[] attack =new int[N+2];
            int[] defence =new int[N+2];

            for(int i = 1; i<N+1 ; i++){
                attack[i] = sc.nextInt();
            }
            attack[0] = attack[N];
            attack[N+1] = attack[1];
            for(int j = 1; j< N+1 ; j++){
                defence[j] = sc.nextInt();
            }
            defence[0] = defence[N];
            defence[N+1] = defence[1];
            int best_def = 0;
            for(int k = 1 ; k< N+1 ; k++){

                if(defence[k] > (attack[k-1] + attack[k+1])){
                    if(best_def< defence[k]){
                        best_def = defence[k];
                    }
                }

            }
            if(best_def != 0){
                System.out.println(best_def);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}

