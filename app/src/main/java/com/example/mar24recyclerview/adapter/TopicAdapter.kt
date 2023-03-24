package com.example.mar24recyclerview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.mar24recyclerview.JokeActivity
import com.example.mar24recyclerview.R
import com.example.mar24recyclerview.StoryActivity
import com.example.mar24recyclerview.model.Topic

class TopicAdapter : Adapter<TopicAdapter.TopicViewHolder> {
    var topics: MutableList<Topic>
    var context: Context? = null

    constructor(topics: MutableList<Topic>, context: Context) : super() {
        this.topics = topics
        this.context = context
    }

    class TopicViewHolder : RecyclerView.ViewHolder {
        val iv_img: ImageView
        val tv_name: TextView

        constructor(itemView: View) : super(itemView) {
            iv_img = itemView.findViewById(R.id.iv_img)
            tv_name = itemView.findViewById(R.id.tv_name)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
        return TopicViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        val topic = topics.get(position)
        holder.tv_name.setText(topic.name)
        holder.iv_img.setImageResource(topic.idImg)

        holder.itemView.setOnClickListener {
            when (holder.tv_name.text) {
                "Truyện suy ngẫm" -> {
                    val intent = Intent(context, StoryActivity::class.java)
                    context?.startActivity(intent)
                }
                "Truyện cười" -> {
                    val intent = Intent(context, JokeActivity::class.java)
                    context?.startActivity(intent)
                }

            }
        }
    }
}