package com.vinyl.songr.controllers;


import com.vinyl.songr.models.Albums;
import com.vinyl.songr.repo.AlbumsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumsRepo AlbumsRepo;
    @GetMapping("/albums")
     public String getAlbum(Model a) {
        List<Albums> newAlbums = AlbumsRepo.findAll();
        a.addAttribute("albums", newAlbums);
        return "songr";
    }

    @PostMapping("/albums")
    public RedirectView createAlbums(String title, String artist, Integer songCount, Integer length, String imgUrl){
        Albums newAlbum = new Albums(title, artist, songCount,length, imgUrl);
//        SongController songs = new SongController();
//        if()
        AlbumsRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
