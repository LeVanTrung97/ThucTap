/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author USER
 */
public class MinAndMax {
  static int arr[] = {1, 3, -9, 0, 8, 167, 23};
     
    public static void main(String[] args) {
 
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i]; if(min > arr[i])
            min = arr[i];
        }
        System.out.println("Giá trị lớn nhất là " + max);
        System.out.println("Giá trị nhỏ nhất là " + min);
    }
}
