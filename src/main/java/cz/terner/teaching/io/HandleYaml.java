/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.terner.teaching.io;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import cz.terner.teaching.Combinator;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author terner
 */
public class HandleYaml {
    private YamlWriter yw;
    
    public HandleYaml() {
        
    }
    
    public void writeMapAndList(Map m, List l) throws IOException {
        yw = new YamlWriter(new FileWriter("myMap-myList.yml"));
        yw.write(m);
        yw.write(l);
        yw.close();
    }
    
    public void writeList(List<Combinator> list) throws IOException {
        yw = new YamlWriter(new FileWriter("output.yml"));
        
        for(Combinator l : list) {
            //yw.getConfig().setClassTag("combinator", Combinator.class);
            yw.write(l);
        }
        
        
        yw.close();
    }
    
    public void loadCombi() throws IOException {
        YamlReader yr = new YamlReader(new FileReader("output.yml"));
        while(true) {
            Combinator com = yr.read(Combinator.class);
            if(com == null) break;
            System.out.printf("%03d - combi.name: %s%n", com.id, com.getName());
        }
    }
    
}
