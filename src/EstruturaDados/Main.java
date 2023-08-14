package EstruturaDados;

public class Main {
    public static void main(String[] args) {
        
        Nos<String> nos1 = new Nos<>("Conteúdo no1");

        Nos<String> nos2 = new Nos<>("Conteúdo no2");

        nos1.setProximoNo(nos2);

        Nos<String> nos3 = new Nos<>("Conteúdo no3");
        nos2.setProximoNo(nos3);

        Nos<String> nos4 = new Nos<>("Conteúdo no4");
        nos3.setProximoNo(nos4);

        System.out.println(nos1);
        System.out.println(nos1.getProximoNo());
        System.out.println(nos2);

        System.out.println("--------------");

        System.out.println(nos1);
        System.out.println(nos1.getProximoNo());
        System.out.println(nos1.getProximoNo().getProximoNo());
        System.out.println(nos1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(nos1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
