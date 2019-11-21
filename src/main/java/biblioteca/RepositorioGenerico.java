package biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class RepositorioGenerico <T extends Elemento>{
    
    public final String SEPARATOR ="-";
    private String filename;
    
    public RepositorioGenerico(String file){
        this.filename=file;
    }
    
    public void salvar(ArrayList<T> elementos){
        try{
            File file = new File(filename);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            
            PrintWriter pw = new PrintWriter(fw);
           
            for (int x = 0; x<elementos.size(); x++) {
                
                String linha = getRegistro(elementos.get(x));
                pw.println(linha);
            }
            pw.close();
        } catch(Exception e){
            e.getMessage();
        }  
    }
    
    public ArrayList<T> restaurar(){
        try {
            File file = new File(filename);
            file.createNewFile();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String c;
            ArrayList<T> elementos = new ArrayList<T>();
            while((c = br.readLine()) != null){
                T e = getInstance(c);
                elementos.add(e);
            }
            br.close();;
            return elementos; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
    
    abstract String getRegistro(T e);
    
    abstract T getInstance(String st);
}
