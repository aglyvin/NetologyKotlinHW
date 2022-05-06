package attachments

interface Attachment {
    val type: String
    val attachmentObject: MediaObject?
}