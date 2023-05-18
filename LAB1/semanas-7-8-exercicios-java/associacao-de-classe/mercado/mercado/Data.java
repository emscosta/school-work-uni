public class Data{
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(){
        this.dia = dia;
    }
    
    public void setMes(){
        this.mes = mes;
    }
    
    public void setAno(){
        this.ano = ano;
    }

    
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}