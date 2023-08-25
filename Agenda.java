import java.util.ArrayList;

public class Agenda
{
 private ArrayList<Nota> lista;
  public Agenda()
  {
      lista = new ArrayList<Nota>();
  }
  
  public void addNota(Nota nota)
  {
      lista.add(nota);
  }
  
  public void listarNotas()
  {
      if (lista.size() > 0)
      {
          // mostrar las notas
          for(Nota item : lista )
          {
              item.mostrar();
          }
      }
      else
      {
         System.out.println("_______________________________");
         System.out.println("No hay notas en la agenda");
         System.out.println("_______________________________");
      }
  }
  
  public void contaNotas()
  {
      System.out.println("_____________________________");
      System.out.println("En la agenda existen  " + lista.size() +  "notas");
      System.out.println("_____________________________");
  }
  
  public void borrarNota(int id)
  {
      int pos = -1;
      boolean flag = false;
      
      if (lista.size() > 0)
      {
          pos++;
          for (Nota item: lista)
          {
              if (item.getId() == id)
              {
                  flag = true;
                  break;
              }
          }
          if (flag)
          {
              lista.remove(pos);
          }
      }
  }
}
