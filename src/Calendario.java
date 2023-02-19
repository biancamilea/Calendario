public class Calendario {
    int ano;
    int mes;
    int dia;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Calendario(int ano, int mes, int dia){
        if (ano >= 1 && ano <= 9999){
            this.ano = ano;
        } else {
            this.ano = 1;
        }
        if (mes > 0 && mes < 13){
            this.mes = mes;
        } else {
            this.mes = 1;
        }
        if (dia > 0 && dia <= 31){
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }
    public void incrementarDia (){
        if (dia == 31 && mes < 12) {
            this.dia = 1;
            this.mes++;
        } else if (dia < 31 && mes == 12){
            this.mes = 1;
            this.ano++;
            this.dia++;
        } else {
            this.dia++;
        }
    }
    public void incrementarMes (){
        if (mes == 12){
            this.mes = 1;
            this.ano++;
        } else if (mes < 12){
            this.mes++;
        }
    }
    public void incrementarAno(int cantidad){
        this.ano = this.ano + cantidad;
    }
    public void mostrar (){
        System.out.println(dia + "/" +  mes + "/" + ano);
    }
    public boolean iguales(Calendario otraFecha){
        if (this.dia == otraFecha.getDia() && this.mes == otraFecha.getMes() && this.ano == otraFecha.getAno()){
            return true;
        } else {
            return false;
        }
    }
}
