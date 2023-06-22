package textAnalyzer;

public class maintext {
	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.ArrayList;


	public class TextAnalyzer {
		File TheRavenPoemWithHTMLTags;
		TextAnalyzer(File TheRavenPoemWithHTMLTags)
		{
			this.TheRavenPoemWithHTMLTags = TheRavenPoemWithHTMLTags;
		}
		public ArrayList<String> search(int n) throws IOException{
			ArrayList<String> result = new ArrayList<String>();
			ArrayList<String> wholeFile = new ArrayList<String>();

			Path file = Paths.get("C:\\Users\\swann\\Downloads\\TheRavenPoemWithHTMLTags.txt");
			wholeFile = (ArrayList<String>) Files.readAllLines(file);

			
		}


	}

