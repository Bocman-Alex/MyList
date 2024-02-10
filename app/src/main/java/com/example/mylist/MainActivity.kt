package com.example.mylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mylist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private val adapter = TitleAdapter()
    private var index=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private  fun init()= with(binding){
        rcView.layoutManager=LinearLayoutManager(this@MainActivity)
        rcView.adapter=adapter
        buttonAdd.setOnClickListener {
            val title = TitleElementClass(index,"anime $index",index)
            adapter.addTitle(title)
            index++
//            Toast.makeText(applicationContext, "alsjdl", Toast.LENGTH_SHORT).show()
        }
    }
}