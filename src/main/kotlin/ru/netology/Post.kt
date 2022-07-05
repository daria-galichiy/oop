package ru.netology

import ru.netology.attachments.Attachment

internal data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val postSource: PostSource? = null,
    val geo: Geo? = null,
    val signerId: Int,
    val copyHistory: CopyHistory? = null,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
){
    var attachments = emptyArray<Attachment>()

    internal fun addAttachment(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }
}
