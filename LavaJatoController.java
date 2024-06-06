import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author Erick
 * @version 0.01
 */
public class LavaJatoController
{
    LavaJatoView view;
    Stage stage;
    Lavagem lavagem;
    public Label labelResultado;
    public Label labelTitulo;
    public Button buttonCalcular;
    public Label labelPlaceholder;
    public Button buttonTipoAutomovel;
    public Button buttonTipoLavagem;
    
    /**
     * Construtor para objetos da classe LavaJatoController
     */
    public LavaJatoController()
    {
        this.stage = new Stage();
        this.view = new LavaJatoView();
        this.view.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.view.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            Lavagem lavagem = new Lavagem(buttonTipoAutomovel.getText(), buttonTipoLavagem.getText());
            this.labelResultado.setText(lavagem.valor());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoAutomovelClicado(Event e) {
        if (buttonTipoAutomovel.getText().equals("Moto")) {
            buttonTipoAutomovel.setText("Carro");
        } else {
            buttonTipoAutomovel.setText("Moto");
        }
    }    

    public void botaoLavagemClicado(Event e) {
        if (buttonTipoLavagem.getText().equals("Simples")) {
            buttonTipoLavagem.setText("Completa");
        } else {
            buttonTipoLavagem.setText("Simples");
        }
    }
}
