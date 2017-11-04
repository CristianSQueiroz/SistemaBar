/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionario;
import SQLUtil2.MySqlConnect;

/**
 *
 * @author Cristian
 */
public class FuncionarioDb {

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
}
