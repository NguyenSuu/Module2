package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many number primes do you want display?");
        int num=scanner.nextInt();
        int count=0,tempt=0;
        for(int i=2;;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
                tempt++;
            }
            if(tempt==num){
                break;
            }
            count=0;
        }
    }
}
