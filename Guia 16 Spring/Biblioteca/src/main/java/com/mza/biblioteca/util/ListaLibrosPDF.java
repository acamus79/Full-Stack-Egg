/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.util;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.mza.biblioteca.entidades.Libro;
import java.awt.Color;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

/**
 *
 * @author Adrian E. Camus
 */
@Component("listalibros")
public class ListaLibrosPDF extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Libro> listaLibros = (List<Libro>) model.get("libros");
        float[] anchos = {8f,60f, 50f, 50f, 10f,10f,10f,10f};
        
         //creo una tabla para el titulo
        final PdfPTable tablaTitulo = new PdfPTable(1);
        //creo una Celda titulo y le doy formato
        PdfPCell titulo = new PdfPCell(new Phrase("LISTA DE LIBROS REGISTRADOS"));
        titulo.setBorder(0);
        titulo.setBackgroundColor(new Color(100, 161, 157));
        titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
        titulo.setVerticalAlignment(Element.ALIGN_CENTER);
        titulo.setPadding(5);
        //a la tabla Titulo le agrego la Celda titulo
        tablaTitulo.addCell(titulo);
        tablaTitulo.setSpacingAfter(15);//para agregar espacio luego de esta tabla
        
        //Creo un objeto de PdfPTable de 8 columnas para los libros
        final PdfPTable tablaLibros = new PdfPTable(8);
        tablaLibros.setSplitLate(true);
        tablaLibros.setWidths(anchos);
        
        //Creo una tablaigual de 8 columnas para los nombres de cada columna
        final PdfPTable tablaNomb = new PdfPTable(8);
        tablaNomb.setWidths(anchos);
        tablaNomb.addCell(new PdfPCell(new Phrase("Nro.")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Título")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Autor")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Editorial")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Ej.")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Pr.")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Dis.")));
        tablaNomb.addCell(new PdfPCell(new Phrase("Est.")));
        
        //dando el tamaño al Documento y poniendolo en horizontal
        document.setPageSize(PageSize.A4.rotate());
        document.setMargins(-25, -30, 20, 10);
        //abro el documento 
        document.open();
        
       
        
        //PdfPCell nro = new 
        
        
        
        
        /*
        Para rellenar la tablaLibros:
        Utilizo un For comun ya que necesito un indice para contar cuantos libros
        tiene la lista, ya que mi ID es de tipo String y no un autoincremental
         */
        
        for (int i = 0; i < listaLibros.size(); i++)
        {
            tablaLibros.addCell(String.valueOf(i+1));//asi obtengo un contador de libros
            tablaLibros.addCell(listaLibros.get(i).getTitulo());
            tablaLibros.addCell(listaLibros.get(i).getAutor().getNombre());
            tablaLibros.addCell(listaLibros.get(i).getEditorial().getNombre());
            tablaLibros.addCell(listaLibros.get(i).getEjemplares().toString());
            tablaLibros.addCell(listaLibros.get(i).getEjemplaresPrestados().toString());
            tablaLibros.addCell(listaLibros.get(i).getEjemplaresRestantes().toString());
            tablaLibros.addCell(listaLibros.get(i).getAlta().toString());
        }
        
        document.addTitle("LISTA DE LIBROS REGISTRADOS");
        document.add(tablaTitulo);
        document.add(tablaNomb); 
        document.add(tablaLibros);
        document.close();
    }

}
