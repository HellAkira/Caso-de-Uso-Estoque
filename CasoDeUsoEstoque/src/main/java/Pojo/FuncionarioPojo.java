package Pojo;

import java.util.Date;

public class FuncionarioPojo extends CamposDeData{
    
    private int funcionarioID;
    private long chaveID;
    private String nome;
    private String sobreNome;
    private String DataAdmissao;
    private char sexo;
    private String dataNascimento;
    private String email;
    private String ctps;
    private long ctpsNum;
    private int ctpsSerie;
    private int paisID;
    private Date dataInsert;

    
    public FuncionarioPojo (){
        
    }

    public int getFuncionarioID() {
        return funcionarioID;
    }

    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public long getChaveID() {
        return chaveID;
    }

    public void setChaveID(long chaveID) {
        this.chaveID = chaveID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public long getCtpsNum() {
        return ctpsNum;
    }

    public void setCtpsNum(long ctpsNum) {
        this.ctpsNum = ctpsNum;
    }

    public int getCtpsSerie() {
        return ctpsSerie;
    }

    public void setCtpsSerie(int ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }

    public int getPaisID() {
        return paisID;
    }

    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }

    public Date getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(Date dataInsert) {
        this.dataInsert = dataInsert;
    }
    



    
    
    
    
}
