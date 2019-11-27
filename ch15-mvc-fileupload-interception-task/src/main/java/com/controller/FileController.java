package com.controller;

import com.sun.xml.internal.bind.v2.runtime.output.Encoded;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class FileController {
    private final static String FILE_PATH = "G:/file";

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/index3")
    public String index3() {
        return "index3";
    }

    @RequestMapping("/login")
    public String index(String username, String password, HttpSession session) {
        if ("admin".equals(username) && "123".equals(password)) {
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            return "forward:index";
        } else {
            return "forward:index3";
        }
    }

    @PostMapping("/file")
    public String index(@RequestParam(value = "myFile") MultipartFile myFile) {
        String originalFilename = myFile.getOriginalFilename();
        String file = FILE_PATH + File.separator + originalFilename;
        File file1 = new File(file);
        try {
            myFile.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index2";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamResource> index(String filename) throws IOException {
        String path = FILE_PATH + File.separator + filename;
        File file = new File(path);

        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if (mediaType == null) {
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(mediaType));

        httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource inputStreamSource = new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(inputStreamSource,httpHeaders, HttpStatus.OK);

    }

}
