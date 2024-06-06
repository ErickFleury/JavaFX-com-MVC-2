
/**
 * Calcula o custo de uma lavagem em um lava-jato
 * 
 * @author Erick_Fleury 
 * @version 0.01
 */
public class Lavagem
{
    String tipoAutomovel;
    String tipoLavagem;
    double valorCompleta  = 300;
    double valorSimples = 100;
    double valorMoto = 30;
    double valorCarro = 100;

    /**
     * Construtor para objetos da classe Lavagem
     */
    public Lavagem(String tipoAutomovel, String tipoLavagem)
    {
        this.tipoAutomovel = tipoAutomovel;
        this.tipoLavagem = tipoLavagem;
    }

    /**
     * Calcula o valor da lavagem
     * 
     * @return     o valor da lavagem dependendo do tipo de automovel e do tipo de lavagem
     */
    public double calcular()
    {
        if(tipoAutomovel.equals("Moto") && tipoLavagem.equals("Simples"))
        {
            return valorMoto + valorSimples;
        }
        else if(tipoAutomovel.equals("Moto") && tipoLavagem.equals("Completa"))
        {
            return valorMoto + valorCompleta;
        }
        else if(tipoAutomovel.equals("Carro") && tipoLavagem.equals("Simples"))
        {
            return valorCarro + valorSimples;
        }
        else if(tipoAutomovel.equals("Carro") && tipoLavagem.equals("Completa"))
        {
            return valorCarro + valorCompleta;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * Retorna o valor da lavagem
     * 
     * @return     Retorna o valor da lavagem
     */
    public String valor()
    {
        if (calcular() < 0) 
        {
            return "Tipo de automovel ou tipo de lavagem inválidos";
        } else
        {
            return Double.toString(calcular());
        }
    }
}
