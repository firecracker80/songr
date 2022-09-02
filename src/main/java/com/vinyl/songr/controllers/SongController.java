package com.vinyl.songr.controllers;

import com.vinyl.songr.models.Song;
import com.vinyl.songr.repo.AlbumsRepo;
import com.vinyl.songr.repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepo songRepo;
    @Autowired
    AlbumsRepo albumsRepo;

    @GetMapping("/albums")
    public String getSong(Model s){
        List<Song> newSong = songRepo.
    }
}
