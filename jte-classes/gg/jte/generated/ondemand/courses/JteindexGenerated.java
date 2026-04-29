package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,6,6,9,9,9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,22,22,24,24,24,25,25,25,26,26,26,28,28,31,31,31,31,31,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p>Фильтры</p>\n\t\t<form action=\"/courses\" method=\"get\">\n\t\t\t<input type=\"search\" name=\"term\"");
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
				jteOutput.writeContent("\n\t\t</table>\n\t\t</div>\n\t\t");
			}
		}, page);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
