package ru.netology

fun main() {
    val post = Post(
        id = 0,
        ownerId = 465,
        fromId = 789,
        createdBy = 1011,
        date = 1656769296,
        text = "Test post",
        replyOwnerId = 1213,
        replyPostId = 1415,
        friendsOnly = false,
        comments = Comments(3, true, true, true, true),
        copyright = "smth",
        likes = Likes(25, true, true, true),
        reposts = Reposts(5, false),
        views = Views(32),
        postType = "post",
        signerId = 1617,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 1819
    )
    val updatedPost = Post(
        id = 1,
        ownerId = 0,
        fromId = 2021,
        createdBy = 2223,
        date = 12345,
        text = "Updated post",
        replyOwnerId = 2425,
        replyPostId = 2627,
        friendsOnly = false,
        comments = Comments(7, true, false, true, true),
        copyright = "smth else",
        likes = Likes(250, true, true, true),
        reposts = Reposts(50, false),
        views = Views(3200),
        postType = "post",
        signerId = 2829,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 3031
    )

    val wall = WallService()
//    val addedPost = WallService.add(post)
    val addedPost = wall.add(post)
    println(addedPost)
//    println(WallService.update(updatedPost))
    println(wall.update(updatedPost))
    wall.showPosts()

    val comment = Comment(1, 6555, 1657136958, "Brilliant!")
    println(wall.createComment(2, comment))
}
