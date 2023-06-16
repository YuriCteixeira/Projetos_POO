package babydev;
import java.util.ArrayList;
public class RepositorioAdmin {   
  ArrayList<Admin> admin = new ArrayList<>();
  
  
    public ArrayList<Admin> addAdmin(){
        admin.add(new Admin("Allison"));
        admin.add(new Admin("teste"));
        
        return admin;
    }
}
