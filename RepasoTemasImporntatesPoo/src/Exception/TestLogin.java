package Exception;
public class TestLogin {
public static void main(String[] args) {
    
        try {
            Aplicacion app=new Aplicacion();
            //intento login
           Usuario u=app.login("juan","juan123sito");
           //muestre el resultado
            System.out.println(u);
        }
        catch (Exception ex) {
        //ovurrio un error
            System.out.println("Servicio temporalmente interrumpido:");
            System.out.println(ex.getMessage());
                }}}
    

