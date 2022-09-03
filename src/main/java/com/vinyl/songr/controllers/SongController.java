package com.vinyl.songr.controllers;

import com.vinyl.songr.models.Albums;
import com.vinyl.songr.models.Song;
import com.vinyl.songr.repo.AlbumsRepo;
import com.vinyl.songr.repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepo SongRepo;
    @Autowired
    AlbumsRepo AlbumsRepo;

    @GetMapping("/song")
    public String getSong(Model s){
        List<Song> newSong = SongRepo.findAll();

        s.addAttribute("albums", newSong);
        return "songr";
    }

    @PostMapping("/new-song")
    public RedirectView addSongToAlbum(String title, Integer length, Integer trackNum, String album){
        Albums albums = AlbumsRepo.findByTitle(album);
        Song addNewSongs = new Song(title, length, trackNum, album);
        SongRepo.save(addNewSongs);
        return new RedirectView("/new-song");
    }
}
