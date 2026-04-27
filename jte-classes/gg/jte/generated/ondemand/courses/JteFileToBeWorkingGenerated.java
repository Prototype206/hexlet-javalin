package gg.jte.generated.ondemand.courses;
import org.example.hexlet.NamedRoutes;
import java.util.List;
import org.example.hexlet.model.Course;
public final class JteFileToBeWorkingGenerated {
	public static final String JTE_NAME = "courses/FileToBeWorking.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,7,7,9,9,11,11,13,13,20,20,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,26,26,28,28,29,29,29,29,29,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<Course> courses) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\t<h1>List of courses</h1>\n\t");
				if (courses.isEmpty()) {
					jteOutput.writeContent("\n    \t<p>There is no course here yet</p>\n\t");
				} else {
					jteOutput.writeContent("\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>DESCRIPTION</th>\n\t\t\t</tr>\n\t\t\t");
					for (Course course : courses) {
						jteOutput.writeContent("\n\t\t\t\t<tr>\n\t\t\t\t\t<td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(course.getId());
						jteOutput.writeContent("</td>\n\t\t\t\t\t<td><a");
						var __jte_html_attribute_0 = NamedRoutes.coursePath(course.getId());
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(course.getName());
						jteOutput.writeContent("</a></td>\n\t\t\t\t\t<td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(course.getDescription());
						jteOutput.writeContent("</td>\n\t\t\t\t</tr>\n\t\t\t");
					}
					jteOutput.writeContent("\n\t\t</table>\n\t");
				}
				jteOutput.writeContent("\n\t");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<Course> courses = (List<Course>)params.get("courses");
		render(jteOutput, jteHtmlInterceptor, courses);
	}
}
