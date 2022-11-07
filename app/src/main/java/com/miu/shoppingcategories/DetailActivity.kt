package com.miu.shoppingcategories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var myimage=findViewById<ImageView>(R.id.imageShopView)
        var myText=findViewById<TextView>(R.id.details)

        val bundle: Bundle? = intent.extras
        val resId: Int = intent.extras!!.getInt("image")

        var strDetails: String? = intent.getStringExtra("text")
        myimage.setImageResource(resId)
        myText.text= strDetails
    }
}