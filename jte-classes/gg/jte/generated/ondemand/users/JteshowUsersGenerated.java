package gg.jte.generated.ondemand.users;
import java.util.List;
import org.example.hexlet.model.User;
public final class JteshowUsersGenerated {
	public static final String JTE_NAME = "users/showUsers.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,18,18,18,20,20,20,21,21,21,22,22,22,23,23,23,25,25,30,30,30,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<User> users) {
		jteOutput.writeContent("\n<html>\n    <head>\n        <title>Hexlet</title>\n    </head>\n    <body>\n\t\t\n\t\t<div>\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>EMAIL</th>\n\t\t\t\t<th>PASSWORD</th>\n\t\t\t</tr>\n\t\t\t");
		for (User user : users) {
			jteOutput.writeContent("\n\t\t\t<tr>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(user.getId());
			jteOutput.writeContent("</td>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(user.getName());
			jteOutput.writeContent("</td>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(user.getEmail());
			jteOutput.writeContent("</td>\n\t\t\t\t<td>");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(user.getPassword());
			jteOutput.writeContent("</td>\n\t\t\t</tr>\n\t\t\t");
		}
		jteOutput.writeContent("\n\t\t</table>\n\t\t</div>\n\t\t\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<User> users = (List<User>)params.get("users");
		render(jteOutput, jteHtmlInterceptor, users);
	}
}
