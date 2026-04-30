package gg.jte.generated.ondemand.cars;
import org.example.hexlet.dto.cars.CarPage;
import org.example.hexlet.model.Car;
public final class JteshowGenerated {
	public static final String JTE_NAME = "cars/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,13,13,13,13,14,14,14,15,15,15,19,19,19,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CarPage page) {
		jteOutput.writeContent("\n<html lang=\"ru\">\n\t<head>\n\t\t<meta charset = \"UTF-8\">\n\t\t<title>Cars</title>\n\t</head>\n\t\n\t<body>\n\t\t<div>\n\t\t\t<p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(page.getCar().getId());
		jteOutput.writeContent("</p>\n\t\t\t<p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(page.getCar().getMake());
		jteOutput.writeContent("</p>\n\t\t\t<p>");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(page.getCar().getModel());
		jteOutput.writeContent("</p>\n\t\t</div>\n\t</body>\n\t\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CarPage page = (CarPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
