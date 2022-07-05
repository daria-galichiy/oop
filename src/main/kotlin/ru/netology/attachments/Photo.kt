package ru.netology.attachments

internal data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val width: Int,
    val height: Int
) {
    private var sizes = emptyArray<Sizes>()
    internal fun add(size: Sizes): Sizes {
        sizes += size
        return sizes.last()
    }
}

internal data class Sizes(
    val type: String,
    val url: String,
    val width: Int,
    val height: Int
)
