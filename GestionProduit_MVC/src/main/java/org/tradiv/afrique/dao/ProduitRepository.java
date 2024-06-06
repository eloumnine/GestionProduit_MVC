package org.tradiv.afrique.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tradiv.afrique.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
