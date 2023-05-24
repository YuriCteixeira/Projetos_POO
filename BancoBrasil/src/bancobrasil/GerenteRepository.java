package bancobrasil;
import java.util.ArrayList;
public class GerenteRepository {
    public ArrayList<Gerente> gerente = new ArrayList<>();
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("yuric","12345","Yuri","Carvalho",""));
        gerente.add(new Gerente("teste","teste","","",""));
        
        return gerente;
    }
}
