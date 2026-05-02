package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.User;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,11,11,11,12,12,12,13,13,22,22,24,24,24,25,25,25,26,26,26,27,27,27,29,29,34,34,34,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n<html lang=\"ru\">\n    <head>\n    \t<meta charset = \"UTF-8\">\n        <title>Hexlet</title>\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n    </head>    \n    <body>\n    \t");
		if (page.getFlash() != null) {
			jteOutput.writeContent("\n\t\t\t<div class=\"alert alert-success\">");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(page.getFlash());
			jteOutput.writeContent("</div>\n\t\t");
		}
		jteOutput.writeContent("\n\t\t<div>\n\t\t<table border = \"1\">\n\t\t\t<tr>\n\t\t\t\t<th>ID</th>\n\t\t\t\t<th>NAME</th>\n\t\t\t\t<th>EMAIL</th>\n\t\t\t\t<th>PASSWORD</th>\n\t\t\t</tr>\n\t\t\t");
		for (User user : page.getUsers()) {
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
		jteOutput.writeContent("\n\t\t</table>\n\t\t</div>\n\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js\"></script>\n    </body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
