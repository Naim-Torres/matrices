public class Encriptacion{
    //variables clase
    private String mensaje;
    private String encriptado="";
    
    //constructor que incializa las variables de clase
    public Encriptacion(String mensaje){
        this.mensaje=mensaje;
    }
    public Encriptacion(){}
    //metodos
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    public String getMensaje(){
        return encriptado;
    }
     public void Encriptar(){
        for(int i=0;i<mensaje.length();i++){
            char array[]=mensaje.toCharArray();
            array[i]=(char)(array[i]*3); 
            encriptado+=array[i];
        }       
    }
    public void Desencriptar(){
        
        for(int i=0;i<encriptado.length();i++){
            char arrayt[]=encriptado.toCharArray();
            arrayt[i]=(char)(arrayt[i]/3);
            mensaje+=arrayt[i];
        }
     }
}