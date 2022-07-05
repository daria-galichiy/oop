package ru.netology

internal class CopyHistory {
    private var copyHistory = emptyArray<Post>()

    internal fun add(post: Post): Post {
        copyHistory += post
        return copyHistory.last()
    }
}
