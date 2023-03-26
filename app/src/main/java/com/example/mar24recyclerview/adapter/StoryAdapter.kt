package com.example.ma

import android.view.View


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mar24recyclerview.R
import com.example.mar24recyclerview.model.Topic

class StoryAdapter(_topic: Topic, _context: Context) :
    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {
    private var topic: Topic = _topic
    private var context: Context = _context

    class StoryViewHolder : ViewHolder {
        var tv_name: TextView
        var tv_detail: TextView

        constructor(itemView: View) : super(itemView) {
            tv_name = itemView.findViewById(R.id.tv_story_name)
            tv_detail = itemView.findViewById(R.id.tv_detail)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return topic.stories.size
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val story = topic.stories.get(position)
        holder.tv_name.setText(story.title)
        holder.tv_detail.setText(story.content)
    }

}