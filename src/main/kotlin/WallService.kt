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
            val newPost = post.copy(ownerId = postForEdit.ownerId, date = postForEdit.date)
            posts[index] = newPost
            return true
        }
        return false
    }

}