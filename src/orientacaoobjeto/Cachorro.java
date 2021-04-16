
package orientacaoobjeto;


public class Cachorro {
   
    public Cachorro(String nome, String raca, int idade) {
        
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
}
    
    String nome;
    String raca;
    int idade;
    
    public void Latir(){
        
        System.out.println("CACHORRO ESCREVAL AU AU");
        
    }
    
    public void Lamber(){
        
        System.out.println("HUMMMMM LAMBE LAMBE, ECA BABA DE CACHORRO");
        
    }
    
    public void Morder(){
        
        System.out.println("BARULHO DE MORDIDA, CACHORRO ARRANCOU SUA PERNA");
    }
    
    public void Apresentar(){
        
        System.out.println("PRAZER SOU " + nome + " TENHO " + idade + " ANOS E SOU UM " + raca );
        
    }
}
