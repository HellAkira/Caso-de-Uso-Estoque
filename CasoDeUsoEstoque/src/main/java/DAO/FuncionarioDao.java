package DAO;
import Pojo.*;
import FakeDB.*;
import java.util.*;

public class FuncionarioDao {
    
    public FuncionarioDao(){
        FakeDBFuncionario.getFuncionario();
    }
  
    public void create(FuncionarioPojo pojo){
        FakeDBFuncionario.getFuncionario().add(pojo);
    }
    
    public FuncionarioPojo read(int funcionarioID){

        return this.search(funcionarioID);
        
    }
    
    public ArrayList<FuncionarioPojo> readAll(){
        
        return FakeDBFuncionario.getFuncionario();
      
    }
    
    public void update(FuncionarioPojo pojo){
                
        FuncionarioPojo Busca = this.search(pojo.getFuncionarioID());
        
        FakeDBFuncionario.getFuncionario().remove(Busca);
        FakeDBFuncionario.getFuncionario().add(pojo);
           
    }
    
    public void delete(int funcionarioID){
        
        FuncionarioPojo Busca = this.search(funcionarioID);
        
        FakeDBFuncionario.getFuncionario().remove(Busca);
    }
    
    private FuncionarioPojo search(int id){
        
        return FakeDBFuncionario.getFuncionario()
                .stream()
                .filter(c -> c.getFuncionarioID() == id)
                .findFirst()
                .orElse(null);
        
    }
    
}