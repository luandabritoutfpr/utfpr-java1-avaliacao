package avaliacao;

final public class PessoaFisica extends ClienteBanco {

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void verifDoc() {
        if (this.cpf >= 10 && this.cpf <= 20){
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
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
