class Tarefa {
    String descricao;
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public void exibirDetalhes() {
        System.out.println("Tarefa: " + descricao);
    }
}
class TarefaUrgente extends Tarefa {
    public TarefaUrgente(String descricao) {
        super(descricao);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Tarefa urgente: " + descricao);
    }
}
class TarefaComPrazoFlexivel extends Tarefa {
    public TarefaComPrazoFlexivel(String descricao) {
        super(descricao);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Tarefa com prazo flexivel: " + descricao);
    }
}
public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new TarefaUrgente("Enviar relatório");
        Tarefa tarefa2 = new TarefaComPrazoFlexivel("Organizar a estante");        
        tarefa1.exibirDetalhes();
        tarefa2.exibirDetalhes();
    }
}