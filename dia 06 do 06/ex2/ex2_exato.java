package ex2; 
    import java.util.Scanner;

public class ex2_exato{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        double h, b, B;
        Double a;
        
        System.out.print("Digite a altura: ");
        h = input.nextDouble();
        
        System.out.print("Digite a base menor: ");
        b = input.nextDouble();
        
        System.out.print("Digite a base maior: ");
        B = input.nextDouble();
        
        a = (h * (b + B)) /2;  

        System.out.println("O valor arredondado é:  " +a.intValue());   
    }
    
}
