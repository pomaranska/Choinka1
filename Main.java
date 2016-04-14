import java.util.Scanner;

import tree.TreeCreator;

public class Main {


	public static void main(String[] args) {
	Scanner odczyt = new Scanner(System.in);

            
	System.out.println("Podaj ilosc warstw: ");
	int ilosc = odczyt.nextInt();
	
			
	System.out.println("Podaj kierunek: \nlewo - left\nœrodek - up\nprawo - right\ndol - down");
	String kierunek = odczyt.next();
	
	
	System.out.println("Podaj znak: ");
	String znak = odczyt.next();
            
	
	TreeCreator tree=new TreeCreator();

	System.out.println(tree.tree(ilosc, znak, kierunek));
	
	odczyt.close();
}
