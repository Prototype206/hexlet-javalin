package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
import org.example.hexlet.NamedRoutes;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,14,14,14,14,14,14,14,14,14,14,16,16,16,21,21,21,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"ru\">\n\t<head>\n\t\t<meta charset=\"UTF-8\">\n\t\t<title>TITLE</title>\n\t</head>\n\t<body>\n\t\n\t\t<h1>Javalin</h1>\n\t\t<h2><a");
		var __jte_html_attribute_0 = NamedRoutes.coursesPath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">Come back to main</a></h2>\n\t\t<div>\n\t\t\t");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n\t\t</div>\n\t\t<div><a href = \"https://github.com/Prototype206/hexlet-javalin.git\">Welcome to my page</a></div>\n\t\t\n\t</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
