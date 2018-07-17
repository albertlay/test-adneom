package org.test.maison;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * MaFonction est la classe qui offre la fonction de répartition
 * 
 * @author albert-lay
 *@version 1.0
 */
public class MaFonction {

	/**
	 * Retourne une liste de sous liste
	 * @param liste
	 * @param taille
	 * @return une liste <T>Collection<List<Integer>>
	 */
	public static <T>Collection<List<Integer>> partition(List<Integer> liste, int taille){
		final AtomicInteger counter = new AtomicInteger(0);
		return liste.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / taille))
                .values();
	}
	
}
