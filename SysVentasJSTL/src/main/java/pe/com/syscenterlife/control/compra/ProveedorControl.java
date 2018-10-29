/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.control.compra;

import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.com.syscenterlife.servicio.global.PersonaServicioI;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Controller
public class ProveedorControl {
    
    @Autowired
    private MessageSource messageSource;
    @Autowired
    PersonaServicioI personaServicioI;

    @RequestMapping(value = {"/provMain" }, method = RequestMethod.GET)    
    public ModelAndView inicioProveedor(Locale locale, Map<String,Object> model){
        return new ModelAndView("compra/proveedor/mainProveedor");
    }    
}