/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.security.InvalidParameterException;
import static org.junit.Assert.assertThat;

import org.junit.*;
import static org.hamcrest.MatcherAssert.*;
import org.hamcrest.core.*;
import static org.junit.Assert.fail;



import qualite_tp1.ManipulationString;

/**
 *
 * @author leperrot
 */
public class ManipulationStringTest {
    
    private ManipulationString ms;
    
    @Before
    public void setUp() {
        ms = new ManipulationString();
    }
    
    @Test
    public void sumTest(){
        int expected = 100;
        assertThat(expected,IsEqual.equalTo(ms.sum("d")));
        expected = 265;
        assertThat(expected,IsEqual.equalTo(ms.sum("Add")));
        /*try{
           ms.sum(null);
        }catch(InvalidParameterException e){
            System.err.println("Erreur InvalidParameter");
        }catch(Exception f){
            fail(f.getMessage());
        }*/
    } 
    
    @Test (expected=java.security.InvalidParameterException.class)
    public void sumTestEx() throws Exception{
        ms.sum(null);
    }
    
}
