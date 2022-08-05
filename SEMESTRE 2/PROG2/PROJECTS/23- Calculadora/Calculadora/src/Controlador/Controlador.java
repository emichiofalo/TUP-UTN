package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Emi Chiófalo
 */
public class Controlador implements ActionListener {

    private Vista v1;
    private Modelo m1;

    public Controlador(Vista v1, Modelo m1) {
        this.v1 = v1;
        this.m1 = m1;

        v1.setVisible(true);

        v1.getjBDivis().addActionListener(this);
        v1.getjBMultip().addActionListener(this);
        v1.getjBPow().addActionListener(this);
        v1.getjBRaiz().addActionListener(this);
        v1.getjBReset().addActionListener(this);
        v1.getjBResta().addActionListener(this);
        v1.getjBSuma().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(v1.getjBReset())) {
            reset();
        }else if (m1.ValidaDato(this.v1.getjTxtValue1().getText()) && m1.ValidaDato(this.v1.getjTxtValue2().getText())) {
            //validacion raiz cuadrada - ningun valor negativo, y el segundo no puede ser 0
            if(e.getSource().equals(v1.getjBRaiz())){
                if(m1.validaRaiz(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))){
                    this.v1.getjTxtResult().setText(String.valueOf(m1.Raiz(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
                }else{
                    reset();
                }
            }else if (e.getSource().equals(v1.getjBDivis())) {
                if(m1.validaDivis0(Double.parseDouble(this.v1.getjTxtValue2().getText()))){
                    this.v1.getjTxtResult().setText(String.valueOf(m1.Division(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
                }else{
                    reset();
                }
            }else if (e.getSource().equals(v1.getjBSuma())) {
                this.v1.getjTxtResult().setText(String.valueOf(m1.Suma(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
            } else if (e.getSource().equals(v1.getjBResta())) {
                this.v1.getjTxtResult().setText(String.valueOf(m1.Resta(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
            } else if (e.getSource().equals(v1.getjBMultip())) {
                this.v1.getjTxtResult().setText(String.valueOf(m1.Multip(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
            }else if (e.getSource().equals(v1.getjBPow()))  {
                this.v1.getjTxtResult().setText(String.valueOf(m1.Potencia(Double.parseDouble(this.v1.getjTxtValue1().getText()), Double.parseDouble(this.v1.getjTxtValue2().getText()))));
            }   
        } else {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR SOLO NUMEROS");
            reset();
        }
    }
    
    public void reset(){
        this.v1.getjTxtResult().setText("");
        this.v1.getjTxtValue1().setText("");
        this.v1.getjTxtValue2().setText("");
    }
}
