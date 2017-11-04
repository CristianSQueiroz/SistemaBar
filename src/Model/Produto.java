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
public class Produto {

    private int cdCodigo;
    private String dsDescricao;
    private String nrQuantidade;
    private double vlPrecoCompra;
    private double vlPrecoVenda;

    public Produto(int cdCodigo, String dsDescricao, String nrQuantidade, double vlPrecoCompra, double vlPrecoVenda) {
        this.cdCodigo = cdCodigo;
        this.dsDescricao = dsDescricao;
        this.nrQuantidade = nrQuantidade;
        this.vlPrecoCompra = vlPrecoCompra;
        this.vlPrecoVenda = vlPrecoVenda;
    }

    public int getCdCodigo() {
        return cdCodigo;
    }

    public void setCdCodigo(int cdCodigo) {
        this.cdCodigo = cdCodigo;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getNrQuantidade() {
        return nrQuantidade;
    }

    public void setNrQuantidade(String nrQuantidade) {
        this.nrQuantidade = nrQuantidade;
    }

    public double getVlPrecoCompra() {
        return vlPrecoCompra;
    }

    public void setVlPrecoCompra(double vlPrecoCompra) {
        this.vlPrecoCompra = vlPrecoCompra;
    }

    public double getVlPrecoVenda() {
        return vlPrecoVenda;
    }

    public void setVlPrecoVenda(double vlPrecoVenda) {
        this.vlPrecoVenda = vlPrecoVenda;
    }

}
