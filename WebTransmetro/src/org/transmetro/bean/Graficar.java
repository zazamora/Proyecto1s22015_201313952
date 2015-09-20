package org.transmetro.bean;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Graficar {
	private File texto;
    public Graficar(){
        
    }
    public void archivoGraphviz(String codigo1, String nombre) {
        try {
            String path = nombre + ".txt";
            texto = new File(path);
            FileWriter writer = new FileWriter(texto);
            BufferedWriter buf = new BufferedWriter(writer);
            buf.write(
                    codigo1
                    
            );
            buf.flush();
            buf.close();
            writer.close();
            generar(nombre);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void graficaAVL(String entrada){
        String texto = "";
        texto += "digraph grafica{\n";
        texto += "rankdir = TB; \n";
        texto += "node [shape = record, style = filled, colorfill = seashell2]; \n";
        texto += "splines = line;\n";
        /*----------SUB GRAPH---------*/
        texto += "subgraph cluster_L {\n";
        texto += "node [ style = filled];\n";
        texto += "label = \"GRAFO AVL\"; \n";
        texto += "color = red\n";
        texto += entrada;
        texto += "}\n";
        /*--------------------------------------------------------------------------------------------------*/
        texto += "}";
        archivoGraphviz(texto, "grafoAVL");
    }
    public void generar(String nombre) {
        try{
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = nombre + ".txt";
            String fileOutputPath = nombre + ".jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String [] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);
        }catch(Exception e){

        }
    }
}
