package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,14,14,14,14,17,17,17,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"ru\">\n\t<head>\n\t\t<meta charset=\"UTF-8\">\n\t\t<title>TITLE</title>\n\t</head>\n\t<body>\n\t\t<h1>Javalin</h1>\n\t\t<h2><a href = \"/courses\">Come back to main</a></h2>\n\t\t<div><h1>This is main layout</h1></div>\n\t\t\t");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n\t\t<div><a href = \"https://github.com/Prototype206/hexlet-javalin.git\">Welcome to my page</a></div>\n\t</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
