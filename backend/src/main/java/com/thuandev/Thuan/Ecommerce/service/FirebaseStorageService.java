package com.thuandev.Thuan.Ecommerce.service;

import com.google.firebase.cloud.StorageClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.UUID;

@Service
public class FirebaseStorageService {

    public String uploadImage(MultipartFile file) {
        try {
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            InputStream inputStream = file.getInputStream();

            StorageClient.getInstance().bucket().create(fileName, inputStream, file.getContentType());

            // Trả về URL truy cập công khai (nếu bạn cho phép đọc public)
            return "https://firebasestorage.googleapis.com/v0/b/"
                    + StorageClient.getInstance().bucket().getName()
                    + "/o/" + fileName.replaceAll("/", "%2F")
                    + "?alt=media";

        } catch (Exception e) {
            throw new RuntimeException("Upload failed", e);
        }
    }
}
