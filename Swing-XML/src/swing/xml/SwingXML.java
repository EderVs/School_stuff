/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing.xml;

import java.awt.EventQueue;

/**
 *
 * @author eder
 */
public class SwingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() 
            {
                Form Hola = new Form();
            }
        });
    }
    
}
