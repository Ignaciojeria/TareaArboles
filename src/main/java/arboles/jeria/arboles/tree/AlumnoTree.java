package arboles.jeria.arboles.tree;

import java.util.List;

import arboles.jeria.arboles.model.Alumno;

public class AlumnoTree {
	
    public Nodo raiz;
    
    public AlumnoTree() {
       raiz=null;
   }
   
   public void insertar(int key,Object valor){
       Nodo n=new Nodo(key);
       n.valor=valor;
       
       if (raiz==null) {
           raiz=n;
       }else{
           Nodo temporal=raiz;
           while (temporal!=null) {
               n.p=temporal;
               if (n.llave>=temporal.llave) {
                   temporal=temporal.der;
               }else{
                   temporal=temporal.izq;
               }
       
           }
           if (n.llave<n.p.llave) {
               n.p.izq=n;
           } else {
               n.p.der=n;
           }
       }
   }
   
   /*Se inicializa una lista vacía (Una dependencia-uml sin estado!).
    La utilizamos sólo para la compatibilidad del json de retorno de nuestro web service*/
   public List<Alumno> recorrido_en_orden(Nodo x, List<Alumno> statelessList){
       if (x!=null) {
           recorrido_en_orden(x.izq,statelessList);
         //  System.out.println(x.llave);
           statelessList.add((Alumno)x.valor);
           recorrido_en_orden(x.der,statelessList);
       }
        return statelessList;
   }
   
   
}
