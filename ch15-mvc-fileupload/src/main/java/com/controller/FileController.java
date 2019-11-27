package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class FileController {
    //获取文件存放路径
    private final static String FILE_PATH = "G:/file";

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/file")
    public String file(@RequestParam(value = "myFile") MultipartFile myFile) {
        //获取文件名
        String path = myFile.getOriginalFilename();
        String file = FILE_PATH + File.separator + path;
        File file1 = new File(file);
        try {
            //把文件进行保存
            myFile.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "file";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> file(String filename) throws IOException {
        String path = FILE_PATH + File.separator + filename;
        File file = new File(path);

        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if (mediaType == null) {
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(mediaType));
        httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(inputStreamResource,httpHeaders, HttpStatus.OK);
    }

}
