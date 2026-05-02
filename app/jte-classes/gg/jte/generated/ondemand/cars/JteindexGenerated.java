package gg.jte.generated.ondemand.cars;
import java.util.List;
import org.example.hexlet.dto.cars.CarsPage;
import org.example.hexlet.model.Car;
public final class JteindexGenerated {
	public static final String JTE_NAME = "cars/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,5,5,5,15,15,15,16,16,16,16,16,16,16,16,16,17,17,21,21,21,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CarsPage page) {
		jteOutput.writeContent("\n<html lang = \"ru\">\n\t<head>\n\t\t<meta charset = \"UTF-8\">\n\t\t<title>Cars</title>\n\t</head>\n\t<body>\n\t<div>Cars</div>\n\t<ul>\n\t\t");
		for (Car car : page.getCars()) {
			jteOutput.writeContent("\n\t\t\t<li>");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(car.getId());
			jteOutput.writeContent(", ");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(car.getMake());
			jteOutput.writeContent(", ");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(car.getModel());
			jteOutput.writeContent("</li>\n\t\t");
		}
		jteOutput.writeContent("\n\t</ul>\n\t</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CarsPage page = (CarsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
