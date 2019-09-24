/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallojavamitforeach;

import java.util.*;
/**
 *
 * @author seigl
 */
public class HalloJavamitForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList();

        list.add("hallo");
        list.add("grias di");
        list.add("geht denn");

        for (String string : list) {
            System.out.println(string);
        }
        
    }
}
