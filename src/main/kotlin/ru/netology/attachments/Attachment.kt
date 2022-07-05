package ru.netology.attachments

internal interface Attachment {
    val type: String
}

internal class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment

internal class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

internal class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment

internal class NoteAttachment(
    override val type: String = "note",
    val note: Note
) : Attachment

internal class StickerAttachment(
    override val type: String = "sticker",
    val sticker: Sticker
) : Attachment
