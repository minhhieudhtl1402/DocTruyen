package com.example.mar24recyclerview

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ma.StoryAdapter
import com.example.mar24recyclerview.model.Topic

class StoryActivity : AppCompatActivity() {
    private lateinit var rc_story: RecyclerView
    private lateinit var tv_category: TextView

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        tv_category = findViewById(R.id.tv_category)

        val TYPE = intent.getIntExtra("TYPE", 0)
        val topic = intent.getSerializableExtra("TOPIC") as Topic

        tv_category.setText(topic.name)

        rc_story = findViewById(R.id.rc_story)

        val adapter = StoryAdapter(topic, this)
        rc_story.adapter = adapter
        rc_story.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}