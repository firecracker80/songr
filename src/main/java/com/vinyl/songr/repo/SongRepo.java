package com.vinyl.songr.repo;

import com.vinyl.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Long> {
    public Song findByTitle(String title);
}
