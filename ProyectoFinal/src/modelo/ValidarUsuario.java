package modelo;
public class ValidarUsuario {
    public static void autenticar(Usuario u)
            throws UsuarioNoVaidoException{
if(!(u.getLogin().equals("juan")&&u.getPassword().equals("1234")))
    throw new UsuarioNoVaidoException();
    }
            
}
