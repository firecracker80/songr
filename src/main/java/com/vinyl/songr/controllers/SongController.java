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

    Song tempSong;

    @GetMapping("/song")
    public String getSong(Model s){
        List<Song> newSong = SongRepo.findAll();

        s.addAttribute("albums", newSong);
        return "songr";
    }

    @PostMapping("/song")
    public RedirectView addSongToAlbum(String title, Integer length, Integer trackNum, Long albumId){
        Albums albums = AlbumsRepo.getReferenceById(albumId);
        Song addNewSongs = new Song(title, length, trackNum, albumId);
        SongRepo.save(addNewSongs);
        addNewSongs.setAlbum(albums);
        return new RedirectView("/albums");
    }

}
