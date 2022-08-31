package com.xeridia.f.Objetos.ejercicios;

// dia, mes año; min hora seg
public class Fecha {
    //ATRIBUTOS
   private int agno;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;

//    String uncero;

    //CONSTRUCTOR año, mes, dia


    public Fecha(int agno, int mes, int dia) {
        this.agno = agno;

        if (comprobacionmes(mes)) {
            this.mes = mes;
        }else {
            this.mes = 1;
        }


        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                if (dia >= 31 || dia < 0){
                    this.dia = 0;
                } else {
                    this.dia = dia;
                }
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                if (dia >= 30 || dia < 0){
                    this.dia = 0;
                } else {
                    this.dia = dia;
                }
                break;
            default:
                break;
        }

        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;


    }
//CONSTRUCTOR año, mes, dia, hora, minuto, segundo
    public Fecha(int agno, int mes, int dia, int hora, int minuto, int segundo) {
        this.agno = agno;

       if (comprobacionmes(mes)) {
           this.mes = mes;
       }else {
           this.mes = 1;
       }


       if (dia < 31 && dia >0){
           this.dia = dia;
       } else {
            this.dia = 1;
       }


       if (hora <= 24 && hora > 0) {
           this.hora = hora;
       } else {
           this.hora = 1;
       }

        if (minuto <= 60 && minuto > 0) {
            this.minuto = minuto;
        } else {
            this.minuto = 1;
        }

//        if (minuto < 10 && minuto >0){
//            this.minuto = minuto;
//              uncero = "0" + minuto;
//        } else if (minuto <= 60 && minuto > 0) {
//            this.minuto = minuto;
//        } else {
//            this.minuto = 1;
//        }


        if (segundo <= 60 && segundo > 0) {
            this.segundo = segundo;
        } else {
            this.segundo = 1;
        }
    }

//Comprobacion MES
    private boolean comprobacionmes (int mes){
        if (mes <= 12 && mes > 0){
            return true;
        }else {
            return false;
        }
    }


//GET AND SET
    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
//CONVERSION LA FECHA A SEGUNDOS

     public long obtenerSegundos(){

     return this.segundo + this.minuto*60 + this.hora * 3600 + this.dia * 8640 + this.mes * 2628000 + this.agno * 31536000;
    }

     public boolean masRecienteQue(Fecha f) {

    Fecha fecha = (Fecha) f;


     long n1 = this.obtenerSegundos();
     long n2 = fecha.obtenerSegundos();

    if (n1 >= n2){
                return true;
            } else return false;
 }

// CONVERSION FECHA A SEGUNDOS DE OTRA MANERA

//    private long convertirAgno (){
//        int age = (this.agno - 1970)*31536000;
//        return age;
//    }
//
//    private long convertirMes (){
//        return this.mes * 2628000;
//    }
//    private long convertirDia (){
//        return this.dia * 8640;
//    }
//
//    private long convertirHora (){
//        return this.hora * 3600;
//    }
//
//    private long convertirMinuto (){
//        return this.minuto * 60;
//    }
//
//    // MAYOR QUE (comparacion de segundos)

//    public boolean mayorQue (Fecha f){
//
//        long result1 = 0;
//        long result2 = 0;
//
//        Fecha fecha = (Fecha) f; //compara todos los atributos con los propios
//
//        result1 = this.convertirAgno() + this.convertirMes() + this.convertirDia()+ this.convertirHora() + this.convertirMinuto() + this.segundo;
//        result2 = fecha.convertirAgno() + fecha.convertirMes() + fecha.convertirDia()+ fecha.convertirHora() + fecha.convertirMinuto() + segundo;
//
//        if (result1 >= result2){
//            return true;
//        } else return false;


//



    private int segundo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fecha)) return false; //mira si es un objeto fecha
        Fecha fecha = (Fecha) o;  //compara todos los atributos con los propios
        return getAgno() == fecha.getAgno() && getMes() == fecha.getMes() && getDia() == fecha.getDia() && getHora() == fecha.getHora() && getMinuto() == fecha.getMinuto() && getSegundo() == fecha.getSegundo();
    }


    @Override
    public String toString() {
        return "Fecha{" +
                "agno=" + agno +
                ", mes=" + mes +
                ", dia=" + dia +
                ", hora:" + hora +
                ", minuto:" + String.format("%02d", minuto) +
                ", segundo=" + segundo +
                '}';
    }
}
