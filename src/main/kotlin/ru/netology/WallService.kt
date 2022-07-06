package ru.netology

import ru.netology.exceptions.PostNotFoundException

internal class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 1
    private var comments = emptyArray<Comment>()

    internal fun showPosts() {
        for (post in posts){
            println(post)
        }
    }

    internal fun add(post: Post): Post {
        posts += post.copy(id = uniqueId)
        uniqueId++
        return posts.last()
    }

    internal fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id) {
                posts[index] = value.copy(
                    id = uniqueId,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId
                )
                uniqueId++
                return true
            }
        }
        return false
    }

    internal fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException(postId)
    }
}
