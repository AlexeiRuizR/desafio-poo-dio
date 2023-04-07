import com.dio.desafio.dominio.Gerente;
import com.dio.desafio.dominio.Lojas;
import com.dio.desafio.dominio.Vendedor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Alexander");
        vendedor1.setTelefone("+5581585640125");
        vendedor1.setHorasTrabalhadas(192);
        vendedor1.setComision(1.20);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Felix");
        vendedor2.setTelefone("+5581424785689");
        vendedor2.setHorasTrabalhadas(190.8);
        vendedor2.setComision(1.15);

        Vendedor vendedor3 = new Vendedor();
        vendedor3.setNome("Arletis");
        vendedor3.setTelefone("+5581554785136");
        vendedor3.setHorasTrabalhadas(186);
        vendedor3.setComision(1.17);

        Vendedor vendedor4 = new Vendedor();
        vendedor4.setNome("Maria");
        vendedor4.setTelefone("+5581989475237");
        vendedor4.setHorasTrabalhadas(193);
        vendedor4.setComision(1.25);

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Alvaro");
        gerente1.setTelefone("+5581999254574");
        gerente1.setHorasTrabalhadas(205);
        gerente1.setIndiceArea(242.25);

        Gerente gerente2 = new Gerente();
        gerente2.setNome("Andres");
        gerente2.setTelefone("+5581933150027");
        gerente2.setHorasTrabalhadas(196);
        gerente2.setIndiceArea(250);

        Lojas loja1 = new Lojas();
        loja1.setNome("Urbano");
        loja1.getPessoalGerencia().add(gerente1);
        loja1.getPessoalVenda().add(vendedor1);
        loja1.getPessoalVenda().add(vendedor2);

        Lojas loja2 = new Lojas();
        loja2.setNome("Esposende");
        loja2.getPessoalVenda().add(vendedor3);
        loja2.getPessoalVenda().add(vendedor4);
        loja2.getPessoalGerencia().add(gerente2);

        System.out.println("Loja1: " +loja1 + "\n");
        System.out.println("Loja2: " +loja2 + "\n");

    }

}
