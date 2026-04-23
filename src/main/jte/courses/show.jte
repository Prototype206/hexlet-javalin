<!-- src/main/jte/courses/show.jte -->
@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

<main>
	<p>${page.getCourse().getId()}</p>
    <h1>${page.getCourse().getName()}</h1>
    <p>${page.getCourse().getDescription()}</p>
</main>