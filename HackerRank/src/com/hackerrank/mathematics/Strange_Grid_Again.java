package com.hackerrank.mathematics;
import java.util.Scanner;

/**
 * Solution for Strange Grid Again from hacker rank.
 * 
 * Category - Maths Fundamentals
 * 
 * {@link https://www.hackerrank.com/challenges/strange-grid/problem}
 * 
 * @author harishav
 *
 */
public class Strange_Grid_Again {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        long row = sc.nextInt();
        int column = sc.nextInt();
        
        System.out.println(calculateValue(row,column));
        
        sc.close();
    }
    
    private static long calculateValue(long row, int column){
        if(row%2 == 0){
            return ((row/2)-1)*10 + 2*(column-1) + 1;
        } else {
            return ((row-1)/2)*10 + 2*(column-1);
        }
    }
}
