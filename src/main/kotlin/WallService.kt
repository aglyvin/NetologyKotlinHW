class WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Int = 1

    fun add(post: Post): Post {
        posts += post.copy(id = nextId++)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postForEdit) in posts.withIndex()){
            if (postForEdit.id != post.id) continue
            posts[index] = post.copy(ownerId = postForEdit.ownerId, date = postForEdit.date)
            return true
        }
        return false
    }

}