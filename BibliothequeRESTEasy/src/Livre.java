import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
	public class Livre {
		private String isbn;
		private String titre;
		public Livre() {
		}
		
		public Livre(String isbn, String titre) {
			super();
			this.isbn = isbn;
			this.titre = titre;
		}
		
		public String getIsbn() {
			return isbn;
		}
		
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		public String getTitre() {
			return titre;
		}
		
		public void setTitre(String titre) {
			this.titre = titre;
		}
}
