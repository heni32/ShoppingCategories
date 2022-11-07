package com.miu.shoppingcategories

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

//        recyclerview.addOnItemTouchListener(
//           (context, recyclerview, object : AdapterView.OnItemClickListener()-> {
//                fun onItemClick(view: View?, position: Int) {
//                    // do whatever
//                }
//
//                fun onLongItemClick(view: View?, position: Int) {
//                    // do whatever
//                }
//            })
//        )

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..2) {
            data.add(ItemsViewModel(R.drawable.pic1, "This guide walks you through the process  " + i))
            data.add(ItemsViewModel(R.drawable.pic2, "You will build a RESTful web service with Spring Webflux  " + i))
            data.add(ItemsViewModel(R.drawable.pic3, "Choose either Gradle or Maven and the language " + i))
            data.add(ItemsViewModel(R.drawable.pic4, "If your IDE has the Spring Initializr integration " + i))
            data.add(ItemsViewModel(R.drawable.pic5, "Click Dependencies and select Spring Reactive Web. " + i))
            data.add(ItemsViewModel(R.drawable.pic6, "Download the resulting ZIP file, which is an archive " + i))

        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}
