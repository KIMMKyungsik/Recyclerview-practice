package com.shoppi.recyclerview_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatRecyclerAdapter(
    val chatList : MutableList<Chat>,
    val inflater: LayoutInflater



):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView
        init {
            textView = itemView.findViewById<TextView>(R.id.chatTextRight)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = inflater.inflate(R.layout.item_right,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = chatList.get(position)
        (holder as ViewHolder).textView.text = chat.message

    }

    override fun getItemCount(): Int {

        return chatList.size

    }


}
