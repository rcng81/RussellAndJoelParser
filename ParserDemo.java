public class ParserDemo {

	public static void main(String[] args) {

		try {
		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\Rcng8\\\\OneDrive\\\\Documents\\\\Pace 2024 Fall\\\\CS361\\\\Homework\\\\HW4\\\\Code\\\\parser.txt");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		
	} catch (RuntimeException e) {
		System.err.println(e.getMessage());
	}

	}

}
