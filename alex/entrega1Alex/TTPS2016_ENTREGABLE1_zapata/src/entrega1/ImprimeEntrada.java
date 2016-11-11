package entrega1;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.text.Chunk;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;

@WebServlet(urlPatterns = { "/ImprimeEntrada" }, initParams = {
		@WebInitParam(name = "Premio1", value = "Cena con estela de carlotto e hija"),
		@WebInitParam(name = "Premio2", value = "Libro noche de los lapices"),
		@WebInitParam(name = "Premio3", value = "DVD pelicula de la noche de los lapices") })
public class ImprimeEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImprimeEntrada() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void generaQR(int val, String nombre, String apellido) {
		try {
			String frase = "Sera en la proxima";
			Random rmd = new Random();
			int num = (int) (rmd.nextDouble() * 6 + 1);
			if (num == 2) {
				frase = "Entrada para " + nombre + " " + apellido + " " + "Felicitaciones!! Ud. ha ganado el premio:"
						+ this.getServletConfig().getInitParameter("Premio1");
			}
			if (num == 3) {
				frase = "Entrada para " + nombre + " " + apellido + " " + "Felicitaciones!! Ud. ha ganado el premio:"
						+ this.getServletConfig().getInitParameter("Premio2");
			}
			if (num == 4) {
				frase = "Entrada para " + nombre + "" + apellido + " " + "Felicitaciones!! Ud. ha ganado el premio:"
						+ this.getServletConfig().getInitParameter("Premio3");
			}
			BitMatrix b;
			Writer w = new QRCodeWriter();
			b = w.encode(frase, BarcodeFormat.QR_CODE, 300, 300);
			try {
				MatrixToImageWriter.writeToStream(b, "png", (new FileOutputStream(
						new File(this.getServletContext().getRealPath("/WEB-INF") + "\\qr" + val + ".png"))));
			} catch (IOException io) {
				System.out.println("error al crear img");
			}

		} catch (WriterException e) {
			System.out.println("error al escribir img");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/pdf");

		ServletContext context = request.getServletContext();
		int val = (int) context.getAttribute("visitantes");

		try {

			Document documento = new Document();
			PdfWriter.getInstance(documento, response.getOutputStream());
			documento.open();
			documento.add(new Paragraph());
			documento.add(new Paragraph());
			documento.add(new Paragraph());
			documento.add(new Paragraph());
			documento.add(new Paragraph("Nombre/s: " + request.getParameter("nombre")));
			documento.add(new Paragraph("Apellido: " + request.getParameter("apellido")));
			documento.add(new Paragraph("Email: " + request.getParameter("email")));
			documento.add(new Paragraph("DNI: " + request.getParameter("dni")));
			if (request.getParameter("select").equals("Las musicletas")) {

				String absolutePathImagen = getServletContext().getRealPath("/imagenes/okupas.jpg");
				Image img = Image.getInstance(absolutePathImagen);
				img.scaleToFit(100, 100);
				img.setAlignment(Chunk.ALIGN_MIDDLE);
				documento.add(img);

			} else {
				if (request.getParameter("select").equals("Las taradas")) {
					Image img = Image.getInstance("/imagenes/lastaradas.jpg");
					img.setAlignment(Chunk.ALIGN_MIDDLE);
					documento.add(img);

				} else {
					if (request.getParameter("select").equals("La minga")) {
						Image img = Image.getInstance("/imagenes/laminga.jpg");
						img.setAlignment(Chunk.ALIGN_MIDDLE);
						documento.add(img);

					} else {
						Image img = Image.getInstance("/imagenes/okupas.jpg");
						img.setAlignment(Chunk.ALIGN_MIDDLE);
						documento.add(img);

					}
				}
			}
//			this.generaQR(val, request.getParameter("nombre"), request.getParameter("apellido"));
//
//			Image img2 = Image.getInstance(this.getServletContext().getRealPath("/WEB-INF/qr" + val + ".png"));
//			img2.setAlignment(Chunk.ALIGN_MIDDLE);
//			documento.add(img2);
			context.setAttribute("visitantes", val);

			documento.close();

			// response.getOutputStream().write();

		} catch (Exception ex) {
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
		}

	}
}
