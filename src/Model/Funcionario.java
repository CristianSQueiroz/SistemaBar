/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Cristian
 */
public class Funcionario {

    private int cdFuncionario;
    private String nmFuncionario;
    private String dsTelefone;
    private String dsEndereco;
    private double vlSalario;
    private String dsLogin;
    private String dsSenha;

    public Funcionario(int cdFuncionario, String nmFuncionario, String dsTelefone, String dsEndereco, double vlSalario, String dsLogin, String dsSenha) {
        this.cdFuncionario = cdFuncionario;
        this.nmFuncionario = nmFuncionario;
        this.dsTelefone = dsTelefone;
        this.dsEndereco = dsEndereco;
        this.vlSalario = vlSalario;
        this.dsLogin = dsLogin;
        this.dsSenha = dsSenha;
    }

    public Funcionario() {

    }

    public int getCdFuncionario() {
        return cdFuncionario;
    }

    public void setCdFuncionario(int cdFuncionario) {
        this.cdFuncionario = cdFuncionario;
    }

    public String getNmFuncionario() {
        return nmFuncionario;
    }

    public void setNmFuncionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }

    public String getDsTelefone() {
        return dsTelefone;
    }

    public void setDsTelefone(String dsTelefone) {
        this.dsTelefone = dsTelefone;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public double getVlSalario() {
        return vlSalario;
    }

    public void setVlSalario(double vlSalario) {
        this.vlSalario = vlSalario;
    }

    public String getDsLogin() {
        return dsLogin;
    }

    public void setDsLogin(String dsLogin) {
        this.dsLogin = dsLogin;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

}
