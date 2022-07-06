package ru.netology

import ru.netology.attachments.Attachment

internal data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val thread: Thread? = null
) {
    var attachments = emptyArray<Attachment>()
    var parentsStack = emptyArray<Int>()

    internal fun addAttachment(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }

    internal fun addParent(parent: Int): Int {
        parentsStack += parent
        return parentsStack.last()
    }
}

internal data class Donut(
    val isDon: Boolean,
    val placeholder: String
)

internal data class Thread(
    val count: Int,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean
){
    var items = emptyArray<Comment>()

    internal fun addComment(comment: Comment): Comment {
        items += comment
        return items.last()
    }
}
