package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {
    private static List<Tarefas> ListaTarefas = new ArrayList<Tarefas>();
    public static int menu(){
        System.out.println("\n--------------------------------------------"
                          + "\n Lista de tarefas"
                          + "\n ------------------------------------------"
                          + "\n 1-Adicionar tarefas"
                          + "\n 2-Mostrar tarefa"
                          + "\n 3-Alterar tarefa"
                          + "\n 4-Remover tarefa"
                          + "\n 0-Sair"
                          + "\n ------------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        return scanner.nextInt();
}
    
    public static void addItem(){
        String sOpc;
        System.out.println("\n ------------------------------------------"
                         + "\n Adicionar item"
                         + "\n ------------------------------------------"
                         + "\n Insira o item");
        
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        
        
        do{
            System.out.println("\n ------------------------------------------"
                             + "\n Voce deseja adicionar uma descrição para uma tarefa"
                             + "\n ------------------------------------------"
                             + "\n S-Sim / N-Nao");

            sOpc = scanner.nextLine();
            if(sOpc.equalsIgnoreCase("S")){
                System.out.println("\n ------------------------------------------"
                                 + "\n Insira sua descricao ");
                String descricao = scanner.nextLine();
                
                ListaTarefas.add(new Tarefas(nome,descricao));
            } else if (sOpc.equalsIgnoreCase("N")){
                ListaTarefas.add(new Tarefas(nome));
            }
        
        }while(!sOpc.equalsIgnoreCase("S")&&!sOpc.equalsIgnoreCase("N"));
        
        showList();
    }
    
    public static void showList(){
        System.out.println("\n ------------------------------------------"
                         + "\n Mostrar Lista"
                         + "\n ------------------------------------------");
        int num = 0;
        for (Tarefas item : ListaTarefas){
            System.out.println("" + ++num + "" + item);
        }
    }
    public static void removerItem(){
        System.out.println("\n ------------------------------------------"
                         + "\n Remover item"
                         + "\n ------------------------------------------"
                         + "\n Escolha o ID do item a ser removido");
        showList();
        
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine();
        
        if((index -1) < 0 || index > ListaTarefas.size()){
            System.out.println("O ID inserido é invalido! Favor escolher um numero entre 0 e " + ListaTarefas.size());
        } else {
            ListaTarefas.remove(index -1);
        }
        
        showList();
    }
    
    public static void alterarItem(){
        System.out.println("\n ------------------------------------------"
                         + "\n Alterar item"
                         + "\n ------------------------------------------"
                         + "\n Escolha o ID do item a ser removido");
        showList();
        
        
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine();
        
        if((index -1) < 0 || index > ListaTarefas.size()){
            System.out.println("O ID inserido é invalido! Favor escolher um numero entre 0 e " + ListaTarefas.size());
        } else {
            ListaTarefas.get(index -1).setFinalizado();
        }
        
        showList();
    
    
    }
    public static void main(String[] args) {
        while(true){
            int i = menu();
            
            switch(i){
                case 1:
                    addItem();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    alterarItem();
                    break;
                case 4:
                    removerItem();
                    break;
                case 0:
                    return;
            }
        
        }

    }
}
