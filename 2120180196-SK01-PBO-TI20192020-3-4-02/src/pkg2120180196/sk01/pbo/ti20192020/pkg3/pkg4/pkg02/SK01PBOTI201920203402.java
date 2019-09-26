/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180196.sk01.pbo.ti20192020.pkg3.pkg4.pkg02;

/**
 *
 * @author User1
 */
public class SK01PBOTI201920203402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k;
        int x = 9;
        int a = 2;
        for ( i = 1; i<=x; i++){
          for ( j= x; j>= i;j--){
            System.out.print(" ");
        }
        for (k= 1;k<=i;k++){
            System.out.print(a);
        }
        System.out.println();
        }
    }
    
}
