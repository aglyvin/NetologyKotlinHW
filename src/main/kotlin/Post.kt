data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "Lorem Ipsum...",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean,
    val comments: Comments?,
    val copyRight: CopyRight?,
    val likes: Int = 0,
    val reposts: Reposts?,
    val views: Views?,
    val postType: String,
    val signerId: Int = 0,
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut?,
    val postPonedId: Int = 0
) {

}