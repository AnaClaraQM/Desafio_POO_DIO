package Desafio_POO;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Curso Programacao Orientada a Obejtos em Java");
        c1.setDescricao("Curso voltado a lingugem Java");

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria do curso de POO");
        m1.setDescricao("Mentoria voltada ao curso de POO em Java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp DIO BAnco PAN");
        bootcamp.setDescricao("Bootcamp oferecido pela Digital Innovation One");
        //bootcamp.getInformacao().add(c1);
        //bootcamp.getInformacao().add(m1);

        Desenvolvedor d1 = new Desenvolvedor();
        d1.setNome("Desenvolvedor d1");
    }
}
