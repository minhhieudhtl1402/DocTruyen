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
    companion object {
        const val CATEGORY_THING = 1
        const val CATEGORY_JOKE = 2
        const val CATEGORY_TRAGEDY = 3
        const val CATEGORY_LOVE = 4
    }

    var topics: MutableList<Topic>
    var context: Context

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
            when (topic.id) {
                1 -> {
                    val intent = Intent(context, StoryActivity::class.java)
                    intent.putExtra("TYPE", TopicAdapter.CATEGORY_THING)
                    intent.putExtra("TOPIC", topic)
                    context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(context, StoryActivity::class.java)
                    intent.putExtra("TYPE", TopicAdapter.CATEGORY_JOKE)
                    intent.putExtra("TOPIC", topic)
                    context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(context, StoryActivity::class.java)
                    intent.putExtra("TYPE", TopicAdapter.CATEGORY_TRAGEDY)
                    intent.putExtra("TOPIC", topic)
                    context.startActivity(intent)
                }
                4 -> {
                    val intent = Intent(context, StoryActivity::class.java)
                    intent.putExtra("TYPE", CATEGORY_LOVE)
                    intent.putExtra("TOPIC", topic)
                    context.startActivity(intent)
                }

            }
        }
    }
}