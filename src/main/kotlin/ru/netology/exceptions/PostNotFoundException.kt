package ru.netology.exceptions

class PostNotFoundException(postId: Int): RuntimeException("Post with id $postId not found")
