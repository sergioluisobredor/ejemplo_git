/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author 72056079
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento de la posicion "+i));
        }
        
        for(int i=4;i>=0;i--){
            JOptionPane.showMessageDialog(null, arr[i]);
        }
    
    
    }
    
    
    
}
