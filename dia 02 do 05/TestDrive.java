public class TestDrive {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Holls-Royce";
        c1.cor = "Preto-Esbranquiçado";
        c1.velocidade = 10;
        c1.ano = 1952;
        Carro c2 = new Carro();
        c2.marca = "Porche";
        c2.cor = "Branco-Apreteado";
        c2.velocidade = 100;
        c2.ano = 2043;
    c1.aceleracao(120);
    
    
    
    
    
    
    
    
    ("Velocidade inicial do carro é: "+ c1.velocidade + " Km/hora, da marca " + c1.marca);
    c1.freio(10);
    System.out.println("Velocidade atual é de: "+ c1.velocidade + " Km/hora, da marca " + c1.marca);
    c2.aceleracao(40);
    System.out.println("Velocidade do carro é: "+ c2.velocidade + " Km/hora, da marca " + c2.marca + " da cor " + c2.cor);
    }
}
