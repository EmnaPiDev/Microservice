package com.example.media;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MediaService {
    MediaRepository mediaRepository;
    public Media save(Media media) {
        return mediaRepository.save(media);
    }

    public void deleteById(long id) {
        mediaRepository.deleteById(id);
    }

    public List<Media> retrieveAllMedias() {
        return mediaRepository.findAll();
    }
}
