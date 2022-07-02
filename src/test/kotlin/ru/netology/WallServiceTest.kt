package ru.netology

import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add_post_successful() {
        val service = WallService()

        val addedPost = service.add(
            Post(
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
        )

        assertNotEquals(0, addedPost.id)
    }

    @Test
    fun update_existing_wall_service_successful() {
        val service = WallService()
        service.add(
            Post(
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
        )

        val updateResult = service.update(
            Post(
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
        )

        assertTrue(updateResult)
    }

    @Test
    fun update_existing_wall_service_unsuccessful() {
        val service = WallService()
        service.add(
            Post(
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
        )

        val updateResult = service.update(
            Post(
                id = 0,
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
        )

        assertFalse(updateResult)
    }
}