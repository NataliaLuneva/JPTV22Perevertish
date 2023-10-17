/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22perevertish;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV22Perevertish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите слово: ");
        scanner.nextLine();
        String strUser = scanner.nextLine();
        char[] arrayChar = strUser.toCharArray();
        char[] invertedArrayChar = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++){
            invertedArrayChar[arrayChar.length-1-i] = arrayChar[i];
        }
        String invertedWord = new String(invertedArrayChar);
        System.out.println("Перевернутое слово: " + invertedWord);
        
        
    }
    
}
