
import View.CadastroFuncionario;
import View.CadastroProduto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class Main {
    
    public static void main(String[] args){
        JFrame principal = new JFrame();
        principal.setSize(new Dimension(800,600));
        //principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        principal.setLocationRelativeTo(null);
        principal.add(new CadastroProduto(),BorderLayout.CENTER);
        principal.setVisible(true);
    }
}
