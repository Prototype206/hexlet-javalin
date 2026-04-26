package gg.jte.generated.ondemand.courses;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "courses/build.jte";
	public static final int[] JTE_LINE_INFO = {29,29,29,29,29,29,29,29,29,29,29};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE>\n<html lang=\"ru\">\n<head>\n\t<meta charset=\"UTF-8\">\n\t<title>Courses build</title>\n</head>\n<body>\n\n<form action=\"/courses\" method=\"post\">\n\n  <div>\n    <label>\n      Name\n      <input type=\"text\" required name=\"nAme\" />\n    </label>\n  </div>\n  \n  <div>\n    <label>\n      Description\n      <input type=\"textarea\" name=\"dEscription\" />\n    </label>\n  </div>\n  \n  \n  <input type=\"submit\" value=\"Create\" />\n</form>\n\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
