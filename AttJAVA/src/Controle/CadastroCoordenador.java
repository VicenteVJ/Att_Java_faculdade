package Controle;

import java.util.ArrayList;
import modelo.Coordenador;

public class CadastroCoordenador {
    private static ArrayList<Coordenador> Coordenadores = new ArrayList<>();
    
    public CadastroCoordenador(){
        
    }
    
     public static void setarDados(Coordenador co){
        CadastroProfessor.setarDados(co);
    }
}
