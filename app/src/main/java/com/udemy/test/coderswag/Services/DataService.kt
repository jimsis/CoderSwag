package com.udemy.test.coderswag.Services

import com.udemy.test.coderswag.Model.Category
import com.udemy.test.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie ", "$18", "hat1"),
            Product("Devslopes Hat Black", "$18", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4"),
            Product("Devslopes Graphic Beanie ", "$18", "hat1"),
            Product("Devslopes Hat Black", "$18", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey ", "$18", "hoodie1"),
            Product("Devslopes Hoodie Black", "$16", "hoodie2"),
            Product("Devslopes Hoodie White", "$28", "hoodie3"),
            Product("Devslopes Hoodie Snapback", "$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Grey ", "$18", "shirt1"),
            Product("Devslopes Shirt Black", "$16", "shirt2"),
            Product("Devslopes Shirt White", "$28", "shirt3"),
            Product("Devslopes Shirt Red", "$32", "shirt4"),
            Product("Devslopes Shirt Blue", "$32", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        when (category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }

}