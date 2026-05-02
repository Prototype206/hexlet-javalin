package gg.jte.generated.ondemand.cars;
import org.example.hexlet.NamedRoutes;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "cars/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,11,11,11,11,11,11,11,11,11,11,11,11,11,18,18,18,18,18,18};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n\n\n<html lang = \"ru\">\n\t<head>\n\t\t<meta charset = \"UTF-8\">\n\t\t<title>Cars</title>\n\t</head>\n\t\n\t<body>\n\t\t<form");
		var __jte_html_attribute_0 = NamedRoutes.carsPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" action=\"");
			jteOutput.setContext("form", "action");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("form", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" method=\"post\">\n\t\t\t<input type=\"text\" name=\"make\" placeholder=\"car make\"/>\n\t\t\t<input type=\"text\" name=\"model\" placeholder=\"car model\"/>\n\t\t\t<input type=\"submit\" value=\"Create\"/>\n\t\t</form>\n\t</body>\n\t\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
