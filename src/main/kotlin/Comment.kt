data class Comment(
    val id: Int,
    val fromId: Int,
    val postId: Int,
    val date: Int,
    val text: String,
    val donut: Donut?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Any?,
    val parentsStack: Any?,
    val thread: Any?
)