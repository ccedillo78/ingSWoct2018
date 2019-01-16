/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametrosgenerales.clases;

/**
 *
 * @author christian_cedillo
 */
class Parametro {
 private String razonScocial="";
 private String ruc="";
 private double cuotaReferencial=0D;
 private int vigenciaInformacion=-1;
 private int edadMaximaCredito=-1;
 private int edadMinimaCredito=-1;
 private static Parametro isntance;

 public  static Parametro ObtenerParametrizacion() {
    if (isntance  == null) {
    isntance = new Parametro();
    }
     
 return isntance;
 }
 
  private Parametro(){
 
 }

public String obtenerRazonSocial(){
    return razonScocial;
}
public void cambiarRazonSocial(String razonScocial){
    this.razonScocial=razonScocial;
}
public double obtenerCuotaReferencial() {
 return cuotaReferencial;
 }
 
public void cambiarCuotaReferencial(int cuotaReferencial) {
 this.cuotaReferencial = cuotaReferencial;
 }

public double obtenerVigenciaInformacion() {
 return vigenciaInformacion;
 }

public void cambiarVigenciaInformacion(int vigenciaInformacion) {
 this.vigenciaInformacion = vigenciaInformacion;
 }
 

 }
 