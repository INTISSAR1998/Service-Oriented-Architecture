import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;

@Path("/bibliotheque")
public class Bibliotheque {
	static List<Livre> livres = new ArrayList<Livre>();

	@PUT
	@Consumes("application/xml")
	@Path("/livre")
	public String ajouterLivre(Livre livre) {
		if (livres.add(livre))
			return "Livre ajouté.";
		else
			return "Impossible d'ajouter le livre.";
	}

	@GET
	@Produces("application/xml")
	@Path("/livre")
	public List<Livre> listerLivres() {
		return livres;
	}

	@GET
	@Produces("application/xml")
	@Path("/livre/{isbn}")
	public Livre chercherLivre(@PathParam("isbn") String isbn) {
		Livre livre = null;
		for (Livre l : livres) {
			if (l.getIsbn().equals(isbn))
				livre = l;
		}
		return livre;
	}

	@POST
	@Consumes("application/xml")
	@Path("/livre/{isbn}")
	public String updateLivre(@PathParam("isbn") String isbn, Livre livre) {
		for (Livre l : livres) {
			if (l.getIsbn().equals(isbn)) {
				l.setIsbn(livre.getIsbn());
				l.setTitre(livre.getTitre());
				return "Livre modifié.";
			}
		}
		return "Impossible de modifier le livre.";
	}

	@DELETE
	@Consumes("application/xml")
	@Path("/livre/{isbn}")
	public String supprimerLivre(@PathParam("isbn") String isbn) {
		for (int i = 0; i < livres.size(); i++) {
			if (livres.get(i).getIsbn().equals(isbn)) {
				livres.remove(i);
				return "Livre supprimé.";
			}
		}
		return "Impossible de supprimer le livre.";
	}

}
