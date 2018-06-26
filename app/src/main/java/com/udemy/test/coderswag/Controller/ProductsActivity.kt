package com.udemy.test.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.udemy.test.coderswag.R
import com.udemy.test.coderswag.Utililities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        println(categoryType)



    }
}
