
public class Main {
  public static void main(String[] args) {
   System.out.println("Hello world!");
    boolean media = true;
    boolean frequencia = true;
    boolean aprovado = media && frequencia;
    boolean cafe = false;
    boolean agua = true;
    boolean clienteServido = cafe || agua;

    System.out.print(clienteServido);
  }

}