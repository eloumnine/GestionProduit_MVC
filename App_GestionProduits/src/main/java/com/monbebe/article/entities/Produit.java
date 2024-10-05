package com.monbebe.article.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Variables
	 */
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
    private String code;
	@Column(nullable = false)
    private String name;
	@Column(nullable = true)
    private String description;
	@Column(nullable = true)
    private String image;
	@Column(nullable = false)
    private String category;
	@Column(nullable = false)
    private double price;
	@Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String internalReference;
    @Column(nullable = false)
    private int shellId;
    @Column(nullable = false)
    private String inventoryStatus;
    @Column(nullable = false)
    private int rating;
    @Column(nullable = false)
    private int createdAt;
    @Column(nullable = false)
    private int updatedAt;

}
