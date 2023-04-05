import java.util.ArrayList;
import java.io.*;
public class agenda {
    public ArrayList<appuntamento>appuntamenti;
    String nome;
    public agenda(String nome){
        this.nome=nome;
        appuntamenti=new ArrayList<appuntamento>();
    }

    
    public void aggiungiAppuntamento(appuntamento a){
        appuntamenti.add(a);
    }
    public void rimuoviAppuntamento(appuntamento a){
        appuntamenti.remove(a);
    }
    public boolean aggiuniAppdaFile(appuntamento a) {
        return true;
    }
}
