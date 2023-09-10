package avaliacao;

final public class PessoaJuridica extends ClienteBanco {

    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void verifDoc() {
        if (responsavel.getNome().length() > 30){
            System.out.println("Nome inválido para Responsável.");
        } else {
            System.out.println("Nome válido para Responsável.");
        }
    }

    @Override
    public void validar() {
        if ((this.getNumeroConta() % 2) == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar.");
        }
    }
}
