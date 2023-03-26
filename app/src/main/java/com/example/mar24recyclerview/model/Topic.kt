package com.example.mar24recyclerview.model

data class Topic(val id: Int, val name: String, val idImg: Int, val stories: MutableList<Story>) :
    java.io.Serializable {
}