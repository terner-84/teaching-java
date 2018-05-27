/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.teaching;

import cz.terner.teaching.io.HandleYaml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author terner
 */
public class Hello {
    public static void main(String[] args) throws IOException {
//        List<Combinator> lico = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            lico.add(new Combinator());
//        }

        Map<Integer, Character> myMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            myMap.put(i, (char) (i + 97));
        }
        
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add("Můj string " + i);
        }
        
        HandleYaml hy = new HandleYaml();
        hy.writeMapAndList(myMap, myList);
    }
}
