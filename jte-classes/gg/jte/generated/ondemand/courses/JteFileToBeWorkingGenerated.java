package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
import java.util.List;
import org.example.hexlet.model.Course;
public final class JteFileToBeWorkingGenerated {
	public static final String JTE_NAME = "courses/FileToBeWorking.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,7,7,9,9,10,10,10,17,17,19,19,19,19,19,19,19,20,20,20,21,21,21,23,23,25,25,25,25,25,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\t\t<h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getHeader());
				jteOutput.writeContent("</h1>\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>DESCRIPTION</th>\n\t\t\t</tr>\n\t\t\t");
				for (Course course : page.getCourses()) {
					jteOutput.writeContent("\n\t\t\t\t<tr>\n\t\t\t\t\t<td><a href = \"/courses/");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(course.getId());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(course.getId());
					jteOutput.writeContent("</a></td>\n\t\t\t\t\t<td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(course.getName());
					jteOutput.writeContent("</td>\n\t\t\t\t\t<td>");
					jteOutput.setContext("td", null);
					jteOutput.writeUserContent(course.getDescription());
					jteOutput.writeContent("</td>\n\t\t\t\t</tr>\n\t\t\t");
				}
				jteOutput.writeContent("\n\t\t</table>\n\t");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
