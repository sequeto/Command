package command;

public class EditarTextoTarefa implements Tarefa{
	private Texto texto;

    public EditarTextoTarefa(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.editar();
    }

    public void cancelar() {
        this.texto.salvar();
    }
}
