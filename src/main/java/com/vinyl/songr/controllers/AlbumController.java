package com.vinyl.songr.controllers;


import com.vinyl.songr.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/album")
public class AlbumController {
    @GetMapping("/albums")
     public String getAlbum(String album, Model a) {
        Albums MarcAnthony = new Albums("Marc Anthony","Marc Anthony", 10, 252, "https://upload.wikimedia.org/wikipedia/en/thumb/c/c6/3.0_%28Marc_Anthony_album_-_cover_art%29.jpg/220px-3.0_%28Marc_Anthony_album_-_cover_art%29.jpg" );
        Albums MercyMe = new Albums("test", "test", 8, 100, "none" );
        ArrayList<Albums> newAlbums = new ArrayList<>();
        newAlbums.add(MarcAnthony);
        newAlbums.add(MercyMe);

        a.addAttribute("albums", newAlbums);
//        Albums LaurenDaigle = new Albums();
        return "songr";
    }
}
