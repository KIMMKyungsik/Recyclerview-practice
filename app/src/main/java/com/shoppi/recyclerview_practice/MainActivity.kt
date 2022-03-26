package com.shoppi.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chatList = mutableListOf<Chat>()
        chatList.add(Chat("안녕하세요",false))
        chatList.add(Chat("안녕하세요",false))
        chatList.add(Chat("안녕하세요",false))
        chatList.add(Chat("안녕하세요",true))
        chatList.add(Chat("안녕하세요",false))
        chatList.add(Chat("안녕하세요",true))
        chatList.add(Chat("안녕하세요",false))
        chatList.add(Chat("안녕하세요",true))
        chatList.add(Chat("안녕하세요",false))

        with(findViewById<RecyclerView>(R.id.chatRecyclerView)){
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter= ChatRecyclerAdapter(
                chatList = chatList,
                inflater = LayoutInflater.from(this@MainActivity)

            )

        }

    }
}

class Chat(val message:String, val is_right: Boolean)