package kr.hs.dgsw.board_back.Service;

import kr.hs.dgsw.board_back.Domain.Post;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

public interface PostService {
    List<Post> findAll();
    int deleteById(Long id);
    Long add(Post post);
    int modify(Post post);
    Post findById(Long id);
    List findByUserId(@Param("userId") Long userId);
    int addWithHashmap(Post post);
}
