package uniandes.dpoo.estructuras.logica;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
   
	/**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        int[] copiaArreglo = this.arregloEnteros.clone();
    	
        return copiaArreglo;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	  String[] copiaArreglo = this.arregloCadenas.clone();
      	
          return copiaArreglo;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return  this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	
    	int[] Arreglo = this.arregloEnteros;
    	int lengthArregloMas1= this.getCantidadEnteros()+1;
    	int[] copiaArreglo=Arrays.copyOf(Arreglo, lengthArregloMas1);
    	copiaArreglo[lengthArregloMas1]=entero;
    	arregloEnteros=copiaArreglo;
    	
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] Arreglo = this.arregloCadenas;
    	int lengthArregloMas1= this.getCantidadCadenas()+1;
    	String[] copiaArreglo=Arrays.copyOf(Arreglo, lengthArregloMas1);
    	copiaArreglo[lengthArregloMas1]=cadena;
    	arregloCadenas= copiaArreglo;
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int length=this.getCantidadEnteros();
    	int[] Arreglo = this.arregloEnteros;
    	
    	for(int i=0;i<length;i++) {
    		if(Arreglo[i]==valor) {
    			Arreglo[i]= (Integer) null;
    			
    		}
    		
    	}
    	
    	
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena){
    
    	int length=this.getCantidadEnteros();
		String[] Arreglo = this.arregloCadenas;
    	int i=0;
		
    	while(i<length) {
    		if(Arreglo[i]==cadena) {
    			Arreglo[i]=(String) null;
    		}
    		
    		i++;
			
		}
		
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] Arreglo = this.arregloEnteros;
    	int length=this.getCantidadCadenas();
    	if(posicion<0) {
    		Arreglo[1]=entero;
    	}
    	else if(posicion>length) {
    		this.agregarEntero(entero);
    		
    	}
    	else {
    		Arreglo[posicion]=entero;
    	}
    	
    	
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int[] Arreglo = this.arregloEnteros;
    	int length=this.getCantidadCadenas();
    	if(posicion<length && posicion>=0) {
    		Arreglo[posicion]=(Integer) null;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	for(int i=0;i< valores.length;i++) {
    		valores[i]=Math.floor(valores[i]);
    		
    	
    	}
    	
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	for(int i=0;i< objetos.length;i++) {
    		objetos[i]=objetos[i].toString();
    		
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int length=this.getCantidadEnteros();
    	int[] Arreglo = this.arregloEnteros;
    	
    	for(int i=0;i<length;i++) {
    		if(Arreglo[i]<0) {
    			Arreglo[i]= Arreglo[i]*-1;
   
    		}
    		}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {

    	Arrays.sort(this.arregloEnteros);
    	
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(this.arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int length=this.getCantidadEnteros();
    	int[] Arreglo = this.arregloEnteros;
    	int Ans = 0;
    	for(int i=0;i<length;i++) {
    		if(Arreglo[i]==valor) {
    			Ans++;
    	
    		}
    		}
    	return Ans;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	String cadenaMinuscula = cadena.toLowerCase();
    	int length=this.getCantidadEnteros();
    	String[] Arreglo = this.arregloCadenas;
    	int Ans = 0;
    	for(int i=0;i<length;i++) {
    		String posicionMinuscula=Arreglo[i].toLowerCase();
    		if(posicionMinuscula==cadenaMinuscula) {
    			Ans++;
    	
    		}
    		}
    	return Ans;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor ){
    	List<Integer> ans = new ArrayList<>();
    	int[] Arreglo = this.arregloEnteros;
    	int i = 0;
    	while(i<this.getCantidadEnteros()) {
    		if(Arreglo[i]==valor) {
    			ans.add(i);
    		}
    	}
    	int[] ansF= new int[ans.size()];
    	for(i=0;i<ans.size();i++){
    		
    		ansF[i]=ans.get(i);
    
    		}
    	return ansF;
    		
    		
    	
    
    }
    

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        int[] ans= new int[2];
    	int[] Arreglo =this.arregloEnteros;
        for(int i=0;i<Arreglo.length;i++) {
    		
    		if(i==0) {
    			ans[0]=Arreglo[0];
    			ans[1]=Arreglo[0];
    		
    		}
    		else {
    			if(ans[0]> Arreglo[i]) {
    				ans[0]=Arreglo[i];
    		}
    			if(ans[1]<Arreglo[i]) {
    				ans[1]=Arreglo[i];
    		}
    		
    		
    	}
    	
    	
 
    }
        return ans;  
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int[] Arreglo =this.arregloEnteros;
        
        for(int i=0;i<Arreglo.length;i++) {
    		
        	if(ans.containsKey(Arreglo[i])){
    			int valor = ans.get(Arreglo[i]);
    			ans.put(Arreglo[i], valor++);
    			
    		}
        	else {
        	ans.put(Arreglo[i],1);
        	
        	}
        	
    		}
    	
    	
    	
    	
    	return ans;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> hash = new HashMap<>();
        int[] Arreglo =this.arregloEnteros;
        
        for(int i=0;i<Arreglo.length;i++) {
    		
        	if(hash.containsKey(Arreglo[i])){
    			int valor = hash.get(Arreglo[i]);
    			hash.put(Arreglo[i], valor++);
    			
    		}
        	else {
        	hash.put(Arreglo[i],1);
        	
        	}
        	
    		}
    	Set<Integer> Keyset= hash.keySet();
        
    	int ans=0;
    	
        for(Integer key : Keyset) {
        
        	int valorKey= hash.get(key);
        	if(valorKey>1) {
        		
        		ans++;
        		
        	}
        	
        	
        }
        
    	return ans;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        boolean sies = true;
        int[] Arreglo =this.arregloEnteros;
        int i=0;
    	if(Arreglo.length != otroArreglo.length) {
    		
    		sies=false;
    		
    	}
        while(sies && i<Arreglo.length) {
    		
    		if(Arreglo[i] != otroArreglo[i]) {
    			
    			sies=false;
    			
    		}
    		i++;
    	}
    	
    	
    	return sies;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	HashMap<Integer, Integer> hashThis = new HashMap<>();
    	HashMap<Integer, Integer> hashOtro = new HashMap<>();
    	
    	int[] Arreglo =this.arregloEnteros;
         
         for(int i=0;i<Arreglo.length;i++) {
     		
         	if(hashThis.containsKey(Arreglo[i])){
     			int valor = hashThis.get(Arreglo[i]);
     			hashThis.put(Arreglo[i], valor++);
     			
     		}
         	else {
         	hashThis.put(Arreglo[i],1);
         	
         	}
    	
    	
         }
    	
         for(int i=0;i<otroArreglo.length;i++) {
      		
          	if(hashOtro.containsKey(otroArreglo[i])){
      			int valor = hashOtro.get(otroArreglo[i]);
      			hashOtro.put(otroArreglo[i], valor++);
      			
      		}
          	else {
          	hashOtro.put(otroArreglo[i],1);
          	
          	}
     	
     	
          } 
        Set<Integer> keysThis= hashThis.keySet();
        List<Integer> listaKeysThis = new ArrayList<>(keysThis);
        Set<Integer> keysOtro= hashOtro.keySet();
        List<Integer> listaKeysOtro = new ArrayList<>(keysOtro);
        
        
        boolean sies= true;
        int i = 0;
        while(sies && i<listaKeysThis.size()) {
        
        	int numeroListaKeysThis= listaKeysThis.get(i);
        	if(!(listaKeysOtro.contains(numeroListaKeysThis))) {
        		
        		return false;
        		
        	}
        	i++;
        }
    	return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoArreglo=new int[cantidad];
    	for(int i = 0;i< cantidad;i++) {
    		int numeroAleatorio = (int)(Math.random() * (maximo - minimo + 1)) + minimo;    		
    		nuevoArreglo[i]=numeroAleatorio;
    	}
    
    
    	this.arregloEnteros=nuevoArreglo;
    }

}
