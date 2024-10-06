
package javaapplication1;

public class Tarefas {
    private String Nome;
    private String Descricao;
    private boolean Finalizado; //Gera uma variavel de verdadeiro ou falso para um item
    
    //Construtor que obriga que o programador passe o nome, e faz com que a variavel finalizado seja falso
    public Tarefas(String nome){
        this.Nome = nome;
        this.Finalizado = false;
    
    }
    
    public Tarefas(String Nome, String Descricao){
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Finalizado = false;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public String getDescricao(){
        return Descricao;
    }
    
    public void setFinalizado(){
        this.Finalizado = true;
    }

    @Override
    public String toString() {
        return "Tarefas{" + "Nome=" + Nome + ", Descricao=" + Descricao + ", Finalizado=" + Finalizado + '}';
    }
}
