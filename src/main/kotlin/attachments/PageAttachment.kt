package attachments

class PageAttachment(
    override val attachmentObject: Page?
): Attachment {
    override val type: String = "Page"

}