/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualite_tp1;

import java.security.InvalidParameterException;

/**
 *
 * @author leperrot
 */
public class ManipulationString {

    public int sum(String s) {
        if(s == null){
            throw new InvalidParameterException();
        }
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += c;
        }
        return sum;
    }
    
    
}
