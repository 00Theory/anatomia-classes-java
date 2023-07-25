package estudar.marco;

public class EstruturasRepeticao{
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            
		if(numero==3){
            System.out.println("PULAR O " + numero);
		    continue;
        }
			System.out.println(numero);
		
		
	}
    }
}
