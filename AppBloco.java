import javax.swing.JOptionPane;

public class AppBloco {
   public static void main(String [] args){
      BlocoDeNotas minhasAnotacoes = new BlocoDeNotas();
      int menu;
      int posicao;
      
      do {
         menu = 5;
         posicao = -1;
         menu = Integer.parseInt(JOptionPane.showInputDialog(
               "1) Inserir uma nota\n2) Remova uma nota\n3) Altere uma nota"+
               "\n4) Listar todas as notas" +
               "\n5) Saia do sistema."));
         //caso não selecione nenhuma das opções
         if( !(menu > 0 && menu < 6) )JOptionPane.showMessageDialog(null, "Opção inválida");      
                   
         if(menu == 1){
            minhasAnotacoes.inserir( JOptionPane.showInputDialog("Insira uma nota: ") );
            minhasAnotacoes.operacaoRealizada();
         }
         
         if(menu == 2){
            posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da nota a ser removida: "));
            if(minhasAnotacoes.verificarExistencia(posicao)){
               minhasAnotacoes.remover(posicao);
               minhasAnotacoes.operacaoRealizada();
            } else {   
               minhasAnotacoes.operacaoNaoRealizada();
            }   
         } 
         
         if(menu == 3){
            posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da nota a ser alterada"));
            if(minhasAnotacoes.verificarExistencia(posicao)){
               String alteracao =  JOptionPane.showInputDialog("Digite a nova nota: ") ;
               minhasAnotacoes.alterar(posicao, alteracao);
               minhasAnotacoes.operacaoRealizada();
            } else {
               minhasAnotacoes.operacaoNaoRealizada();
            }   
         }
         
         if(menu == 4){
            minhasAnotacoes.listar();
         }
         
         if(menu == 5){
         }         
      
      
      } while(menu != 5);
      
      
      
      System.exit(0);
   }
}