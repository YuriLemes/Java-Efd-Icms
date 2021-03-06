package br.com.samuelweb.efd.icms.util;

import java.time.LocalDate;
import java.util.Collection;

public final class Util {
	
	private final static LocalDate dataVersao2_0_19 = LocalDate.of(2017, 01, 01);
	
	/**
	 * Construtor privado para garantir o Singleton.
	 */
	private Util() {

	}

	/**
	 * Verifica se um objeto está vazio.
	 * 
	 * @param obj
	 * @return <b>true</b> se o objeto for vazio(empty).
	 */
    public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof Collection)
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}
    
    /**
	 * Preenche o Registro
	 * 
	 * @param String
	 */
    public static String preencheRegistro(String string) {
    	return Util.isEmpty(string)? "" : string;
	}
    
    public static boolean versao2_0_19(){
    	return LocalDate.now().isAfter(dataVersao2_0_19);
    }
    
   
}