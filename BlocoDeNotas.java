import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BlocoDeNotas {
   private ArrayList<String> notas;
   
   //construtor
   public BlocoDeNotas(){
      notas = new ArrayList<String>();
   }
   
   //métodos
   //inserir anotacao
   public void inserir(String texto){
      notas.add(texto);
   }
   //alterar anotacao
   public void alterar(int posicao, String texto){
      notas.remove(posicao - 1);
      notas.add(posicao - 1, texto);
   }
   //remover uma anotacao pela posicao
   public void remover(int posicao){
      notas.remove(posicao - 1);
   }
   //buscar a posicao de uma anotacao pelo texto
   public int buscar(String anotacao){
      for(int i = 0; i < notas.size(); i++){
         String texto = notas.get(i);
         if(texto.equals(anotacao)){
            return i;
         }
      }
      
      return -1; //nao achou
   }
   
   //verificar se a posicao dada é válida
   public boolean verificarExistencia(int posicao){
      posicao -= 1;
      if(posicao >= 0 && posicao < notas.size()){
         return true;
      }
      
      return false;
   }
   
   //imprimir todas as notas
   public void listar(){
      String lista = "====== Anotações ======\n";
      for(int i = 0; i < notas.size() ; i++){
         lista += (i + 1) + ": " + notas.get(i) + "\n";
      } 
         JOptionPane.showMessageDialog(null, lista);
   }
   public void operacaoRealizada(){
      JOptionPane.showMessageDialog(null, "Operacao realizada com sucesso!");
   }
   public void operacaoNaoRealizada(){ 
      JOptionPane.showMessageDialog(null, "Ops, houve um erro no procedimento!");
   }
   
}