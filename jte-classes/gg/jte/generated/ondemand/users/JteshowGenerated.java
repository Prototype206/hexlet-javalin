package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UserPage;
import org.example.hexlet.model.User;
public final class JteshowGenerated {
	public static final String JTE_NAME = "users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,19,19,19,19,20,20,20,21,21,21,22,22,22,28,28,28,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\n<html>\n    <head>\n        <title>Hexlet</title>\n    </head>\n    <body>\n\t\t\n\t\t<div>\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>EMAIL</th>\n\t\t\t\t<th>PASSWORD</th>\n\t\t\t</tr>\n\t\t\t<tr>\n\t\t\t\t<td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getUser().getId());
		jteOutput.writeContent("</td>\n\t\t\t\t<td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getUser().getName());
		jteOutput.writeContent("</td>\n\t\t\t\t<td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getUser().getEmail());
		jteOutput.writeContent("</td>\n\t\t\t\t<td>");
		jteOutput.setContext("td", null);
		jteOutput.writeUserContent(page.getUser().getPassword());
		jteOutput.writeContent("</td>\n\t\t\t</tr>\n\t\t</table>\n\t\t</div>\n\t\t\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
