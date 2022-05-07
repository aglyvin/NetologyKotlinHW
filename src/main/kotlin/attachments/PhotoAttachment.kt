package attachments

class PhotoAttachment(
    override val attachmentObject: Photo?
): Attachment {
    override val type: String = "Photo"
}