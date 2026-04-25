package gg.jte.generated.ondemand.courses;
import org.example.hexlet.model.Course;
public final class JteshowGenerated {
	public static final String JTE_NAME = "courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,5,5,13,13,13,14,14,14,15,15,15,18,18,18,19,19,19,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Course page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\t\t<table border=\"1\">\n\t\t<tr>\n\t\t\t<th>ID</th>\n\t\t\t<th>NAME</th>\n\t\t\t<th>DESCRIPTION</th>\n\t\t</tr>\n\t\t<tr>\n\t\t\t<td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getId());
				jteOutput.writeContent("</td>\n\t\t\t<td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getName());
				jteOutput.writeContent("</td>\n\t\t\t<td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getDescription());
				jteOutput.writeContent("</td>\n\t\t</tr>\t\n\t\t</table>\n\t");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Course page = (Course)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
