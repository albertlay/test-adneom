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
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, 1);
		
		assertEquals(5, result.size());
		assertEquals(Arrays.asList(1), result.iterator().next());
		
	}
	
	/**
	 * Test de la fonction partition avec des sous listes de 2 éléments
	 */
	@Test
	public void testPartition2() {
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, 2);
		
		assertEquals(3, result.size());
		assertEquals(Arrays.asList(1, 2), result.iterator().next());
		
	}	
	
	/**
	 * Test de la fonction partition avec des sous listes de 3 élément
	 */
	@Test
	public void testPartition3() {
		
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		Collection<List<Integer>> result = MaFonction.partition(liste, 3);
		
		assertEquals(2, result.size());
		assertEquals(Arrays.asList(1, 2, 3), result.iterator().next());
		
	}
	

}
