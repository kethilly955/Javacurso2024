package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
String texto  = "Bem Vindo ao Curso de JAVA";
String texto2 = " Vamos aprender sobre String.";
  //1.Comprimento da String:
String nome = "Kethilly lorranny felix aleixo da silva";
System.out.println("Comprimento da String:" +nome.length());
 // Concatenar Strings:
String textoCompleto = texto + " "+ texto2;
System.out.println("Texto Completo: " + textoCompleto);
//String nome2  = " Kethilly Lorrannyr";
//String sobreNome = " Felix Aleixo Da Silva";
//System.out.println(nome2 + sobreNome);

//3. Converter para MAIÚSCULAS e minúsculas 
	System.out.println("MAIÚSCULAS: "+ texto.toUpperCase());
	System.out.println("minúsculas: "+ texto.toLowerCase());
	
	//4.Substituir uma parte da String:
	String novoTexto = texto.replace("JAVA", "Vitoria");
	System.out.println("Texto após subistituição: " +novoTexto);
	//5.Buscar por uma substring:
	int posicao =  texto.indexOf("curso");
	System.out.println("Posição da palavra 'curso':" + posicao);
	//6.Verificar se uma string começa ou termina com 1 substring
	System.out.println("Começa com 'Bem': " + texto.startsWith("Bem"));
	System.out.println("Começa com 'JAVA': " + texto.endsWith("JAVA"));
	//7.Dividir String:
	String[] palavras = textoCompleto.split(" ");
	System.out.println("Palavras no texto completo:");
	 for (String palavra : palavras ) {
		 System.out.println(palavra);
	 }
	//8.Remover espaços em branco:
	 String textoComEspacos = "     Texto com espacos    ";
	 System.out.println("Texto sem espaço:" +textoComEspacos.trim());
	 }
	
	}
	
	

