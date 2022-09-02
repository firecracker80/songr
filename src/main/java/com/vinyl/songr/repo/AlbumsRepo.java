package com.vinyl.songr.repo;

import com.vinyl.songr.models.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepo extends JpaRepository<Albums, Long> {
    public Albums findByTitle(String title);
    public Albums findByArtist(String artist);

}
