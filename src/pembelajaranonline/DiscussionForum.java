/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembelajaranonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
class DiscussionForum {
    private List<String> posts;

    public DiscussionForum() {
        this.posts = new ArrayList<>();
    }

    public void addPost(String post) {
        posts.add(post);
    }

    public List<String> getPosts() {
        return posts;
    }

}