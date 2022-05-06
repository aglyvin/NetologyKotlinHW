package attachments

class AlbumAttachment(
    override val attachmentObject: Album?
): Attachment {
    override val type: String = "Album"
}