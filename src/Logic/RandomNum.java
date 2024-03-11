/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Logic;

import java.util.Random;

/**
 *
 * @author truon
 */
public class RandomNum {
    private String str;
    
    public RandomNum(){
    }
    
    public RandomNum(String s){
        str = s;
    }
    
    public boolean isNumeric() {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public String num() {
        double n = Double.parseDouble(str);
        String strNum = "";
        
        if(n <= 0){
            strNum = "";
        }else{
            Random rd = new Random();
            for(double i = 0; i < n; i++){
                int r = rd.nextInt(10);
                if (r == 0 && i == 0){
                    r = rd.nextInt(9) + 1;
                    strNum = strNum + r;
                }else{
                    strNum = strNum + r;
                }
            }
        }
        
        return strNum;
    }
    
    public boolean notNegativeNum(){
        double n = Double.parseDouble(str);
        return n > 0;
    }
}
