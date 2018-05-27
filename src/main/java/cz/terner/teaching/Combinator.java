/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.teaching;

import java.util.Random;

/**
 *
 * @author terner
 */
public class Combinator {
    public static int ido = 0;
    public int id;
    public String kod;
    public String name;
    private static final int DELKAKOD = 15;
    private static final int DELKANAME = 7;
    private Random rand;
    
    public Combinator() {
        rand = new Random();
        id = ++ido;
        setKod();
        setName();
    }

    public String getKod() {
        return kod;
    }

    public String getName() {
        return name;
    }
    
     
    public int getId() {
        return id;
    }
    
    private void setKod() {
        String s = "";
        char ch;
        for (int i = 0; i < (DELKAKOD - 5); i++) {
            ch = (char) (rand.nextInt(26) + 65);
            s += ch;
        }
        int c = (rand.nextInt(1000) + 1000);
        s += "-" + c;
        kod = s;
    }
    
    private void setName() {
        String s = "";
        char ch;
        for (int i = 0; i < DELKANAME; i++) {
            ch = (char) (rand.nextInt(26) + 97);
            s += ch;
        }
        name = s;
    }
}
