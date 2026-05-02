package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.BuildUserPage;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,11,11,11,12,12,12,13,13,15,15,17,17,18,18,19,19,19,20,20,21,21,23,23,30,30,30,30,30,30,30,30,30,37,37,37,37,37,37,37,37,37,44,44,44,44,44,44,44,44,44,59,59,59,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildUserPage page) {
		jteOutput.writeContent("\n<!DOCTYPE>\n<html lang=\"ru\">\n<head>\n\t<meta charset=\"UTF-8\">\n\t<title>title</title>\n\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n</head>\n<body>\n\t");
		if (page.getFlash() != null) {
			jteOutput.writeContent("\n\t\t<div class=\"alert alert-danger\">");
			jteOutput.setContext("div", null);
			jteOutput.writeUserContent(page.getFlash());
			jteOutput.writeContent("</div>\n\t");
		}
		jteOutput.writeContent("\n\n\t");
		if (page.getErrors() != null) {
			jteOutput.writeContent("\n\t    <ul>\n\t        ");
			for (var validator : page.getErrors().values()) {
				jteOutput.writeContent("\n\t            ");
				for (var error : validator) {
					jteOutput.writeContent("\n\t                <li>");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(error.getMessage());
					jteOutput.writeContent("</li>\n\t            ");
				}
				jteOutput.writeContent("\n\t        ");
			}
			jteOutput.writeContent("\n\t    </ul>\n\t");
		}
		jteOutput.writeContent("\n\t\n\t<form action=\"/users\" method=\"post\">\n\t\n\t  <div>\n\t    <label>\n\t      Name\n\t      <input type=\"text\" name=\"name\"");
		var __jte_html_attribute_0 = page.getName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\n\t    </label>\n\t  </div>\n\t  \n\t  <div>\n\t    <label>\n\t      Email\n\t      <input type=\"email\" required name=\"email\"");
		var __jte_html_attribute_1 = page.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\n\t    </label>\n\t  </div>\n\t  \n\t  <div>\n\t    <label>\n\t      Password\n\t      <input type=\"password\" required name=\"password\"");
		var __jte_html_attribute_2 = page.getPassword();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\n\t    </label>\n\t  </div>\n\t  \n\t  <div>\n\t    <label>\n\t      Password confirmation\n\t      <input type=\"password\" required name=\"passwordConfirmation\" />\n\t    </label>\n\t  </div>\n\t  \n\t  <input type=\"submit\" value=\"Register\" />\n\t</form>\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildUserPage page = (BuildUserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
