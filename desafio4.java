interface Notificacao {
    void enviarAlerta(String mensagem);
}
class Tarefa {
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class TarefaComAlerta extends Tarefa implements Notificacao {
    public TarefaComAlerta(String nome) {
        super(nome);
        enviarAlerta("Tarefa '" + nome + "' foi criada com sucesso!");
    }
    @Override
    public void enviarAlerta(String mensagem) {
        System.out.println("ALERTA: " + mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        TarefaComAlerta tarefa = new TarefaComAlerta("Estudar Java");
    }
}