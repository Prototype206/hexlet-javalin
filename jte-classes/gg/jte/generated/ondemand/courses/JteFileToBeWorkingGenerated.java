package gg.jte.generated.ondemand.courses;
import java.util.List;
import org.example.hexlet.model.Course;
public final class JteFileToBeWorkingGenerated {
	public static final String JTE_NAME = "courses/FileToBeWorking.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,6,6,8,8,15,15,17,17,17,17,17,17,17,18,18,18,19,19,19,21,21,23,23,23,23,23,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<Course> courses) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>DESCRIPTION</th>\n\t\t\t</tr>\n\t\t\t");
				for (Course course : courses) {
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
		List<Course> courses = (List<Course>)params.get("courses");
		render(jteOutput, jteHtmlInterceptor, courses);
	}
}
