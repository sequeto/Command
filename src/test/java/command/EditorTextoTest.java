package command;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EditorTextoTest {
	
	EditorTexto editor;
    Texto texto;

    @Before
    public void setUp() {
    	editor = new EditorTexto();
        texto = new Texto("Texto em Edição");
    }

    @Test
    public void deveSalvarTexto() {
        Tarefa salvar = new SalvarTextoTarefa(texto);
        editor.executarTarefa(salvar);

        assertEquals("Texto Salvo", texto.getEstado());
    }

    @Test
    public void deveEditarTexto() {
        Tarefa editar = new EditarTextoTarefa(texto);
        editor.executarTarefa(editar);

        assertEquals("Texto em Edição", texto.getEstado());
    }

    @Test
    public void deveCancelarEdiçãoDeTexto() {
        Tarefa salvar = new SalvarTextoTarefa(texto);
        Tarefa editar = new EditarTextoTarefa(texto);

        editor.executarTarefa(salvar);
        editor.executarTarefa(editar);

        editor.cancelarUltimaTarefa();

        assertEquals("Texto Salvo", texto.getEstado());
    }

}
