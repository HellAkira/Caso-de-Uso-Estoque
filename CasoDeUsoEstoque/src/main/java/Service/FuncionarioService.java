package Service;

import DAO.FuncionarioDao;
import Pojo.*;
import java.util.*;



public class FuncionarioService {
    
    private Scanner sc;
    private FuncionarioDao dao;
    
    public FuncionarioService(){
       sc = new Scanner(System.in); 
       dao = new FuncionarioDao();
    }
    
    public void exibirMenu(){
        boolean sair = false;
        do{
            
           int op = this.printMenu();
           
           switch(op){
               case 1:
                   this.printMenuInserir();
                       break;
               case 2:
                   this.printMenuListar();
                       break;
               case 3:
                   this.printMenuDetalhar();
                       break;
               case 4:
                   this.printMenuAlterar();
                       break;
               case 5:
                   this.printMenuExcluir();
                       break;
               case 0:
                   sair = true;
                       break;
               default:
                   System.out.println("Opção selecionada não disponível. Tente novamente.");
                  
         
           }
        
        }
        while(sair != true);
    }
    
    private int printMenu(){
        
                System.out.println("##                -- Menu Categoria --##\n");
                System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Inserir       |");
		System.out.println("                  |     2 - Listar        |");
		System.out.println("                  |     3 - Detalhes      |");
		System.out.println("                  |     4 - Alterar       |");
		System.out.println("                  |     5 - Excluir       |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                return this.sc.nextInt();
    }
    
    private void printMenuInserir(){
       
        
        FuncionarioPojo pojo = new FuncionarioPojo();
        
        System.out.println("Digite qual o ID do Funcionario");
        pojo.setFuncionarioID (this.sc.nextInt());
        
        System.out.println("Digite qual o Nome");
        pojo.setNome (this.sc.nextLine());
        
        System.out.println("Digite qual o Sobrenome");
        pojo.setSobreNome(this.sc.nextLine());
        
        System.out.println("Digite qual o ID da Chave");
        pojo.setChaveID (this.sc.nextLong());
        
        System.out.println("Digite qual a Data de Admissao");
        pojo.setDataAdmissao(this.sc.nextLine());
        
        System.out.println("Digite qual o Sexo");
        pojo.setSexo( this.sc.next().charAt(0));
        
        System.out.println("Digite qual a Data de Nascimento");
        pojo.setDataNascimento(this.sc.nextLine());
        
        System.out.println("Digite qual o Email");
        pojo.setEmail(this.sc.nextLine());
        
        System.out.println("Digite qual o CTPS");
        pojo.setCtps(this.sc.nextLine());
        
        System.out.println("Digite qual o numero do CTPS");
        pojo.setCtpsNum(this.sc.nextLong());
        
        System.out.println("Digite qual a serie do CTPS");
        pojo.setCtpsSerie(this.sc.nextInt());
        
        System.out.println("Digite qual o ID do Pais");
        pojo.setPaisID(this.sc.nextInt());
        
        Date dataInsert = new Date(System.currentTimeMillis());
        
        pojo.setDataInsert(dataInsert);
        
        this.dao.create(pojo);

      
    }
    
    private void printMenuDetalhar(){
              System.out.println("Digite Qual ID do Funcionario");
                int op = this.sc.nextInt();
                
                FuncionarioPojo pojo = this.dao.read(op);
                if(pojo == null){
                System.out.println("Opção selecionada não disponível. Tente novamente.");
                }else{
                
                System.out.println("                 # Menu Funcionario - Detalhar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Funcionario ID: %d\n",pojo.getFuncionarioID());
		System.out.printf ("                  |     Nome : %s\n",pojo.getNome());
		System.out.printf ("                  |     Sobrenome : %s\n",pojo.getSobreNome());
		System.out.printf ("                  |     Chave ID : %d\n",pojo.getChaveID());
		System.out.printf ("                  |     Sexo : %s\n",pojo.getSexo());
		System.out.printf ("                  |     Email : %s\n",pojo.getEmail());
		System.out.printf ("                  |     CTPS : %s\n",pojo.getCtps());
		System.out.printf ("                  |     Pais ID : %d\n",pojo.getPaisID());
		System.out.printf ("                  |     Nascimento : %s\n",pojo.getDataNascimento());
		System.out.printf ("                  |     Admissao : %s\n",pojo.getDataAdmissao());
		System.out.println("                  =========================\n");
                
                }
        
    }
    
    private void printMenuListar(){
        
           for (FuncionarioPojo pojo : this.dao.readAll()) {
                System.out.println("                 # Menu Funcionario - Listar #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Funcionario ID: %d\n",pojo.getFuncionarioID());
		System.out.printf ("                  |     Nome : %s\n",pojo.getNome());
		System.out.printf ("                  |     Sobrenome : %s\n",pojo.getSobreNome());
		System.out.printf ("                  |     Chave ID : %d\n",pojo.getChaveID());
		System.out.printf ("                  |     Sexo : %s\n",pojo.getSexo());
		System.out.printf ("                  |     Email : %s\n",pojo.getEmail());
		System.out.printf ("                  |     CTPS : %s\n",pojo.getCtps());
		System.out.printf ("                  |     Pais ID : %d\n",pojo.getPaisID());
		System.out.printf ("                  |     Nascimento : %s\n",pojo.getDataNascimento());
		System.out.printf ("                  |     Admissao : %s\n",pojo.getDataAdmissao());
		System.out.println("                  =========================\n");
        }
        
        
        
    }
    
    private void printMenuExcluir(){
        
                  System.out.println("Digite Qual ID do Funcionario");
                int op = this.sc.nextInt();
                FuncionarioPojo pojo = this.dao.read(op);
                if(pojo == null){
                    System.out.println("Opção selecionada não disponível. Tente novamente.");
                }
                
                System.out.println("                 # Menu Funcionario - Alterar  #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Funcionario ID: %d\n",pojo.getFuncionarioID());
		System.out.printf ("                  |     Nome: %s %s \n", pojo.getNome(),pojo.getSobreNome());
		System.out.println("                  =========================\n");
                
                
                this.dao.delete(pojo.getFuncionarioID());
                
                System.out.println("Item Deletado");
        
    }
        
    private void printMenuAlterar(){
            
   
                System.out.println("Digite Qual ID do Funcionario");
                int op = this.sc.nextInt();
                FuncionarioPojo pojo = this.dao.read(op);
                if(pojo == null){
                    System.out.println("Opção selecionada não disponível. Tente novamente.");
                }
                
                System.out.println("                 # Menu Funcionario - Alterar  #\n");
                System.out.println("\n                  =========================");
		System.out.printf ("                  |     Funcionario ID: %d\n",pojo.getFuncionarioID());
		System.out.printf ("                  |     Nome: %s %s \n", pojo.getNome(),pojo.getSobreNome());
		System.out.println("                  =========================\n");
                
                
                 System.out.println("Digite qual o ID do Funcionario");
                 pojo.setFuncionarioID (this.sc.nextInt());

                System.out.println("Digite qual o Nome");
                 pojo.setNome (this.sc.nextLine());

                System.out.println("Digite qual o Sobrenome");
                 pojo.setSobreNome(this.sc.nextLine());

                System.out.println("Digite qual o ID da Chave");
                 pojo.setChaveID (this.sc.nextLong());

                System.out.println("Digite qual a Data de Admissao");
                 pojo.setDataAdmissao(this.sc.nextLine());

                System.out.println("Digite qual o Sexo");
                 pojo.setSexo( this.sc.next().charAt(0));

                System.out.println("Digite qual a Data de Nascimento");
                 pojo.setDataNascimento(this.sc.nextLine());

                System.out.println("Digite qual o Email");
                 pojo.setEmail(this.sc.nextLine());

                System.out.println("Digite qual o CTPS");
                pojo.setCtps(this.sc.nextLine());

                System.out.println("Digite qual o numero do CTPS");
                pojo.setCtpsNum(this.sc.nextLong());

                System.out.println("Digite qual a serie do CTPS");
                pojo.setCtpsSerie(this.sc.nextInt());

                System.out.println("Digite qual o ID do Pais");
                pojo.setPaisID(this.sc.nextInt());
                
                this.dao.update(pojo);
                
        
    }
    
}
