
package CasoDeUsoEstoque;

import Service.FuncionarioService;

public class Principal {
    
    public static void main(String[] args) {
        
        FuncionarioService servico = new FuncionarioService();
      
        servico.exibirMenu();
        
    }
    
}
