package com.wised.post.dtos;
import com.wised.post.enums.PostType;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestDTO {

    private String docTitle;
    private List<MultipartFile> files;
    private PostType type;
    private String description;
    private List<Integer> userMentionedIds;
}