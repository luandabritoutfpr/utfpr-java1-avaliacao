package avaliacao;

public class TstConta {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();

        try {

            //teste de cenário feliz!
            pj.setNumeroConta(3);
            pj.setCnpj(1234);
            pj.getEnder().setRua("travessia central");
            pj.getResponsavel().setCpf(15);
            pj.getResponsavel().setNome("Maria");

            System.out.println("Número da conta: " + pj.getNumeroConta());
            pj.validar();
            System.out.println("CNPJ: " + pj.getCnpj());
            System.out.println("Rua: " + pj.getEnder().getRua());
            System.out.println("CPF do responsável: " + pj.getResponsavel().getCpf());
            pj.getResponsavel().verifDoc();
            System.out.println("Nome do responsável: " + pj.getResponsavel().getNome());
            pj.verifDoc();

        } catch (NumException e) {
            e.impMsg();
        }


    }



}