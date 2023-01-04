package command;

public class Texto {
	private String estado;

    public Texto(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    public void editar() {
        this.estado = "Texto em Edição";
    }

    public void salvar() {
        this.estado = "Texto Salvo";
    }
}
