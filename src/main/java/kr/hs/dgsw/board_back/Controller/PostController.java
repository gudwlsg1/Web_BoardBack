package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/api/posts/{id}")
    public Post getPost(@PathVariable Long id){
        return this.postService.findById(id);
    }

    @GetMapping(value = "/api/posts/userId/{id}")
    public List getPostByUserId(@PathVariable Long id){
        return this.postService.findByUserId(id);
    }

    @GetMapping(value = "/api/posts")
    public List posts(){
        return this.postService.findAll();
    }

    @PostMapping(value = "/api/posts")
    public Long addPost(@RequestBody Post post){
        return this.postService.add(post);
    }

    @PostMapping(value = "/api/posts/hashmap")
    public int addPostByHashMap(@RequestBody Post post){
        return this.postService.addWithHashmap(post);
    }

    @PutMapping(value = "/api/posts")
    public int updatePost(@RequestBody Post post){
        return this.postService.modify(post);
    }

    @DeleteMapping(value = "/api/posts/{id}")
    public int deletePost(@PathVariable Long id){
        return this.postService.deleteById(id);
    }
}
