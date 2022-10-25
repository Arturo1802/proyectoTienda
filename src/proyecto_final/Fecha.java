package proyecto_final;
public class Fecha {
    protected int dia;
    protected int mes;
    protected int año;
    protected String fechaLarga;
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        if (!validacion()) {
            this.dia=1;
            this.mes=1;
            this.año=2000;
        }
    }
    public Fecha(String fechaLarga){
        this.fechaLarga=fechaLarga;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    private int numDias(){
        if (esBisiesto()) {
            if (mes==2) {
                 return 29;
             }else{ 
                 if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)){
                     return 31;
                 } else {
                     return 30;
                 } 
             } 
        }else {
             if (mes==2) {
                 return 29;
             }else{ 
                 if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)){
                     return 31;
                 } else {
                     return 30;
                 } 
             }   
         }
    
    }
    private static int numDias(int m, int año){
        if (esBisiesto(año)) {
            if (m==2){
                 return 29;
             }else{ 
                 if ((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)){
                     return 31;
                 } else {
                     return 30;
                 } 
             } 
        }else {
             if (m==2) {
                 return 29;
             }else{ 
                 if ((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)){
                     return 31;
                 } else {
                     return 30;
                 } 
             }   
         }
    }
    
    private boolean esBisiesto(){
        return año%4==0 || (año%100==0 && año%400==0);
    }
    
    private static boolean esBisiesto(int año){
        return año%4==0 || (año%100==0 && año%400==0);
    }
    
    
    public boolean validacion(){
         if (esBisiesto()) {
             if (mes==2) {
                 return dia<=29 && dia>0;
             }else{ 
                 if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&& dia<=31 && dia>0) {
                     return true;
                 } else {
                     return (mes==4 || mes==6 || mes==9 || mes==11 )&& dia<=30 && dia>0;
                 } 
             } 
        } else {
            if (mes==2) {
                 return dia<=28 && dia>0;
             }else{ 
                 if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&& dia<=31 && dia>0) {
                     return true;
                 } else {
                     return (mes==4 || mes==6 || mes==9 || mes==11 )&& dia<=30 && dia>0;
                 } 
             }  
        } 
    }

    private String nombreMes(){
        switch (mes) {
            case 1:
                 return "Enero";
            case 2:
                 return "Febrero";
            case 3:                
                 return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:    
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";  
        }
    }
    
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
    public String fechaLarga(){
        return dia+" de "+ nombreMes()+" de "+año;
    }
}
