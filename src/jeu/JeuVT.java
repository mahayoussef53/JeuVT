package jeu;

import java.util.*;

import javax.swing.JOptionPane;

public class JeuVT {
	static int[] essai = new int[5];
	static int [] secret = new int[5];
	static int nbEssai=0;
	static int nbV;
	static int nbT;
	static int sec;
	static int ess;

boolean verifNum(int[] t){

	for(int i=0;i<t.length-1;i++)
		for(int j=i+1; j<t.length; j++)
			if(t[i]==t[j])
				return false;
	return true;
}

int verifV(int[] a, int[] b){

	 int v=0;

	 for(int i=0; i< a.length; i++)
		for(int j=0; j<b.length; j++)
			if ( (a[i]==b[j]) && (i!=j) )
				v++;
	return v;
}

int verifT(int[] a, int[] b){

	int t=0;
	
	for(int i=0; i<a.length; i++)
		if(a[i]==b[i])
			t++;
	return t;
}	

boolean validerNum(int x, int[] t){

	if ( ( x>99999) || (x<10000) ) {
		return false;}
	t[0]= x / 10000 ;
	t[1]= ( x % 10000 ) / 1000 ;
	t[2]= ( x % 1000 ) / 100;
	t[3]= ( x % 100 ) / 10;
	t[4]= ( x % 10 );
	

	return ( verifNum(t) );
}	



public void play(){

	
	Scanner sc=new Scanner(System.in);
	Random r = new Random();
	

	//Début du jeu 

	do
		sec = r.nextInt(90000)+10000;// min +r.nextInt(max-min)
		//sec=(int)(Math.random()*89999 +10000);

	while(! validerNum ( sec , secret) );
	
	do{
		//JOptionPane.showMessageDialog(null,  sec,"", JOptionPane.INFORMATION_MESSAGE);
		nbEssai++;
		
		do{
			System.out.print("Essai n°"+nbEssai+" : ");
			ess = sc.nextInt();
		} while	(! validerNum ( ess , essai) );
		
		nbV=verifV(essai, secret);
		nbT=verifT(essai, secret);
		

		System.out.println(ess+"  "+nbV+" V  -  "+nbT+" T");
	
	}while( ( nbT!=5) && (nbEssai<10) );

	if (nbT==5) {
		System.out.println("bravo");
		
		}
	else {
	
		System.out.println("Echec!! le numéro secret était : "+sec);
		}
}
public static void main(String[] args) {
	JeuVT jeu =new JeuVT();
	jeu.play();
	
}
}
