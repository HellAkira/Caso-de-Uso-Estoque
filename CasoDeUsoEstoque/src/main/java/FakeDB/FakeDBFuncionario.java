
package FakeDB;

import Pojo.FuncionarioPojo;
import java.util.ArrayList;
import java.util.Date;


public final class FakeDBFuncionario {

    private static ArrayList<FuncionarioPojo> funcionarios;
     
    public static ArrayList<FuncionarioPojo> getFuncionario(){
        
        if (funcionarios == null){
            funcionarios = new ArrayList();
            inicializarFuncionario(); 
        }
        return funcionarios;
    } 
    
    private static void inicializarFuncionario(){
        Date dataInsert = new Date(System.currentTimeMillis());
        adicionarFuncionario(10001	,20100150001L,"Georgi ","Facello"	,'M'	,"1953-09-02 00:00:00.000"	,"facello.georgi@acme.com",         1	,"1986-06-26 00:00:00.000"	  ,"49001540741/380"	,49001540741L	,380	,dataInsert);	
        adicionarFuncionario(10002	,20100150002L,"Bezalel ","Simmel"	,'F'	,"1964-06-02 00:00:00.000"	,"simmel.bezalel@acme.com",         1	,"1985-11-21 00:00:00.000"	  ,"38050201548/584"	,38050201548L	,584	,dataInsert);	
        adicionarFuncionario(10003	,20100150003L,"Parto ","Bamford"	,'M'	,"1959-12-03 00:00:00.000"	,"bamford.parto@acme.com",          1	,"1986-08-28 00:00:00.000"	  ,"45152038868/403"	,45152038868L	,403	,dataInsert);	
        adicionarFuncionario(10004	,20100150004L,"Chirstian","Koblick"	,'M'	,"1954-05-01 00:00:00.000"	,"koblick.chirstian@acme.com",      1	,"1986-12-01 00:00:00.000"	  ,"93993062385/891"	,93993062385L	,891	,dataInsert);	
        adicionarFuncionario(10005	,20100150005L,"Kyoichi ","Maliniak"	,'M'	,"1955-01-21 00:00:00.000"	,"maliniak.kyoichi@acme.com",       1	,"1989-09-12 00:00:00.000"	  ,"64885131268/229"	,64885131268L	,229	,dataInsert);	
        adicionarFuncionario(10006	,20100150006L,"Anneke ","Preusig"	,'F'	,"1953-04-20 00:00:00.000"	,"preusig.anneke@acme.com",         1	,"1989-06-02 00:00:00.000"	  ,"32097781440/565"	,32097781440L	,565	,dataInsert);	
        adicionarFuncionario(10007	,20100150007L,"Tzvetan ","Zielinski"	,'F'	,"1957-05-23 00:00:00.000"	,"zielinski.tzvetan@acme.com",      1	,"1989-02-10 00:00:00.000"	  ,"45521773009/130"	,45521773009L	,130	,dataInsert);	
        adicionarFuncionario(10020	,20100150020L,"Mayuko","Warwick"	,'M'	,"1952-12-24 00:00:00.000"	,"warwick.mayuko@acme.com",         1	,"1991-01-26 00:00:00.000"	  ,"82922368055/587"	,82922368055L	,587	,dataInsert);	
        adicionarFuncionario(10008	,20100150008L,"Saniya ","Kalloufi"	,'M'	,"1958-02-19 00:00:00.000"	,"kalloufi.saniya@acme.com",        1	,"1994-09-15 00:00:00.000"	  ,"61346916570/146"	,61346916570L	,146	,dataInsert);	
        adicionarFuncionario(10009	,20100150009L,"Sumant ","Peac"          ,'F'	,"1952-04-19 00:00:00.000"	,"peac.sumant@acme.com",            1	,"1985-02-18 00:00:00.000"	  ,"97392551134/059"	,97392551134L	,59	,dataInsert);	
        adicionarFuncionario(10010	,20100150010L,"Duangkaew","Piveteau"	,'F'	,"1963-06-01 00:00:00.000"	,"piveteau.duangkaew@acme.com",     1	,"1989-08-24 00:00:00.000"        ,"67883327357/459"	,67883327357L	,459	,dataInsert);	
        adicionarFuncionario(10011	,20100150011L,"Mary","Sluis"		,'F'	,"1953-11-07 00:00:00.000"	,"sluis.mary@acme.com",             1	,"1990-01-22 00:00:00.000"	  ,"27643038714/533"	,27643038714L	,533	,dataInsert);	
        adicionarFuncionario(10012	,20100150012L,"Patricio", "Bridgland"	,'M'	,"1960-10-04 00:00:00.000"	,"bridgland.patricio@acme.com",     1	,"1992-12-18 00:00:00.000"        ,"21351765725/934"	,21351765725L	,934	,dataInsert);	
        adicionarFuncionario(10013	,20100150013L,"Eberhardt","Terkki"	,'M'	,"1963-06-07 00:00:00.000"	,"terkki.eberhardt@acme.com",       1	,"1985-10-20 00:00:00.000"	  ,"56169715657/667"	,56169715657L	,667	,dataInsert);	
        adicionarFuncionario(10014	,20100150014L,"Berni","Genin"		,'M'	,"1956-02-12 00:00:00.000"	,"genin.berni@acme.com",            1	,"1987-03-11 00:00:00.000"	  ,"65552228659/809"	,65552228659L	,809	,dataInsert);	
        adicionarFuncionario(10015	,20100150015L,"Guoxiang", "Nooteboom"	,'M'	,"1959-08-19 00:00:00.000"	,"nooteboom.guoxiang@acme.com",     1	,"1987-07-02 00:00:00.000"        ,"53561554492/173"	,53561554492L	,173	,dataInsert);	
        adicionarFuncionario(10016	,20100150016L,"Kazuhito", "Cappelletti" ,'M'	,"1961-05-02 00:00:00.000"	,"cappelletti.kazuhito@acme.com",   1	,"1995-01-27 00:00:00.000"        ,"75799810902/082"	,75799810902L	,82	,dataInsert);	
        adicionarFuncionario(10017	,20100150017L,"Cristinel","Bouloucos"	,'F'	,"1958-07-06 00:00:00.000"	,"bouloucos.cristinel@acme.com",    1	,"1993-08-03 00:00:00.000"        ,"34272721832/847"	,34272721832L	,847	,dataInsert);	
        adicionarFuncionario(10018	,20100150018L,"Kazuhide", "Peha	"	,'F'	,"1954-06-19 00:00:00.000"	,"peha.kazuhide@acme.com",          1	,"1987-04-03 00:00:00.000"	  ,"65049299321/002"	,65049299321L	,2	,dataInsert);	
        adicionarFuncionario(10019	,20100150019L,"Lillian","Facello"	,'M'	,"1953-09-02 00:00:00.000"	,"facello.georgi@acme.com",         1	,"1986-06-26 00:00:00.000"	  ,"49001540741/380"	,49001540741L	,380	,dataInsert);	

    }
   	
    private static void adicionarFuncionario( 
     int funcionarioID,
     long chaveID,
     String nome,
     String sobreNome,
     char sexo,
     String DataAdmissao,
     String email,
     int paisID,
     String dataNascimento,
     String ctps,
     long ctpsNum,
     int ctpsSerie,
     Date dataInsert){
        FuncionarioPojo f = new FuncionarioPojo();
        f.setFuncionarioID(funcionarioID); 
        f.setChaveID(chaveID);
        f.setNome(nome);
        f.setSobreNome(sobreNome);
        f.setDataAdmissao(DataAdmissao);
        f.setSexo(sexo);
        f.setDataNascimento(dataNascimento);
        f.setEmail(email);
        f.setCtps(ctps);
        f.setCtpsNum(ctpsNum);
        f.setCtpsSerie(ctpsSerie);
        f.setPaisID(paisID);
        f.setDataInsert(dataInsert);
        funcionarios.add(f);          
    }
    

  
    
}

    

