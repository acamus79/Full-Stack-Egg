/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.util;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.entidades.Prestamo;
import com.mza.biblioteca.entidades.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *
 * @author Adrian E. Camus
 */
@Component("prestamo")
public class ReciboPrestamoPDF extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        Libro libro = (Libro) model.get("libro");
        Usuario usuario = (Usuario) model.get("usuario");
        Prestamo prestamo = (Prestamo) model.get("prestamo");
        
        //Creo un objeto de PdfPTable de 8 columnas
        final PdfPTable tabla = new PdfPTable(8);
        //dando el tamaño al Documento y poniendolo en horizontal
        
        document.setPageSize(PageSize.A4.rotate());
        
        /*
        Para rellenar la tabla:
        Utilizo un For comun ya que necesito un indice para contar cuantos libros
        tiene la lista, ya que mi ID es de tipo String y no un autoincremental
         */
        
 

        
        document.open();
        document.addTitle("LISTA DE LIBROS REGISTRADOS");
        document.add(new Paragraph(" COMPROBANTE DE PRESTAMO"));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "+ libro.getTitulo()));
        document.add(new Paragraph(" "));
        document.add(tabla);
        document.close();
    }

}
