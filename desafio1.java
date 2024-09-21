class Tarefa {
    private String nome;
    public Tarefa(String nome) {
        this.nome = nome;
    }
    public int calcularDiasRestantes() {
        return 0;
    }
    public String getNome() {
        return nome;
    }
}
class TarefaSemPrazo extends Tarefa {
        public TarefaSemPrazo(String nome) {
        super(nome);
    }
    @Override
    public int calcularDiasRestantes() {
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {  
        TarefaSemPrazo tarefa = new TarefaSemPrazo("Estudar Java");
        System.out.println("Tarefa: " + tarefa.getNome() + ", Dias restantes: " + tarefa.calcularDiasRestantes());
    }
}