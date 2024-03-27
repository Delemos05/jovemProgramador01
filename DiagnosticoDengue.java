package aula02;

public class DiagnosticoDengue {

	
		 public static void main(String[] args) {
			    String dengue = "";
			    dengue += verificarSintomas("Dor de cabeça");
			    dengue += verificarSintomas("Febre");
			    dengue += verificarSintomas("Dor atrás dos olhos");
			    dengue += verificarSintomas("Dor nas articulações");

			    System.out.println(dengue);
			    diagnostico(dengue);
			    
			  }
			  
			  private static void diagnostico(String dengue){
			        boolean diagnostico = dengue.contains("Dor de cabeça") && dengue.contains("Febre") && dengue.contains("Dor atrás dos olhos") && dengue.contains("Dor nas articulações"); 

			      System.out.println("A pessoa esta com dengue" + " :" + diagnostico);
			  }
			  
			   public static String verificarSintomas(String sintomas){
			     return String.format("%s\n", sintomas);
			   }
			   private static void diagnosticoNovo(String sint1, String sint2, String sint3, String sint4) {
				   	boolean sint1Esperado = sint1.equals(sint1);
				   	boolean sint2Esperado = sint2.equals(sint1);
				   	boolean sint3Esperado = sint3.equals(sint1);
				   	boolean sint4Esperado = sint4.equals(sint1);
			   }

	}


