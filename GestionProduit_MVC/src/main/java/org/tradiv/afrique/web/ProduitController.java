package org.tradiv.afrique.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tradiv.afrique.dao.ProduitRepository;
import org.tradiv.afrique.entities.Produit;

@Controller
public class ProduitController {

	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value = "/index")
	public String produit(Model model) {
		List<Produit> produits = produitRepository.findAll();
		model.addAttribute("listProduits",produits);
		return "produits";
	}
}
