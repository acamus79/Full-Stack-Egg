package edu.egg.library.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ErroresController implements ErrorController {

    @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView errores(HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("error");
        String mensaje = "";
        int codigo = response.getStatus();

        switch (codigo) {
            case 403:
                mensaje = "No tiene permisos para acceder al recurso";
                break;
            case 404:
                mensaje = "El recurso solicitado no fue encontrado";
                break;
            case 500:
                mensaje = "Ocurrió un error interno";
                break;
            default:
                mensaje = "Se produjo un error inesperado";
        }

        mav.addObject("codigo", codigo);
        mav.addObject("mensaje", mensaje);
        return mav;
    }
}
