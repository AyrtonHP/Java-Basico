package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private  String cor;
    private boolean tampada;


    public  Caneta(String m,String c, float p) {  // Método com o mesmo nome da classe

        this.setModelo(m); // Mudando com o metodo setter
        this.cor = c; //mudando o atributo
        this.ponta = p;
        this.tampar();
    }

    public String getmodelo() {

        return this.modelo;
    }
    public void setModelo(String m) {
       this.modelo = m;
    }

    public float getponta(){
        return this.ponta;
    }

    public  void setPonta( float p){
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }

    public  void  destampar(){
        this.tampada = false;
    }

    public  void  status() {
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.getmodelo());
        System.out.println("Ponta: " + this.getponta());
        System.out.println("Cor: "+ this.cor);
        System.out.println("tampada: " + this.tampada);


    }

}
