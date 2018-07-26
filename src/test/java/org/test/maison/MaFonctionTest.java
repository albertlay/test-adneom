package org.test.maison;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/**
 * MaFonctionTest est la classe de test de la methode partition de la classe MaFonction 
 * 
 * @author albert-lay
 *
 */
public class MaFonctionTest {

	/**
	 * Test de la fonction partition avec des sous listes de 1 élément
	 */
	@Test
	public void testPartition1() {
		
		int taille = 1;
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, taille);
		
		List<Integer> itemResult = result.iterator().next();
		
		assertEquals(5, result.size());
		assertEquals(taille, itemResult.size());
		assertEquals(Arrays.asList(1), itemResult);
		
	}
	
	/**
	 * Test de la fonction partition avec des sous listes de 2 éléments
	 */
	@Test
	public void testPartition2() {
		
		int taille = 2;
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, taille);
		
		List<Integer> itemResult = result.iterator().next();
		
		assertEquals(3, result.size());
		assertEquals(taille, itemResult.size());
		assertEquals(Arrays.asList(1, 2), itemResult);
		
	}	
	
	/**
	 * Test de la fonction partition avec des sous listes de 3 élément
	 */
	@Test
	public void testPartition3() {
		
		int taille = 3;
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, taille);
		
		List<Integer> itemResult = result.iterator().next();
		
		assertEquals(2, result.size());
		assertEquals(taille, itemResult.size());
		assertEquals(Arrays.asList(1, 2, 3), itemResult);
		
	}
	

}
