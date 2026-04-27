package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,12,12,12,12,12,12,12,12,12,12,13,13,13,13,13,13,13,13,13,25,25,27,27,27,28,28,28,29,29,29,31,31,36,36,36,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n<html lang = \"ru\">\n    <head>\n    \t<meta charset = \"UTF-8\">\n        <title>Hexlet</title>\n    </head>\n    <body>\n    <p>Фильтры</p>\n\t\t<form action=\"/courses\" method=\"get\">\n\t\t\t<input type=\"search\" name=\"term\"");
		var __jte_html_attribute_0 = page.getTerm();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\n\t\t\t<input type = \"search\", name=\"filter\",");
		var __jte_html_attribute_1 = page.getFilter();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\n\t\t\t<input type=\"submit\" value=\"Search\" />\n\t\t</form>\n\t\t\n\t\t<p>Курсы</p>\n\t\t<div>\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>DESCRIPTION</th>\n\t\t\t</tr>\n\t\t\t");
		for (Course course : page.getCourses()) {
			jteOutput.writeContent("\n\t\t\t<tr>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(course.getId());
			jteOutput.writeContent("</td>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(course.getName());
			jteOutput.writeContent("</td>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(course.getDescription());
			jteOutput.writeContent("</td>\n\t\t\t</tr>\n\t\t\t");
		}
		jteOutput.writeContent("\n\t\t</table>\n\t\t</div>\n\t\t\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
