/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionario;
import SQLUtil2.MySqlConnect;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Cristian
 */
public class FuncionarioDb {

    private String cmd; 
    
    public static void cadastrar(Funcionario f) {
        String cmd = "INSERT INTO tb_funcionario (CD_FUNCIONARIO, "
                                                + "NM_FUNCIONARIO, "
                                                + "DS_ENDERECO,"
                                                + " VL_SALARIO, "
                                                + "DS_LOGIN, "
                                                + "DS_SENHA) "
                + "VALUES (NULL,'"
                + f.getNmFuncionario()
                + "','" + f.getDsEndereco()
                + "','" + f.getVlSalario()
                + "','" + f.getDsLogin()
                + "','" + f.getDsSenha() + "')";
        MySqlConnect.getInstance().executaComandoPadrao(cmd);
    }
    
        public ArrayList<HashMap> getFuncionarios(HashMap atributos, HashMap restricoes,String orderby) {
        cmd = new Util.UtilSql().montaQuery(atributos,restricoes, "TB_FUNCIONARIO",orderby);
            return MySqlConnect.getInstance().executaConsultaPadrao(cmd);
    }
}
