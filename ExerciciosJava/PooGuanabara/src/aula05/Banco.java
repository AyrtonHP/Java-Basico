package aula05;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Banco {

     public int numconta[] = new int[20];
     protected String tipo;
     private String dono;
     private boolean status;
     private double saldo;

     Random radomizar = new Random();


     public void estadoAtual(){
          System.out.println("=--=-=-=-=-=-=-=");
          System.out.println("conta " + getTipo());
          System.out.println("tipo: + " + this.getTipo());
          System.out.println( "dono: " + this.getDono());
          System.out.println("Saldo " + this.getSaldo());
          System.out.println("status " + getsStatus());
          System.out.println("=--=-=-=-=-=-=-=");

     }

     public void abrirConta() {
          setTipo(JOptionPane.showInputDialog(null, "Qual o tipo de conta que gostaria de abrir? ").toUpperCase());
           setStatus(true);
           if (getTipo().equals("CC")) {
                System.out.println("você está abrindo uma conta corrente");
                setSaldo(getSaldo() + 50);
           } else if (getTipo().equals("CP")) {
                System.out.println("Você esta abrindo uma conta Poupança");
                setSaldo(getSaldo() + 150);
           }
          System.out.println("Conta aberta com sucesso");
          for (int i = 0; i < 20; i++ ){
              numconta[i] = radomizar.nextInt(9);
          }
          System.out.println(Arrays.toString(numconta));
     }

     public void fecharConta(){
          System.out.println("deseja fechar sua conta?");
          if (getSaldo() > 0) {
               System.out.println("você não pode fechar a sua conta, necessario sacar o dinheiro");
          } else if (getSaldo() < 0) {
               System.out.println("conta esta em debíto");
          } else {
               setStatus(false);
          }
     }
     public  void  depositar(double deposito){
          if (this.getsStatus()) {

               setSaldo(getSaldo() + deposito);
               System.out.println("depositar" + this.getSaldo());

          } else {
               setStatus(false);
               System.out.println("impossivel depositar");
          }
     }
     public   void sacar(double deposito){
          if (this.getsStatus()) {
               if (this.getSaldo() >= deposito) {
                    this.setSaldo(this.getSaldo() - deposito);
                    System.out.println("saque realizado na conta de " + this.getDono());
               }
          } else {
               System.out.println("Impossivel sacar de uma conta fechada");
          }
     }
     private void  pagarMensalidade(){
          int real;
          if (getsStatus()) {
               if (getTipo().equals("CC")) {
                    setSaldo(getSaldo() - 12);
               } else if (getTipo().equals("CP")) {
                    setSaldo(getSaldo() - 12);
               }
          } else {
               System.out.println("impossivel pagar uma conta coom status fechada!");
          }

     }
     public Banco() {
          this.setStatus(false);
          this.setSaldo(0);
     }

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }

     public int[] getNumconta() {
          return numconta;
     }

     public void setNumconta(int[] numconta) {
          this.numconta = numconta;
     }

     public boolean getsStatus() {
          return status;
     }

     public void setStatus(boolean status) {
          this.status = status;
     }

     public double getSaldo() {
          return saldo;
     }

     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }

     public String getDono() {
          return dono;
     }

     public void setDono(String dono) {
          this.dono = dono;
     }
}
