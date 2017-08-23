
public class Reloj
{
    private int horas;
    private int minutos;
    public Reloj(int horaInicial, int minInicial)
    {
        horas = horaInicial;
        minutos = minInicial;
        
    }
    public String dimeTuTiempo()
    {
        String cadResultado = "";
        cadResultado = cadResultado + horas;
        cadResultado += ":";
        cadResultado += minutos;
        return cadResultado;
    }
    
    public void ticTac()
    {
        minutos += 1;
        if(minutos>59)
        {
            minutos = 0;
            horas += 1;
        }
        if(horas>24)
        {
            horas = 1;
            minutos = 0;
        }
    }
    
}
