/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import SQLUtil2.MySqlConnect;

/**
 *
 * @author Cristian
 */
public class ProdutoDb {

    public static void cadastrar(Produto p) {
        String cmd = "INSERT INTO TB_MERCADORIA (CODIGO, "
                                                + "DS_DESCRICAO, "
                                                + "QUANTIDADE,"
                                                + "VL_PRECO_COMPRA, "
                                                + "VL_PRECO_VENDA) "
                + "VALUES (NULL,"
                + "'" + p.getDsDescricao()
                + "','" + p.getNrQuantidade()
                + "','" + p.getVlPrecoCompra()
                + "','" + p.getVlPrecoVenda()+"')";
        MySqlConnect.getInstance().executaComandoPadrao(cmd);
    }
}
