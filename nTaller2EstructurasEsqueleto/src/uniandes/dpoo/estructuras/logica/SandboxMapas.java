package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista( )
    {
        
    	List<String> ListaHash=new ArrayList<String>(this.mapaCadenas.values());
    	Collections.sort(ListaHash);
    	
    	return ListaHash;
    }

    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
    	List<String> ListaHash=new ArrayList<String>(this.mapaCadenas.keySet());
    	Collections.sort(ListaHash);
    	
    	return ListaHash;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    {
    	TreeSet<String> arbolCadenas = new TreeSet<String>(this.mapaCadenas.values() );
    	
    	return arbolCadenas.first();
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    {
    	TreeSet<String> arbolCadenas = new TreeSet<String>(this.mapaCadenas.keySet() );
    	
    	return arbolCadenas.last();
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {
        List<String> ListaCadenas = new ArrayList<String>(this.mapaCadenas.keySet());
    	
        for(int i =0;i<ListaCadenas.size();i++) {
        	
        	String cadena=ListaCadenas.get(i).toUpperCase();
        	ListaCadenas.add(i, cadena);
        	
        	
        	
        }
    	
    	return ListaCadenas;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
    	List<String> ListaValores = new ArrayList<String>(this.mapaCadenas.values());
     	
    	
    	return ListaValores.size();
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {
    	String res = null;
    	for (int i = cadena.length(); i >= 0; i--) {
    	    char car = cadena.charAt(i);
    	    res+=car;
    	}
    	this.mapaCadenas.put(cadena, res);
    	
   
    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {	
    	this.mapaCadenas.remove(llave);
    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {
    	List<String> ListaLlaves = new ArrayList<String>(this.mapaCadenas.keySet());
    	
    	boolean sies= true;
    	int i = 0;
    	while(i<ListaLlaves.size() && sies) {
    		String cadena= mapaCadenas.get(ListaLlaves.get(i));
    		if(cadena==valor) {
    			sies=false;
    			mapaCadenas.remove(ListaLlaves.get(i));
    		}
    			
    		i++;
    		}
    		
    		
    	}
   

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	this.mapaCadenas.clear();
    	for(int i=0; i<objetos.size();i++) {
    		String cadena = objetos.get(i).toString();
    		mapaCadenas.put(cadena, cadena);
    		
    		
    	}
    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {
    	Map<String, String> nuevoMapaCadenas = new HashMap<String, String>( ); 
    	List<String> ListaCadenas = new ArrayList<String>(this.mapaCadenas.keySet());
    	for(int i=0; i<ListaCadenas.size();i++) {
    		 String llave = ListaCadenas.get(i);
    		 String valor = mapaCadenas.get(llave);
    		 llave = llave.toUpperCase();
    		 nuevoMapaCadenas.put(llave, valor);
    	}
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
    	boolean sies = false;
    	List<String> keys= new ArrayList<String>(this.mapaCadenas.keySet());
    	List<String> otroLista = Arrays.asList(otroArreglo);
    	int i =0;
    	
    	while(sies && i<keys.size()) {
    	        
         	String numeroListaKeys= keys.get(i);
         	if(!(otroLista.contains(numeroListaKeys))) {
         		
         		return false;
         		
         	}
         	i++;
         }
     	return true;
    	
    	
    	return false;
    }

}
