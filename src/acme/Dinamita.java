/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme;

/**
 *
 * @author rafa
 * 
 * Proporciona una manera de activar de forma remota explosivos para hacervolar correcaminos.
 * <p>
 * Trata de usar primero
 * {@link Smartphone.zapRoadRunner()}
 * Sin embargo, en casos graves de infestación de correcaminos, el metodo
 * {@link zapRadRunner()} podría ser
 * suficientemente eficiente. En estos casos probablemnte quieras recurrir a
 * {@link blowDinamitaBigBang()} para aniquilarlos todos a la vez.
 * alejese de la zona.
 * see also Dinamita.java
 */
public class Dinamita {
    
    /*  -Descripción del método: Permite detonar de forma remota una carga de dinamita, 
        <b> aléjese antes de activar el método </b>
        -Parámetrosmegatones: indica el número de megatones de explosivo
        -Añade también una referencia  al método blowDinamitaSilentBangde la misma clase y al método
         zapRoadRunnerde la clase smartphone enla sección "Seealso" de la documentación del método. */
    
    public void blowDinamitaBigBang(int megatones) {
        System.out.println("Colocando un cartucho de dinamita de " + megatones + "megatones.");
        System.out.println("kaboomg!!!  mega explosión!!!");
    }
    
    /*  -Descripción del método: Permite detonar de forma remota una bomba silenciosa,
        <b> no espere la emisión de absolutamente ningún sonido</b>
        -Parámetrosmegatones: indica el número de megatones de explosivo
        -Añade también una referencia  al método blowDinamitaBigBangde la misma clase y al método
         zapRoadRunnerde la clase smartphone enla sección "Seealso" de la documentación del método. */
    
    /**
     *
     * @param megatones
     */
    public void blowDinamitaSilentBang(int megatones) {
        System.out.println("Colocando una bomba silenciosa de " + megatones + "megatones");
        System.out.println("<booom silencioso>. nada se oye.");
    
}
}
