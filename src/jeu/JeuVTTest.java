package jeu;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JeuVTTest {
	JeuVT jeu =new JeuVT();
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	jeu.play();
	}
	
	@Test
	void test1() {
		
		 assertEquals(4,jeu.verifT( new int[]{1,2,3,4,5,6}, new int[]{1,2,3,5,4,6}));
	}
	//Verfication la fonction verifV
	@Test
	void test2() {
		
		 assertEquals(2,jeu.verifV( new int[]{1,2,3,4,5,6}, new int[]{1,2,3,5,4,6}));
	}
	//Verfication la fonction validerNum
	@Test
	void test3() {
		
		 assertTrue(jeu.validerNum(12230, new int[5]));
	}
	@Test
	void test4() {
		
		 assertTrue(jeu.validerNum(125306, new int[5]));
	}
	@Test
	void test5() {
		
		 assertTrue(jeu.validerNum(-12306, new int[5]));
	}
	
	

}
