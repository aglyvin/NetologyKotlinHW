package attachments

class VideoAttachment(
    override val attachmentObject: Video?
): Attachment {
    override val type: String = "Video"
}