package attachments

data class Audio(
    val albumId: Int = 1,
    val ownerId: Int = 1,
    val userId: Int = 1
) : MediaObject()