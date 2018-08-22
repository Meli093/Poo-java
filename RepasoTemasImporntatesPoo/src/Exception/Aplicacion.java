/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.ResourceBundle;

/**
 *
 * @author MR
 */
public class Aplicacion {
public Usuario login(String usrname,String password){
    try {//leemos el archivo de propiedades que debe estar ubicado
        //en el package root
        ResourceBundle rb=ResourceBundle.getBundle("usuario");
        //leemos el valor de la propiedadusrname
        String pwd=rb.getString("usrname");
        //llemos el valor de usrname
        String usr=rb.getString("usrname");
        //leemos el valor de la propiedad usrname
        Usuario u= null;
        //si coniciden los datos proporcionados con los leidos
        if (usr.equals(usrname)&&pwd.equals(password)) 
        {
        //instanciio y seteo de los datos
        u =new Usuario();
        u.setUsrname(usr);
        u.setPassword(pwd);
        u.setNombre(rb.getString("nombre"));
        u.setEmail(rb.getString("email"));
        }
        //retorno la instancia o null si no entro al if
        return u;
       }
        catch(Exception ex){
    //cualquier error"salgo por exception"
    throw new RuntimeException("Error verificado datos",ex);
        }}}
  

