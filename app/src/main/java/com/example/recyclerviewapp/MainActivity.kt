package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        val arr = arrayOf("# Bhikhabhai",
                          "# Parshottambhai",
                          "# Junjabhai",
                          "# Oghadbhai",
                          "# Ghelabhai",
                          "# Kalubhai",
                          "# Shamjibhai",
                          "# Manjibhai",
                          "# Rameshbhai",
                          "# Bhavesh bhai",
                          "# Dilip bhai",
                          "# Usha ben",
                           "# Nilesh bhai",
                            "# Alpa ben",
                            "# Mahesh bhai",
                            "# Shilpa ben",
                            "# Jalpa ben",
                            "# Ankit bhai",
                            "# Tushar bhai",
                            "# Nikita ben",
                            "# Namrata ben",
                            "# Priyal ben",
                            "# Mansi ben",
                            "# Milan bhai",
                            "# Avani ben",
                            "# Riddham bhai",
                            "# Aryan bhai",
                            "# Vedant bhai",
                            "# Diyan bhai",
                            "# Jay bhai",
                            "# Jeet bhai",
                            "# Shreya",
                            "# Dhyana","")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        /* Layout Manager is responsible for measuring and positioning item views within a RecyclerView
        as well as determining the policy for when to recycle item views that are no longer visible to the user
         */
        recyclerView.layoutManager = LinearLayoutManager(this)
        val ad = CustomAdapter(arr)
        recyclerView.adapter = ad
    }
}