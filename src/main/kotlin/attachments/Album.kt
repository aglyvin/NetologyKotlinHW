package attachments

data class Album(
    val thumb: Any? = null,
    val ownerId: Int = 1,
    val title: String,
    val description: String,
    val created: Int,
    val updated: Int,
    val size: Int
): MediaObject()