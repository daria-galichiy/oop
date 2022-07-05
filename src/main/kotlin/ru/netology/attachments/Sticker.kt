package ru.netology.attachments

internal data class Sticker(
    val productId: Int,
    val stickerId: Int
) {
    private var images = emptyArray<StickerImg>()
    private var imagesWithBackground = emptyArray<StickerImgWithBackground>()

    internal fun addImg(img: StickerImg): StickerImg {
        images += img
        return images.last()
    }

    internal fun addImgWithBackground(img: StickerImgWithBackground): StickerImgWithBackground {
        imagesWithBackground += img
        return imagesWithBackground.last()
    }
}

internal data class StickerImg(
    val url: String,
    val width: Int,
    val height: Int
)

internal data class StickerImgWithBackground(
    val url: String,
    val width: Int,
    val height: Int
)
