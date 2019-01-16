/*
 * Trabajo de arquitectura de aplicaciones
 * Tema:Patrones de diseño
 */
package parametrosgenerales;

/**
 *
 * @author christian_cedillo
 * Estructura de la clase de parámetros generales
 */
class Parametro {
 //campo razon social->parámetro general
 private String razonScocial="";
 //ruc de la empresa->parámetro general
 private String ruc="";
 //cuota referencial del crédito para clientes nuevos
 private double cuotaReferencial=0D;
 //vigencia de la información de buró de crédito para analizar clientes
 private int vigenciaInformacion=-1;
 //Edad máxima del cliente que aplica un crédito
 private int edadMaximaCredito=-1;
 //Edad mínima del cliente que aplica un crédito
 private int edadMinimaCredito=-1;
 //variable de Instancia única
 private static Parametro isntance;

 
 public  static Parametro ObtenerParametrizacion() {
    if (isntance  == null) {
    isntance = new Parametro();
    }
     
 return isntance;
 }
 //Constructor de la clase Parametro
  private Parametro(){
 
 }
//Método para obtener la razón social de la empresa
public String obtenerRazonSocial(){
    return razonScocial;
}
//Método para modificar la razón social de la empresa
public void cambiarRazonSocial(String razonScocial){
    this.razonScocial=razonScocial;
}
//Método para obtener la cuota referencial del crédito para clientes nuevos
public double obtenerCuotaReferencial() {
 return cuotaReferencial;
 }
 //Método para modificar la cuota referencial del crédito para clientes nuevos
public void cambiarCuotaReferencial(int cuotaReferencial) {
 this.cuotaReferencial = cuotaReferencial;
 }
//Método para obtener la vigencia de información de buró de crédito consultado 
public double obtenerVigenciaInformacion() {
 return vigenciaInformacion;
 }
//Método para modificar la vigencia de la información de buró de crédito para analizar clientes
public void cambiarVigenciaInformacion(int vigenciaInformacion) {
 this.vigenciaInformacion = vigenciaInformacion;
 }
 

 }
 




class InvocarParametrosGenerales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Creación de la instancia de la clase Parametro
      Parametro pg=  Parametro.ObtenerParametrizacion();
      //Seteo de la razón social de la clase Parámetro
      pg.cambiarRazonSocial("UNICOMER DEL ECUADOR S.A");
      //Obtiene el valor del campo razon social de la instancia y HashCode de la instancia
      System.out.println("1  : Instancia "  + pg.hashCode()+ "-" + pg.obtenerRazonSocial()); 
      
      Parametro pg2=  Parametro.ObtenerParametrizacion();
      //Obtiene el valor del campo razon social de la instancia y HashCode de la instancia
      System.out.println("2  : Instancia " + pg2.hashCode()+ "-" + pg2.obtenerRazonSocial()); 
      
      
      Parametro pg3=  Parametro.ObtenerParametrizacion();
      //Obtiene el valor del campo razon social de la instancia y HashCode de la instancia
      System.out.println("3  : Instancia " + pg3.hashCode()+ "-" + pg3.obtenerRazonSocial()); 
    }
    
}
