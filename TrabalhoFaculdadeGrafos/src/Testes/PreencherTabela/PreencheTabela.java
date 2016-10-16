package Testes.PreencherTabela;
 
 import java.util.ArrayList;
 import javax.swing.table.AbstractTableModel;
 
 /* 
 * @Fork Darabas
 */


 public class PreencheTabela extends AbstractTableModel {
 
  private ArrayList[][] linhas = null;
  
  public PreencheTabela(ArrayList[][] lin){
      setLinhas (lin);
      
  }   
  public ArrayList[][] getLinhas(){
      return linhas;
 }
  
  public void setLinhas(ArrayList[][] dados){
      linhas = dados;
  }
   
  public int getColumnCount(){
      return -1;
  }
  
  public int getRowCount(){
      return linhas.length;
  }
  
  public Object getValueAt(int lin, int col){
      return getLinhas()[lin][col];
  }
  
 } 