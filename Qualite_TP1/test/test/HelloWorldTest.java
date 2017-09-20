package test;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import qualite_tp1.HelloWorld;

/**
 *
 * @author leperrot
 */
public class HelloWorldTest {
    
    @Test
    public void test(){
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.hello(), "HelloWorld");
        assertNotNull(hw.hello());
    }
}
