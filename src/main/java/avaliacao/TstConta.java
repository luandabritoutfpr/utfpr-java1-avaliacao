package avaliacao;

public class TstConta {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();

        try {

            //entrada de dados
            pj.setNumeroConta(4);
            pj.setCnpj(1234);
            pj.getEnder().setRua("travessia central");
            pj.getResponsavel().setCpf(15);
            pj.getResponsavel().setNome("Maria");

            //saída de dados
            System.out.println("\nCenário Feliz! Número conta positivo e par, CPF válido e Nome válido.");
            System.out.println("Número da conta: " + pj.getNumeroConta());
            pj.validar();
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Rua: " + pj.getEnder().getRua());
            System.out.println("CPF do responsável: " + pj.getResponsavel().getCpf());
            pj.getResponsavel().verifDoc();
            System.out.println("Nome do responsável: " + pj.getResponsavel().getNome());
            pj.verifDoc();

            //entrada de dados
            pj.setNumeroConta(3);
            pj.setCnpj(1234);
            pj.getEnder().setRua("travessia central");
            pj.getResponsavel().setCpf(123);
            pj.getResponsavel().setNome("Maria da silva santos oliveira souza de lima dantas");

            //saída de dados
            System.out.println("\nCenário não feliz! Número conta positivo e impar, CPF inválido e Nome inválido.");
            System.out.println("Número da conta: " + pj.getNumeroConta());
            pj.validar();
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Rua: " + pj.getEnder().getRua());
            System.out.println("CPF do responsável: " + pj.getResponsavel().getCpf());
            pj.getResponsavel().verifDoc();
            System.out.println("Nome do responsável: " + pj.getResponsavel().getNome());
            pj.verifDoc();

            //entrada de dados
            System.out.println("\nCenário com exceção! Número conta negativo!");
            pj.setNumeroConta(-10);

        } catch (NumException e) {
            e.impMsg();
        }


    }



}