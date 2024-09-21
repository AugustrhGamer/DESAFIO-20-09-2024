interface Notificacao {
    void enviarNotificacao();
}
class TarefaUrgente implements Notificacao {
    @Override
    public void enviarNotificacao() {
        System.out.println("esta é uma notificação de tarefa urgente");
    }
}
public class Main {
    public static void main(String[] args) {
        TarefaUrgente tarefa = new TarefaUrgente();
        tarefa.enviarNotificacao();
    }
}