/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

//import ejb.facede.UsuarioFacade;

import java.io.IOException;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.spi.SyncFactoryException;
//import ejb.modelo.Persona;
//import ejb.modelo.Usuario;


import org.primefaces.context.RequestContext;
import util.MyUtil;

/**
 *
 * @author PabloA
 */
@ManagedBean(name="loginBean")
@SessionScoped
public class loginBean implements Serializable{
    //@EJB
    //private UsuarioFacade usuarioFacade;

    
    
   //private Usuario usuario;

    //public Usuario getUsuario() {
    //    if (usuario == null){
    //        usuario = new Usuario();
    //        usuario.setPerPerId(new Persona());
    //    }
        
    //    return usuario;
    //}

//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }

    
 

    private String nombre;
    private String clave;
    private boolean logeado = false;
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    
   // Usuario usuario = null;
    //UsuarioFacade uf = new UsuarioFacade();

    public loginBean() {
       
        faceContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest();
        if(httpServletRequest.getSession().getAttribute("sessionUsuario")!=null)
        {
            nombre=httpServletRequest.getSession().getAttribute("sessionUsuario").toString();
        }
    }
    
    

    
    
    public boolean estaLogeado() {
        return logeado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void login(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
      
            
            if (nombre.equals("Pablo")  && clave.equals("admin")) {
                logeado = true;
                msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@ ", nombre.toString());
            } else {
                logeado = false;
                msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
                        "Credenciales no válidas");
                context.addCallbackParam("view", "/faces/index.xhtml");
            }
            FacesContext.getCurrentInstance().addMessage(null, msg);
            context.addCallbackParam("estaLogeado", logeado);
            if (logeado) {
                context.addCallbackParam("view", "Principal.xhtml");
            }
        
     
       
    }
    public void cerrarSession()
    {
        ExternalContext ctx
                = FacesContext.getCurrentInstance().getExternalContext();
        String ctxPath
                = ((ServletContext) ctx.getContext()).getContextPath();

        try {
    // Usar el contexto de JSF para invalidar la sesión,
            // NO EL DE SERVLETS (nada de HttpServletRequest)
            ((HttpSession) ctx.getSession(false)).invalidate();

    // Redirección de nuevo con el contexto de JSF,
            // si se usa una HttpServletResponse fallará.
            // Sin embargo, como ya está fuera del ciclo de vida 
            // de JSF se debe usar la ruta completa -_-U
            ctx.redirect(ctxPath + "/faces/index.xhtml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
 
 
}
         
        
    
