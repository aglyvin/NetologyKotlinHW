package attachments

class AudioAttachment(
    override val attachmentObject: Audio?
): Attachment {
    override val type: String = "Audio"
}