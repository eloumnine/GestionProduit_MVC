package org.tradiv.afrique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tradiv.afrique.dao.ProduitRepository;
import org.tradiv.afrique.entities.Produit;

@SpringBootApplication
public class GestionProduitMvcApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(GestionProduitMvcApplication.class, args);
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("Peinture Décoration Intérieur", 650.00, 750));
		produitRepository.save(new Produit("Installation Camera Surveillance", 200.00, 35));
		produitRepository.save(new Produit("Pose Carrelage Parquet", 300.00, 750));
		produitRepository.save(new Produit("Travaux de Menuiserie", 1050.00, 15));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getService()));
		
	}

}
