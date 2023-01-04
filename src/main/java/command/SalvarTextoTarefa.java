package command;

public class SalvarTextoTarefa implements Tarefa{
	private Texto texto;

    public SalvarTextoTarefa(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.salvar();
    }

    public void cancelar() {
        this.texto.editar();
    }
}
