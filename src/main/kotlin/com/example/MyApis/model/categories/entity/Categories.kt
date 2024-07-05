package com.example.MyApis.model.categories.entity

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "categories_table")
data class Categories(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id_categories: Int,
    @Column(nullable = false)
    var category_name: String,
    @Column(nullable = false, unique = true)
    val urlSlug: String,


   // @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "parent_cat_id")
  //  val parentCategory: Locale.Category? = null,
)